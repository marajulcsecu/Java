package Challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Frequency {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,4,6,4,1,7,8,1);
        System.out.println(Collections.frequency(list,1));
        System.out.println(Collections.frequency(list,8));
        System.out.println(Collections.frequency(list,4));
    }
}
