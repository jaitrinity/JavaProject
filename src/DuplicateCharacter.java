package src;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateCharacter {
    public static void main(String[] args) {
//        DuplicateCharacter c = new DuplicateCharacter();
        String dup = DuplicateCharacter.dupChar("Java Hungry Blog Alive is Awesome");
        System.out.println(dup);
    }

    private static String dupChar(String inputString){
        List<Character> collect = inputString
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> !entry.getKey().equals(' ') && entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        return collect.toString();
    }

    private static String findDupChacter(String inputString){
       Map<Character, Long> dupmap = inputString
        .chars()
        .mapToObj(c->(char)c)
        .collect(Collectors.groupingBy(c->c, Collectors.counting()));

       String result="";
        for(Map.Entry<Character, Long> entries : dupmap.entrySet()){
            if(!entries.getKey().equals(' ') && entries.getValue() > 1){
                if(result.equals("")){
                    result += entries.getKey();
                }
                else{
                    result += ", "+entries.getKey();
                }

            }
        }
        return result;
    }
}
