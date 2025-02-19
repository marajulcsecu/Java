package Examprep;

public class ToString {
    String name;
    int age;
    ToString(String name, int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "toString{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
