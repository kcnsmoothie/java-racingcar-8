package racingcar.controller;

import java.util.List;
import racingcar.service.RacingcarService;
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
        String TryCounts = inputView.inputTryCount();
    }

    private List<String> getCarName(String carNames) {
        List<String> carName = Parser.parseByDelimeter(carNames);
        for(String name : carName){
            Validator.validateCarNameLength(name);
        }
        return carName;
    }
}
