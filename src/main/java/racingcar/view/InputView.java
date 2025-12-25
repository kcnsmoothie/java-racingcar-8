package racingcar.view;

import static racingcar.constant.ViewMessage.*;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public String inputCarName() {
        System.out.println(CAR_NAME_MESSAGE.getViewMessage());
        return Console.readLine();
    }

    public String inputTryCount() {
        System.out.println(TRY_COUNT_MESSAGE.getViewMessage());
        return Console.readLine();
    }
}