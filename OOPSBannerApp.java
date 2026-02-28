public class OOPSBannerApp {

    public static void main(String[] args) {
        // 1. Create a String array to store all 7 lines of the banner
        String[] banner = new String[7];

        // 2. Populate the array using String.join to construct each line
        banner[0] = String.join("", "  *** ", "   *** ", " ***** ", "  **** ");
        banner[1] = String.join("", " *   * ", " *   * ", "*    * ", " * ");
        banner[2] = String.join("", " *   * ", " *   * ", "*    * ", " * ");
        banner[3] = String.join("", " *   * ", " *   * ", "***** ", "   *** ");
        banner[4] = String.join("", " *   * ", " *   * ", "* ", "          * ");
        banner[5] = String.join("", " *   * ", " *   * ", "* ", "          * ");
        banner[6] = String.join("", "  *** ", "   *** ", " * ", "      **** ");

        // 3. Use an Enhanced For-Loop to iterate through the array and print each line
        for (String line : banner) {
            System.out.println(line);
        }
    }
}



