package Challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","mango","lichi","tarmuz","banana");
        System.out.println(list);
        sortInDecending(list);
        System.out.println(list);

    }

    public static void sortInDecending(List<String> Stringlist){
        Collections.sort(Stringlist, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.equals(o2)){
                    return 0;
                }
                else if (o1.charAt(0)<o2.charAt(0)){
                    return 1;
                }
                else {
                    return -1;
                }
            }
        });
    }

}
