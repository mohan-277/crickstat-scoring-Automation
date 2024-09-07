package enity;

import java.util.ArrayList;
import java.util.List;

public class Innings {
    private CricketMatch match;
    private Team battingTeam;
    private Team bowlingTeam;
    private int runs;
    private int wickets;
    private List<Over> overs;
    private boolean isCompleted;

    public Innings(CricketMatch match, Team battingTeam, Team bowlingTeam) {
        this.match = match;
        this.battingTeam = battingTeam;
        this.bowlingTeam = bowlingTeam;
        this.runs = 0;
        this.wickets = 0;
        this.overs = new ArrayList<>();
        this.isCompleted = false;
    }

    public CricketMatch getMatch() { return match; }
    public void setMatch(CricketMatch match) { this.match = match; }
    public Team getBattingTeam() { return battingTeam; }
    public void setBattingTeam(Team battingTeam) { this.battingTeam = battingTeam; }
    public Team getBowlingTeam() { return bowlingTeam; }
    public void setBowlingTeam(Team bowlingTeam) { this.bowlingTeam = bowlingTeam; }
    public int getRuns() { return runs; }
    public void setRuns(int runs) { this.runs = runs; }
    public int getWickets() { return wickets; }
    public void setWickets(int wickets) { this.wickets = wickets; }
    public List<Over> getOvers() { return overs; }
    public void setOvers(List<Over> overs) { this.overs = overs; }
    public boolean isCompleted() { return isCompleted; }
    public void setCompleted(boolean completed) { isCompleted = completed; }
}
