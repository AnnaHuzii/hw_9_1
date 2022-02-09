package TaskThree;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberWords {

    public static Map<String, Integer> wordsFile() throws IOException {
        List<String> words = new ArrayList<>();
        File file = new File("C:\\AnnaHuzii\\обучение java\\DZ\\hw_9\\src\\main\\java\\TaskThree\\words.txt");
        Scanner fin = new Scanner(new FileReader(file));
        String[] array;
        while (fin.hasNextLine()) {
            array = fin.nextLine().split(" ");
            for (String s : array) {
                if (!s.equals(""))
                    words.add(s.replaceAll("[^a-zA-Zа-яёА-ЯЁ]", "").toLowerCase());
            }
        }
        Map<String, Integer> frequency = countDuplicates(words);
        return frequency;
    }

    public static Map<String, Integer> countDuplicates(List<String> inputList) {

        Map<String, Integer> comparator = inputList.stream().collect(Collectors.toMap(Function.identity(), v -> 1, Integer::sum));

        return comparator;
    }

}