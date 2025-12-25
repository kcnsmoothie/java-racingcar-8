package racingcar.model;

import java.util.List;

public class RacingcarService {
    public Car makeCar(String carName) {
        Car car = Car.distanceZeroFrom(carName);
        return car;
    }
}
