package Challenges;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reverseList {
    public static void main(String[] args) {
        List<String> numbers= Arrays.asList("1","2","3","4","5","6");
        System.out.println(numbers);
        reverse(numbers);
        System.out.println(numbers);
    }
    public static void reverse(List<String> list){
//        Collections.reverse(list);
        for (int i = 0; i < list.size()/2; i++) {
            swapTwoElement.swap( list,i,list.size()-1-i);
        }

    }
}