package enity;

import java.util.ArrayList;
import java.util.List;

public class Over {
    private long id;
    private int number;
    private List<Ball> balls;

    public Over(long id, int number) {
        this.id = id;
        this.number = number;
        this.balls = new ArrayList<>();
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public int getNumber() { return number; }
    public void setNumber(int number) { this.number = number; }
    public List<Ball> getBalls() { return balls; }
    public void setBalls(List<Ball> balls) { this.balls = balls; }
}
