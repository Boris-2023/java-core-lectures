import java.util.Arrays;

public class Enumeration {
    enum Color {
        RED("#FF0000"), GREEN("00FF00"), BLUE("0000FF");
        private String code;

        Color(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }
    }

    public static void main(String[] args) {
        // enum - перечисление
        enum Season {SPRING, SUMMER, AUTUMN, WINTER}
        Season current = Season.WINTER;
        System.out.println((current.ordinal() + 1) + ". " + current + "\n");

        Season[] seasons = Season.values();
        Arrays.stream(seasons).forEach(System.out::println);

        for (Color c: Color.values()) {
            System.out.printf("%s(%s)\t ", c, c.getCode());
        }
    }
}
