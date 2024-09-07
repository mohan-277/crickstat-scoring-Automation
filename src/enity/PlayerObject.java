package enity;

public class PlayerObject {
    private Player player;
    private int score;
    private int ballsFaced;
    private int fours;
    private int sixes;

    public PlayerObject(Player player) {
        this.player = player;
        this.score = 0;
        this.ballsFaced = 0;
        this.fours = 0;
        this.sixes = 0;
    }

    public Player getPlayer() { return player; }
    public void setPlayer(Player player) { this.player = player; }
    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }
    public int getBallsFaced() { return ballsFaced; }
    public void setBallsFaced(int ballsFaced) { this.ballsFaced = ballsFaced; }
    public int getFours() { return fours; }
    public void setFours(int fours) { this.fours = fours; }
    public int getSixes() { return sixes; }
    public void setSixes(int sixes) { this.sixes = sixes; }
}
