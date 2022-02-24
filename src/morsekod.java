import java.util.List;

public class morsekod {

    private static List<String> alphabet = List.of("A", "B", "C", "D", "E", "F", "G", "H",
            "I", "J", "K", "L", "M", "N", "O", "P",
            "R", "S", "T", "U", "V", "W", "X", "Y",
            "Z", "1", "2", "3", "4", "5", "6", "7",
            "8", "9", "0", ".", ",", "?");
    private static List<String> morse = List.of("*-", "-***", "-*-*", "-**",
            "*", "**-*", "--*", "****",
            "**", "*---", "-*-", "*-**",
            "--", "-*", "---", "*-*",
            "*-*", "***", "-", "**-",
            "***-", "*--", "-**-", "-*--",
            "--**", "*----", "**---", "***--",
            "****-", "*****", "-****", "--***",
            "---**", "----*", "-----", "*-*-*-",
            "--**--", "**--**");

    public static String getmorse(String letter) {
        return morse.get(alphabet.indexOf(letter));
    }


    public static String geteng(String morseletters) {
        return alphabet.get(morse.indexOf(morseletters));
    }

    public static String getFullMorse(String sentence) {
        String fullMorse = "";
        Character last = ' ';
        for (Character c : sentence.toCharArray()) {
            if (Character.isWhitespace(c)) {
                fullMorse = fullMorse.concat("   ");
            } else if (!Character.isWhitespace(last)) {
                fullMorse = fullMorse.concat(" ");
            }
            if (!Character.isWhitespace(c)) {
                fullMorse = fullMorse.concat(getmorse(c.toString()));
            }
            last = c;
        }
        return fullMorse;
    }

    public static String getFullString(String fullMorse) {
        String text = "";
        String[] splittedString = fullMorse.split(" ");
        String last = "";
        for (String s : splittedString) {
            if (last.isEmpty() && s.isEmpty())
                text = text.concat(" ");
            else if (!s.isEmpty())
                text = text.concat(geteng(s));
            last = s;
        }
        return text;
    }


}
