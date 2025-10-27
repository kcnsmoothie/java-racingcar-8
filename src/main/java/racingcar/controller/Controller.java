package racingcar.controller;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import racingcar.domain.Cars;
import racingcar.model.RacingGameService;
import racingcar.validator.CarNameValidator;
import racingcar.validator.Validator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Controller {
    private final InputView inputView;
    private final OutputView outputView;
    private final RacingGameService racingGameService;

    public Controller(InputView inputView, OutputView outputView, RacingGameService racingGameService) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.racingGameService = racingGameService;
    }

    public void run() {
        String inputCarNames = inputView.inputCarNames();
        int tryCounts = Integer.parseInt(inputView.inputTryCounts()); // 시도 횟수 입력 받기

        Cars cars = new Cars(inputCarNames);
        racingGameService.createCars(cars);
        racingGameService.setTryCounts(tryCounts);

        outputView.printResultMessage();

        for (int i = 0; i < tryCounts; i++) {
            racingGameService.moveCars();
            List<String> roundResult = racingGameService.roundRaceResult();

            outputView.printRaceResult(roundResult);
        }

        int maxPosition = racingGameService.getLongestPosition();
        List<String> winners = racingGameService.findWinnersName(maxPosition);



        outputView.printWinners(winners);
    }
}
