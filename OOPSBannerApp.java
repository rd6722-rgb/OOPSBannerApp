public class OOPSBannerApp {
     static class CharacterPatternMap {
        private final char character;
        private final String[] pattern;   // 7-line pattern

        /**
         * Constructor to initialize character and pattern.
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /** Returns the character. */
        public char getCharacter() {
            return character;
        }

        /** Returns the banner pattern. */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to fetch pattern for a given character.
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] maps) {
        for (CharacterPatternMap map : maps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return new String[]{" ", " ", " ", " ", " ", " ", " "};
    }

    /**
     * Utility method to print banner text.
     */
    public static void printBanner(String text, CharacterPatternMap[] maps) {
        StringBuilder[] lines = new StringBuilder[7];

        for (int i = 0; i < 7; i++) {
            lines[i] = new StringBuilder();
        }

        for (char ch : text.toCharArray()) {
            String[] pattern = getCharacterPattern(ch, maps);
            for (int i = 0; i < 7; i++) {
                lines[i].append(pattern[i]).append("  ");
            }
        }

        for (StringBuilder line : lines) {
            System.out.println(line);
        }
    }

    /**
     * Main method.
     */
    public static void main(String[] args) {

        CharacterPatternMap[] maps = {

            new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
            }),

            new CharacterPatternMap('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
            }),

            new CharacterPatternMap('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
            })
        };

        printBanner("OOPS", maps);
    }
}
