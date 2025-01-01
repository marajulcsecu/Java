package Challenges;

public class StringAppend {
    public static void main(String[] args) {
        String [] name={"marajul","soreful"};

        StringBuilder sb =new StringBuilder();
        sb.append(name[0]).append(" ").append(name[1]);
        System.out.println(sb.toString());


    }
}
