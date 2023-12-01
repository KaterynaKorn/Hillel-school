import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = args;
        Map<Character, Integer> counter = new HashMap<>();
        for (String word : words) {
            for (char letter : word.toCharArray()) {
                if (Character.isLetter(letter)) {
                    counter.put(letter, counter.getOrDefault(letter, 0) + 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> result : counter.entrySet()) {
            System.out.println(result.getKey() + " - " + result.getValue());
        }
    }
}