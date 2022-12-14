package pairmatching;

import camp.nextstep.edu.missionutils.Console;
import pairmatching.Constants.Command;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;

public class Application {
    public static void main(String[] args) {
        while (true) {
            InputView.inputOperation();
            String operator;
            while (true) {
                try {
                    operator = Console.readLine();
                    if (!(operator.equals(Command.QUIT)
                            || operator.equals(Command.PAIR_CLEAR)
                            || operator.equals(Command.PAIR_LOOKUP)
                            || operator.equals(Command.PAIR_MATCHING))) {
                        throw new IllegalArgumentException("1, 2, 3, Q 중에 한 가지를 입력해주세요.");
                    }
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e);
                }
            }
            if (operator.equals(Command.QUIT)) {
                break;
            }

            InputView.inputCourseAndLevelAndMission();

        }
    }
}
