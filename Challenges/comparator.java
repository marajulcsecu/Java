package Challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class comparator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","mango","lichi","tarmuz","banana");
        System.out.println(list);
        sortInDecending(list);
        System.out.println(list);

    }

    public static void sortInDecending(List<String> Stringlist){
        Collections.sort(Stringlist);
    }

}
