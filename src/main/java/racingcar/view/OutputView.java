package racingcar.view;

import java.util.List;

public class OutputView {
    public void printRaceResult() {
        for (Car car : ) {
            System.out.println();
        }
        System.out.println();
    }
    public void printWinners(List<String> winners) {
        System.out.println("최종 우승자 : " + String.join(", ", winners));
    }
}
