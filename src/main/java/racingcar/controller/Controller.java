package racingcar.controller;

import racingcar.model.Model;
import racingcar.view.InputView;

public class Controller {
    InputView inputView = new InputView();
    Model model;

    public Controller(){
        String carNames = inputView.inputCarNames();
        model = new Model(carNames);
    }
}
