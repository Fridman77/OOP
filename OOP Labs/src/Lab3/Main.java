package Lab3;
import java.util.ArrayList;
import java.util.HashMap;
public class Main
{
    public static void main(String[] args) {
        String rawText = "Satisfied conveying an dependent contented he gentleman agreeable do be. Warrant private blushes removed an in equally totally if. Delivered dejection necessary objection do mr prevailed. Mr feeling do chiefly cordial in do. Water timed folly right aware if oh truth. Imprudence attachment him his for sympathize. Large above be to means. Dashwood do provided stronger is. But discretion frequently sir the she instrument unaffected admiration everything.";

        System.out.println("The longest word is: " +Lab3.Editor.getLongestWord(rawText));
        System.out.println("Nr. of sentences are: " +Lab3.Editor.countSentences(rawText));
        System.out.println("Nr. of words are: " +Lab3.Editor.countWords(rawText));
        System.out.println("Nr. of Letters : " +Lab3.Editor.countLetters(rawText));
        System.out.println("Nr. of Vovels: " +Lab3.Editor.countVowels(rawText));
        System.out.println("Nr. of Consones: " +Lab3.Editor.countConsonants(rawText));
    }
}