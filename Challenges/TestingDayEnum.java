package Challenges;

public class TestingDayEnum {
    public static void main(String[] args) {
        for (DayEnum days : DayEnum.values()){
            System.out.printf("%s: %s\n",days,days.getType());


        }
    }
}
