package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public String inputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return Console.readLine();
    }

    //Console.readLine은 문자열 타입으로만 입력받을 수 있으므로, String
    public String inputTryCounts() {
        System.out.println();
        return Console.readLine();
    }
}
