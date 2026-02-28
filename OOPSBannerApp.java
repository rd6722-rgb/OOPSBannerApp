import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {
    public static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        map.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        map.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                " ***"
        });

        return map;
    }
    public static void renderBanner(String text, Map<Character, String[]> map) {

        if (text == null || text.isEmpty()) {
            System.out.println("No text provided.");
            return;
        }

        int rows = map.get(text.charAt(0)).length;

        for (int i = 0; i < rows; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : text.toCharArray()) {

                String[] pattern = map.get(c);

                if (pattern != null) {
                    line.append(pattern[i]).append(" ");
                } else {
                    line.append("???? ").append(" ");
                }
            }

            System.out.println(line);
        }
    }

    /*
     * Main Method
     */
    public static void main(String[] args) {

        Map<Character, String[]> patterns = buildPatternMap();

        String word = "OOPS";

        renderBanner(word, patterns);
    }
}