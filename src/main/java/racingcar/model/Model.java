package racingcar.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Model {
    String carNames;
    LinkedHashSet<String> carName = new LinkedHashSet<>();
    List<Car> carList = new ArrayList<>();
    Car car;

    public Model(String inputCarNames, int tryCounts) {
        carNames = inputCarNames;
        carNameParser();
        createCar();
    }

    //입력받은 값을 분리
    public void carNameParser() {
        Arrays.stream(carNames.split(","))
                .map(String::trim)
                .forEach(carName::add);
        System.out.println(carName);
    }

    // Car 객체를 생성하는 역할
    public void createCar() {
        for (String name : carName) {
            carList.add(new Car(name));
        }
    }
}
