package Task6;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

//Задание №6:
//Есть входной файл с набором слов, написанных через пробел
public class Main {
    public static void main(String[] args) throws IOException {

        //Прочитать слова из файла.
        String path = "src\\Task6\\file.txt";
        String lineFromFile = new String(Files.readAllBytes(Paths.get(path)), StandardCharsets.UTF_8);
        String[] wordsInArray = lineFromFile.split("\\s+");

        //Отсортировать в алфавитном порядке.
        List<String> wordsInList = new ArrayList<>(Arrays.asList(wordsInArray));
        Collections.sort(wordsInList);

        //Посчитать сколько раз каждое слово встречается в файле.       Вывести статистику на консоль
        Map<String, Integer> countMap = countDuplicates(wordsInList);
        System.out.println(countMap);

        //Найти слово с максимальным количеством повторений. Вывести на консоль это слово и сколько раз оно встречается в файле
        Map.Entry<String, Integer> maxEntry = getMaxEntry(countMap);
        System.out.println(maxEntry);
    }

    private static Map<String, Integer> countDuplicates(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for (String element: list) {
            if (map.containsKey(element))
                map.put(element, map.get(element) + 1);
            else
                map.put(element, 1);
        }
        return map;
    }

    private static Map.Entry<String, Integer> getMaxEntry(Map<String, Integer> map) {
        Map.Entry<String, Integer> maxEntry = null;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
            {
                maxEntry = entry;
            }
        }
        return maxEntry;
    }
}
