package Challenges;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacter {
    public static void main(String[] args) {
        Set<Character> unique = new HashSet<>();
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your string: ");
        String userStr = input.next();
        for (char c : userStr.toCharArray()) {
            unique.add(c);
        }
        System.out.printf("your string has %d unique characters ",unique.size());
    }
}
