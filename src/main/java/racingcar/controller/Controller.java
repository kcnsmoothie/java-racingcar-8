package racingcar.controller;

import java.util.List;
import racingcar.model.Model;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Controller {
    InputView inputView = new InputView();
    OutputView outputView = new OutputView();
    Model model;

    public Controller() {
        String inputCarNames = inputView.inputCarNames();
        // 추후 입력값이 정수, 유효한 값인지 검증로직 추가
        int inputTryCounts = Integer.parseInt(inputView.inputTryCounts());
        model = new Model(inputCarNames, inputTryCounts);

        //view로 매 라운드 마다 결과를 출력
        outputView.printWinners(model.findWinnersName());

        //view로 우승자를 출력

    }
}
