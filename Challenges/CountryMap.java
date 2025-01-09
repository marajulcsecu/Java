package Challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryMap {
    public static void main(String[] args) {
        Map<String, String > countryCapital = new HashMap<>();
        countryCapital.put("Bangladesh","Dhaka");
        countryCapital.put("India","deli");
        countryCapital.put("Pakistan","Islamabad");
        countryCapital.put("China","beijing");
        countryCapital.put("Nepal","kathmandu");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your country name:");
        String country= input.next();

        if (countryCapital.containsKey(country)){
            System.out.printf("the capital of %s is : " +
                    "%s", country,countryCapital.get(country));
        }
        else {
            System.out.println("the country is not in the map");
        }


    }
}
