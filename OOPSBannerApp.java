public class OOPSBannerApp {
    static String[] getOPattern(){
        return new String[]{
            String.join("", " ", "*", "*", "*", "*", "*", " "),
            String.join("", "*", " ", " ", " ", " ", " ", "*"),
            String.join("", "*", " ", " ", " ", " ", " ", "*"),
            String.join("", "*", " ", " ", " ", " ", " ", "*"),
            String.join("", "*", " ", " ", " ", " ", " ", "*"),
            String.join("", "*", " ", " ", " ", " ", " ", "*"),
            String.join("", " ", "*", "*", "*", "*", "*", " ")
        };
    }
    static String[] getPPattern(){
        return new String[]{
        String.join("", "*", "*", "*", "*", "*", " "),
            String.join("", "*", " ", " ", " ", " ", "*"),
            String.join("", "*", " ", " ", " ", " ", "*"),
            String.join("", "*", "*", "*", "*", "*", " "),
            String.join("", "*", " ", " "),
            String.join("", "*", " ", " "),
            String.join("", "*", " ", " ")
        };
    }
    static String[] getSPattern(){
        return new String[]{
            String.join("", " ", "*", "*", "*", "*", "*"),
            String.join("", "*", " "),
            String.join("", "*", " "),
            String.join("", " ", "*", "*", "*", "*"),
            String.join("", " ", " ", " ", " ", "    *"),
            String.join("", " ", " ", " ", " ", "    *"),
            String.join("", " ", "  *", "*", "*", "*", "*")
        };
    }
    public static void main(String[] args){
        String[] O=getOPattern();
        String[] P =getPPattern();
        String[] S=getSPattern();
        for (int i=0; i<7;i++){
            System.out.println(O[i] + " " + O[i] + " " + " " + P[i] + " " + S[i]);
        }
    }
}

    




