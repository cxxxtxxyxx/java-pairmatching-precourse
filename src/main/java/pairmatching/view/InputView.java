package pairmatching.view;

import pairmatching.Constants.Course;
import pairmatching.Constants.Level;
import pairmatching.Constants.Mission;

public class InputView {

    private static final String SELECT_OPERATOR = "기능을 선택하세요.";
    private static final String PAIR_MATCHING = "1. 페어 매칭";
    private static final String PAIR_LOOKUP = "2. 페어 조회";
    private static final String PAIR_CLEAR = "3. 페어 초기화";
    private static final String QUIT = "Q. 종료";

    private static final String CHOICE_COURSE_LEVEL_MISSION = "과정, 레벨, 미션을 선택하세요.";
    private static final String CHOICE_EXAMPLE = "ex) 백엔드, 레벨1, 자동차경주";

    private static final String LINE_SEPERATOR = "############################################";
    public static void inputOperation() {
        System.out.println(SELECT_OPERATOR);
        System.out.println(PAIR_MATCHING);
        System.out.println(PAIR_LOOKUP);
        System.out.println(PAIR_CLEAR);
        System.out.println(QUIT);
    }

    public static void inputCourseAndLevelAndMission() {
        System.out.println(LINE_SEPERATOR);
        System.out.println(Course.format());
        System.out.println(Mission.format());
        for(Level level : Level.getAllLevel()) {
            System.out.println(level.toString());
        }
        System.out.println(LINE_SEPERATOR);
        System.out.println(CHOICE_COURSE_LEVEL_MISSION);
        System.out.println(CHOICE_EXAMPLE);
    }


}
