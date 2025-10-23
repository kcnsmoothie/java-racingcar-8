package racingcar.model;

public class Car {
    private String name;
    private static final int DEFAULT_POSITION = 0;
    public int position;

    public Car(String name) {
        this.name = name;
        this.position = DEFAULT_POSITION;
    }
}
