package racingcar.model;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Model {
    String inputCarNames;


    public Model(String carNames) {
        inputCarNames = carNames;
        carNameParser(carNames);
    }

    public void carNameParser(String carNames) {
        LinkedHashSet<String> carName = new LinkedHashSet<>();
        Arrays.stream(inputCarNames.split(","))
                .forEach(carName::add);
        System.out.println(carName);
    }
}
