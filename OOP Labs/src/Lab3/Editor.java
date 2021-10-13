package Lab3;
import java.util.ArrayList;
import java.util.HashMap;

public class Editor { private static String vowelRegex = "aouiey";

    private static String eliminateRepeatingOccurencies(String input, String item) {
        return input.replaceAll("(" + item + ")+", item);
    }

    //

    private static HashMap<String, Integer> getWordHashMap(String input) {
        input = input.toLowerCase().replaceAll("[^a-z\\s]", "");
        input = eliminateRepeatingOccurencies(input, " ");

        HashMap<String, Integer> wordHashMap = new HashMap<String, Integer>();

        String[] words = input.split("\\s");

        for(String word: words) {
            if(wordHashMap.containsKey(word)) {
                wordHashMap.put(word, wordHashMap.get(word) + 1);
            } else {
                wordHashMap.put(word, 1);
            }
        }

        return wordHashMap;
    }

    public static String getLongestWord(String input) {
        String sanitizedInput = input.toLowerCase().replaceAll("[^a-z-']", " ").strip();
        sanitizedInput = eliminateRepeatingOccurencies(sanitizedInput, " ");

        String words[] = sanitizedInput.split("\\s");

        String longestWord = "";

        for (String word: words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

}