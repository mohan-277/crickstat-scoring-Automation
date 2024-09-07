package enity;

public class Ball {
    private long id;
    private BallType ballType;
    private double ballSpeed;
    private PlayerObject playedBy;
    private PlayerObject bowledBy;
    private int run;
    private Wicket wicket;

    public Ball(long id, BallType ballType, double ballSpeed, PlayerObject playedBy, PlayerObject bowledBy, int run, Wicket wicket) {
        this.id = id;
        this.ballType = ballType;
        this.ballSpeed = ballSpeed;
        this.playedBy = playedBy;
        this.bowledBy = bowledBy;
        this.run = run;
        this.wicket = wicket;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public BallType getBallType() { return ballType; }
    public void setBallType(BallType ballType) { this.ballType = ballType; }
    public double getBallSpeed() { return ballSpeed; }
    public void setBallSpeed(double ballSpeed) { this.ballSpeed = ballSpeed; }
    public PlayerObject getPlayedBy() { return playedBy; }
    public void setPlayedBy(PlayerObject playedBy) { this.playedBy = playedBy; }
    public PlayerObject getBowledBy() { return bowledBy; }
    public void setBowledBy(PlayerObject bowledBy) { this.bowledBy = bowledBy; }
    public int getRun() { return run; }
    public void setRun(int run) { this.run = run; }
    public Wicket getWicket() { return wicket; }
    public void setWicket(Wicket wicket) { this.wicket = wicket; }

}
