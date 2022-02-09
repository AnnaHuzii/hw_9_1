package TaskThree;

import java.io.IOException;
import java.util.Map;

public class NomberWordsTests {
    public static void main(String[] args) throws IOException {
        System.out.println("Number of words: " + NumberWords.wordsFile().size());
        NumberWords.wordsFile().entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}
