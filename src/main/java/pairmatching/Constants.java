package pairmatching;

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

        public static String format() {
            return "과정: " + BACKEND.name + " | " + FRONTEND.name;
        }

        // 추가 기능 구현
    }

    public enum Level {
        LEVEL1("레벨1"),
        LEVEL2("레벨2"),
        LEVEL3("레벨3"),
        LEVEL4("레벨4"),
        LEVEL5("레벨5");

        private String name;

        Level(String name) {
            this.name = name;
        }

        // 추가 기능 구현
    }
}
