package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;
import static racingcar.constant.ReusableInt.*;

public class RacingcarService {
    public Car makeCar(String carName) {
        Car car = Car.distanceZeroFrom(carName);
        return car;
    }

    public Car playTurn(Car car) {
        int randomNumber = Randoms.pickNumberInRange(RANDOM_NUMBER_RANGE_START.getIntValue(), RANDOM_NUMBER_RANGE_END.getIntValue());
        if (randomNumber >= MOVE_FORWARD_REFERENCE_VALUE.getIntValue()) {
            car.setDistance();
        }
        return car;
    }
}
