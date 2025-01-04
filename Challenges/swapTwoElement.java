package Challenges;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class swapTwoElement {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("marajul","sharifa","soreful","hafsa","aar","aas");
        System.out.println(list);
swap(list,2,5);
System.out.println(list);
    }

    public static void swap(List<String> list,int x, int y){
        String swap=list.get(x);
        list.set(x,list.get(y));
        list.set(y,swap);
    }
}
