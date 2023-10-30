package week3day1mock.P2;

import java.util.ArrayList;
import java.util.List;

public class P2Begin {
    public static void main(String[] args) {
        System.out.println(getIndexes("a aa Aaa abca bca", "a"));
    }

    public static List<Integer> getIndexes(String sentence, String prefix) {
        List<Integer> indexes = new ArrayList<>();
        String lowerCaseSentence = sentence.toLowerCase();
        String lowerCasePrefix = prefix.toLowerCase();
        int index = 0;
        for(String word : lowerCaseSentence.split(" ")){
            if(word.startsWith(lowerCasePrefix)){
                indexes.add(index);
            }
            index += word.length() + 1;
        }
        return indexes;
    }
}
