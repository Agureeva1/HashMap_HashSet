import java.util.HashMap;
import java.util.Map;

import static java.awt.SystemColor.info;

public class Main {

    public static String textLower = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum";

    public static void main(String[] args) {
        String text= textLower.toLowerCase();
        System.out.println(text);
        Map<Character, Integer> collection = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                if (collection.containsKey(ch)) {
                    collection.put(ch, collection.get(ch) + 1);
                } else {
                    collection.put(ch, 1);
                }
            }
        }
        int max = 0;
        char maxch = 0;
        for (char ch : collection.keySet()) {
            if (collection.get(ch) > max) {
                max = collection.get(ch);
                maxch = ch;
                    }
                }
        int min = Integer.MAX_VALUE;
        char minch = 0;
        for (char ch : collection.keySet()) {
            if (collection.get(ch) < min) {
                min = collection.get(ch);
                minch = ch;

            }
        }
        System.out.println("Чаще всего в тексте встречается буква " + maxch + " - " + max + " раз(а).");
        System.out.println("Реже всего в тексте встречается буква " + minch + " - " + min + " раз(а).");
    }
}

