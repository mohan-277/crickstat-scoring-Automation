import enity.*;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class CricketMatchSimulator {

    public static void main(String[] args) throws InterruptedException {
        // Initialize teams
        Team teamA = new Team("Team A");
        Team teamB = new Team("Team B");

        // Initialize players
        initializePlayers(teamA, teamB);

        // Initialize match
        CricketMatch match = new CricketMatch(teamA, teamB, "T20");

        // Simulate the match
        simulateMatch(match);
    }

    private static void initializePlayers(Team teamA, Team teamB) {
        for (int i = 1; i <= 5; i++) {
            teamA.addPlayer(new Player("Player A" + i, LocalDate.of(1990, 1, 1), "Batsman", "Male", "Country A"));
            teamA.addPlayer(new Player("Player A" + (i + 5), LocalDate.of(1990, 1, 1), "Bowler", "Male", "Country A"));
            teamB.addPlayer(new Player("Player B" + i, LocalDate.of(1990, 1, 1), "Batsman", "Male", "Country B"));
            teamB.addPlayer(new Player("Player B" + (i + 5), LocalDate.of(1990, 1, 1), "Bowler", "Male", "Country B"));
        }
    }

    private static void simulateMatch(CricketMatch match) throws InterruptedException {
        System.out.println("Match Started: " + match.getTeamA().getName() + " vs " + match.getTeamB().getName());
        System.out.println("Match Type: " + match.getMatchType());
        System.out.println("Match Date & Time: " + match.getMatchDateTime());

        // Simulate innings
        Innings inningsA = new Innings(match, match.getTeamA(), match.getTeamB());
        Innings inningsB = new Innings(match, match.getTeamB(), match.getTeamA());

        simulateInnings(inningsA);
        simulateInnings(inningsB);

        // Print match result
        printMatchResult(inningsA, inningsB);
    }

    private static void simulateInnings(Innings innings) throws InterruptedException {
        System.out.println("Innings Start: " + innings.getBattingTeam().getName());

        // Initialize players
        PlayerObject striker = new PlayerObject(innings.getBattingTeam().getPlayers().get(0));
        PlayerObject nonStriker = new PlayerObject(innings.getBattingTeam().getPlayers().get(1));
        PlayerObject bowler = new PlayerObject(innings.getBowlingTeam().getPlayers().getFirst());

        int totalOvers = 20; // Example for T20
        for (int over = 1; over <= totalOvers; over++) {
            System.out.println("Over " + over + " Start");

            for (int ball = 1; ball <= 6; ball++) {
                if (innings.getWickets() >= 10) break; // End innings if 10 wickets are down

                TimeUnit.SECONDS.sleep(1); // Simulate delay for each ball
                simulateBallEvent(innings, striker, nonStriker, bowler);

                System.out.println("Ball " + ball + ": " + striker.getPlayer().getName() + " facing " + bowler.getPlayer().getName());
                System.out.println("Current Score: " + innings.getRuns() + "/" + innings.getWickets());

                // Swap striker and non-striker
                if (ball % 6 == 0) {
                    PlayerObject temp = striker;
                    striker = nonStriker;
                    nonStriker = temp;
                }
            }

            // Rotate bowlers
            bowler = new PlayerObject(innings.getBowlingTeam().getPlayers().get((over % 5)));
        }
        System.out.println("Innings End: " + innings.getRuns() + "/" + innings.getWickets());
    }

    private static void simulateBallEvent(Innings innings, PlayerObject striker, PlayerObject nonStriker, PlayerObject bowler) {
        Random random = new Random();
        int runs = random.nextInt(7); // Runs between 0 and 6
        boolean isWicket = random.nextBoolean(); // Randomly decide if it's a wicket

        // Update innings score
        innings.setRuns(innings.getRuns() + runs);
        if (isWicket) {
            innings.setWickets(innings.getWickets() + 1);
            System.out.println("Wicket! " + striker.getPlayer().getName() + " is out.");
            striker.getPlayer().setOut(true);
            // Replace striker
            striker = new PlayerObject(innings.getBattingTeam().getPlayers().get(2)); // Example new player
        } else {
            System.out.println(striker.getPlayer().getName() + " scored " + runs + " runs.");
        }

        // Update player stats
        striker.setScore(striker.getScore() + runs);
        striker.setBallsFaced(striker.getBallsFaced() + 1);

        // Print ball event details
        System.out.println("Ball Details: Runs Scored: " + runs + ", Wicket: " + isWicket);
        System.out.println("Striker Stats: Runs: " + striker.getScore() + ", Balls Faced: " + striker.getBallsFaced());
    }

    private static void printMatchResult(Innings inningsA, Innings inningsB) {
        int scoreA = inningsA.getRuns();
        int scoreB = inningsB.getRuns();

        String result;
        if (scoreA > scoreB) {
            result = inningsA.getBattingTeam().getName() + " won by " + (scoreA - scoreB) + " runs";
        } else if (scoreB > scoreA) {
            result = inningsB.getBattingTeam().getName() + " won by " + (10 - inningsB.getWickets()) + " wickets";
        } else {
            result = "Match tied";
        }

        System.out.println("Match Result: " + result);
    }
}

