package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;
import racingcar.domain.Car;
import racingcar.domain.Cars;

public class RacingGameService {

    int tryCounts;
    List<Car> carList = new ArrayList<>();
    int maxPosition;

    private static final int MIN_NUMBER = 0;
    private static final int MAX_NUMBER = 9;
    private static final int MOVE_THRESHOLD = 4;

    public void isValidTryCounts() {
        if (tryCounts <= 0) {
            throw new IllegalArgumentException("시도 횟수는 0보다 커야 합니다.");
        }
    }

    public void setTryCounts(int tryCounts) {
        this.tryCounts = tryCounts;
        isValidTryCounts();
    }

    // Car 객체를 생성하는 역할
    public void createCars(Cars cars) {
        List<String> validatedNames = cars.getValidatedCarNames();
        for (String name : validatedNames) {
            carList.add(new Car(name));
        }
    }

    // 자동차를 움직이는 메서드
    public void moveCars() {
        for (Car car : carList) {
            int randomNumber = Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER);
            if (MOVE_THRESHOLD <= randomNumber) {
                car.move();
            }
        }
    }

    public List<String> roundRaceResult() {
        List<String> roundResult = new ArrayList<>();
        for (Car car : carList) {
            roundResult.add(car.getRoundResult());
        }
        return roundResult;
    }

    public int getLongestPosition() {
        maxPosition = carList.stream()
                .map(Car::getPositions)
                .max(Integer::compareTo) //Optional
                .orElse(0);

        return maxPosition;
    }

    public List<String> findWinnersName(int maxPosition) {
        List<String> winners = carList.stream()
                .filter(car -> car.getPositions() == maxPosition)
                .map(Car::getName)
                .collect(Collectors.toList());
        return winners;
    }
}
