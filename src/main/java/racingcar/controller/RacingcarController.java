package racingcar.controller;

import java.util.ArrayList;
import java.util.List;
import racingcar.model.Car;
import racingcar.model.RacingcarService;
import racingcar.util.Parser;
import racingcar.util.Validator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingcarController {
    private final InputView inputView;
    private final OutputView outputView;
    private final RacingcarService racingcarService;

    public RacingcarController(InputView inputView, OutputView outputView, RacingcarService racingcarService) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.racingcarService = racingcarService;
    }

    public void run() {
        String carNames = inputView.inputCarName();
        List<String> carName = getCarName(carNames);
        List<Car> carList = getCar(carName);
        String TryCounts = inputView.inputTryCount();
        List<Car> cars = getTurnResult(carList);
        System.out.println(cars.getFirst().getDistance());
    }

    private List<String> getCarName(String carNames) {
        List<String> carName = Parser.parseByDelimeter(carNames);
        for(String name : carName){
            Validator.validateCarNameLength(name);
        }
        return carName;
    }

    private List<Car> getCar(List<String> carName) {
        List<Car> carList = new ArrayList<>();
        for (String name : carName) {
            Car newCar = racingcarService.makeCar(name);
            carList.add(newCar);
        }
        return carList;
    }

    private List<Car> getTurnResult(List<Car> carList) {
        List<Car> cars = carList;
        for (Car car : cars) {
            racingcarService.playTurn(car);
        }
        return cars;
    }
}
