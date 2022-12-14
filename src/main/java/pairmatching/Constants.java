package pairmatching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Constants {
    class Command {
        public static final String PAIR_MATCHING = "1";
        public static final String PAIR_LOOKUP = "2";
        public static final String PAIR_CLEAR = "3";
        public static final String QUIT = "Q";


        private Command() {
        }
    }

    public enum Course {
        BACKEND("백엔드"),
        FRONTEND("프론트엔드");

        private String name;

        Course(String name) {
            this.name = name;
        }

        public static boolean contains(String inputCourse) {
            for(Course course : Course.values()) {
                if(course.name.equals(inputCourse)) {
                    return true;
                }
            }
            return false;
        }

        public static String format() {
            return "과정: " + BACKEND.name + " | " + FRONTEND.name;
        }

        // 추가 기능 구현
    }

    public enum Level {
        LEVEL1("레벨1", new ArrayList<Mission>(Arrays.asList(Mission.RACING, Mission.LOTTO, Mission.BASEBALL))),
        LEVEL2("레벨2", new ArrayList<Mission>(Arrays.asList(Mission.SHOPPING_BASKET, Mission.PAYMENT, Mission.SUBWAY))),
        LEVEL3("레벨3", new ArrayList<Mission>()),
        LEVEL4("레벨4", new ArrayList<Mission>(Arrays.asList(Mission.PERFORMENCE_IMPROVEMENT, Mission.DEPLOYMENT))),
        LEVEL5("레벨5", new ArrayList<Mission>());

        private final List<Mission> missions;
        private String name;

        Level(String name, List<Mission> missions) {
            this.name = name;
            this.missions = missions;
        }

        public static boolean contains(String inputLevel) {
            for(Level level : Level.values()) {
                if(level.name.equals(inputLevel)) {
                    return true;
                }
            }
            return false;
        }
        @Override
        public String toString() {
            String missionList = missions.stream()
                    .map(mission -> mission.toString())
                    .collect(Collectors.joining(" | "));

            return "  - " + name + ": " + missionList;
        }

        public static List<Level> getAllLevel() {
            return new ArrayList<Level>(Arrays.asList(LEVEL1, LEVEL2, LEVEL3, LEVEL4, LEVEL5));
        }



        // 추가 기능 구현
    }

    public enum Mission {
        RACING("자동차경주"),
        LOTTO("로또"),
        BASEBALL("숫자야구게임"),
        SHOPPING_BASKET("장바구니"),
        PAYMENT("결제"),
        SUBWAY("지하철노선도"),
        PERFORMENCE_IMPROVEMENT("성능개선"),
        DEPLOYMENT("배포");

        private final String name;

        Mission(String name) {
            this.name = name;
        }

        public static boolean contains(String inputMission) {
            for(Mission mission : Mission.values()) {
                if(mission.name.equals(inputMission)) {
                    return true;
                }
            }
            return false;
        }

        public static String format() {
            return "미션:";
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
