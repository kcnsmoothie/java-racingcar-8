package racingcar.domain;

public class Car {
    private String name;
    public int positions;

    private static final int DEFAULT_POSITION = 0;
    private static final String  MOVE_SYMBOL = "-";

    public Car(String name) {
        this.name = name;
        this.positions = DEFAULT_POSITION;
    }

    public void move() {
        positions++;
    }

    //positions수만큼 출력
    public void roundRaceResult() {
        System.out.println(name + " : " + MOVE_SYMBOL.repeat(positions));
    }

    public String getName() {
        return name;
    }

    public int getPositions() {
        return positions;
    }
}
