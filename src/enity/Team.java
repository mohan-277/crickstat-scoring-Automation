package enity;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;
    private String country;
    private String teamCaptain;
    private String coach;
    private String owner;
    private int totalPoints;
    private byte[] logo;
    private String icon;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public List<Player> getPlayers() { return players; }
    public void setPlayers(List<Player> players) { this.players = players; }
    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }
    public String getTeamCaptain() { return teamCaptain; }
    public void setTeamCaptain(String teamCaptain) { this.teamCaptain = teamCaptain; }
    public String getCoach() { return coach; }
    public void setCoach(String coach) { this.coach = coach; }
    public String getOwner() { return owner; }
    public void setOwner(String owner) { this.owner = owner; }
    public int getTotalPoints() { return totalPoints; }
    public void setTotalPoints(int totalPoints) { this.totalPoints = totalPoints; }
    public byte[] getLogo() { return logo; }
    public void setLogo(byte[] logo) { this.logo = logo; }
    public String getIcon() { return icon; }
    public void setIcon(String icon) { this.icon = icon; }

}
