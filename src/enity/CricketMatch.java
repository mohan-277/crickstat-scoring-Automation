package enity;

import java.time.LocalDateTime;

public class CricketMatch {
    private Team teamA;
    private Team teamB;
    private String matchType;
    private LocalDateTime matchDateTime;
    private String result;

    public CricketMatch(Team teamA, Team teamB, String matchType) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.matchType = matchType;
        this.matchDateTime = LocalDateTime.now();
    }

    public Team getTeamA() { return teamA; }
    public void setTeamA(Team teamA) { this.teamA = teamA; }
    public Team getTeamB() { return teamB; }
    public void setTeamB(Team teamB) { this.teamB = teamB; }
    public String getMatchType() { return matchType; }
    public void setMatchType(String matchType) { this.matchType = matchType; }
    public LocalDateTime getMatchDateTime() { return matchDateTime; }
    public void setMatchDateTime(LocalDateTime matchDateTime) { this.matchDateTime = matchDateTime; }
    public String getResult() { return result; }
    public void setResult(String result) { this.result = result; }
}
