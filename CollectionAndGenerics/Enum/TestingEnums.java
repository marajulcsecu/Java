package CollectionAndGenerics.Enum;

public class TestingEnums {

    public static void main(String[] args) {

TrafficLight color = TrafficLight.RED;

color=TrafficLight.GREEN;

        Grade grade = Grade.C;
        Grade grade1=Grade.B;

//        System.out.println(TrafficLight.valueOf("Go"));
Grade grade2= Grade.valueOf("D");

        System.out.println(color);

        System.out.println(grade1);

        for (TrafficLight value : TrafficLight.values()) {

            System.out.println(value);

        }

    }
}
