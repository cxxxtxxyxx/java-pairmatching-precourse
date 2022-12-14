package pairmatching.view;

public class InputView {

    private static final String SELECT_OPERATOR = "기능을 선택하세요.";
    private static final String PAIR_MATCHING = "1. 페어 매칭";
    private static final String PAIR_LOOKUP = "2. 페어 조회";
    private static final String PAIR_CLEAR = "3. 페어 초기화";
    private static final String QUIT = "Q. 종료";
    public static void inputOperation() {
        System.out.println(SELECT_OPERATOR);
        System.out.println(PAIR_MATCHING);
        System.out.println(PAIR_LOOKUP);
        System.out.println(PAIR_CLEAR);
        System.out.println(QUIT);
    }


}
