package racingcar.model;

import static racingcar.constant.ReusableInt.MOVE_CAR_DISTANCE;

public class Car {
    private String name;
    private int distance = 0;

    private Car(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public static Car distanceZeroFrom(String carName) {
        return new Car(carName, 0);
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance() {
        this.distance += MOVE_CAR_DISTANCE.getIntValue();
    }
}
