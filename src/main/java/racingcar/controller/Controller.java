package racingcar.controller;

import racingcar.model.Model;
import racingcar.view.InputView;

public class Controller {
    InputView inputView = new InputView();
    Model model;

    public Controller() {
        String inputCarNames = inputView.inputCarNames();
        // 추후 입력값이 정수, 유효한 값인지 검증로직 추가
        int inputTryCounts = Integer.parseInt(inputView.inputTryCounts());
        model = new Model(inputCarNames, inputTryCounts);
    }
}
