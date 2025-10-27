package racingcar.view;

import java.util.List;
import racingcar.domain.Car;

public class OutputView {

    public void printResultMessage() {
        System.out.println("실행 결과");
    }

    public void printRaceResult(List<String> roundResults) {
        for (String result : roundResults) {
            System.out.println(result);
        }
        System.out.println(); // 라운드 간 공백
    }

    public void printWinners(List<String> winners) {
        System.out.println("최종 우승자 : " + String.join(", ", winners));
    }
}
