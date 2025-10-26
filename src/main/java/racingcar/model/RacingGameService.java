package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;
import java.util.stream.Collectors;
import racingcar.domain.Car;

public class RacingGameService {
    private static final int MIN_NUMBER = 0;
    private static final int MAX_NUMBER = 9;
    private static final int MOVE_THRESHOLD = 4;

    // 자동차를 움직이는 메서드
    public void moveCars() {
        for (Car car : carList) {
            // 랜덤 인수를 반환
            int randomNumber = Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER);
            // 4보다 클 때 이동
            if (MOVE_THRESHOLD <= randomNumber) {
                car.move();
            }
            //매 회차마다 결과를 출력
            car.roundRaceResult();
        }
    }

    // 입력 횟수만큼 게임을 진행하는 메서드
    public void runGame() {
        for (int i = 0; i <= tryCounts; i++) {
            moveCars();
        }
    }

    // 우승자를 찾는 메서드
    public void getLongestPosition() {
        // 최댓값을 가진 사람의 이름 찾기
        List<String> winners = carList.stream()
                .filter(car -> car.getPositions() == maxPosition)
                .map(Car::getName)
                .collect(Collectors.toList());
    }

    public List<String> findWinnersName() {
        // 위치의 최댓값을 구하기
        int maxPosition = carList.stream()
                .map(Car::getPositions)
                .max(Integer::compareTo) //Optional
                .orElse(0);

        return winners;
    }
}
