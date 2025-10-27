package racingcar.domain;

public class Car {
    private String name;
    private int positions;

    private static final int DEFAULT_POSITION = 0;
    private static final String MOVE_SYMBOL = "-";

    public Car(String name) {
        this.name = name;
        this.positions = DEFAULT_POSITION;
    }

    public void move() {
        positions++;
    }

    public String getName() {
        return name;
    }

    public int getPositions() {
        return positions;
    }

    public String getRoundResult() {
        return name + " : " + MOVE_SYMBOL.repeat(positions);
    }
}
