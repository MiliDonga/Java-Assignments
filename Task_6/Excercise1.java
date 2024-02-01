package Task_6;
import java.util.HashMap;
import java.util.Map;

public class Excercise1 {
    public static char findFirstNonRepeatedCharacter(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for (char c : str.toCharArray()) {
            if (charCountMap.get(c) == 1) {
                return c;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        String inputString = "Programming";
        char result = findFirstNonRepeatedCharacter(inputString);

        if (result != '\0') {
            System.out.println("First non-repeated character in the string '" + inputString + "' is: " + result);
        } else {
            System.out.println("No non-repeated character found in the string.");
        }
    }
}
