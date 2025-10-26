package racingcar.controller;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import racingcar.model.RacingGameService;
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
        LinkedHashSet<String> carNames = getCarNames(inputView.inputCarNames());
        int tryCounts = Integer.parseInt(inputView.inputTryCounts()); // 시도 횟수 입력 받기

        racingGameService.createCar(carNames);
        racingGameService.setTryCounts(tryCounts);
        racingGameService.runGame();

        int maxPosition = racingGameService.getLongestPosition();
        List<String> winners = racingGameService.findWinnersName(maxPosition);

        outputView.printResultMessage();
        outputView.printWinners(winners);
    }

    // carNames를 분리해서 List로 반환하는 메서드
    public LinkedHashSet<String> getCarNames(String inputCarNames) {
        LinkedHashSet<String> carName = new LinkedHashSet<>();
        Arrays.stream(inputCarNames.split(","))
                .map(String::trim)
                .forEach(carName::add);

        return carName;
    }

}
