package Challenges;

public class StConcatenate {
    public static void main(String[] args) {
        System.out.println(Concatenate("marajul","haque"));
        System.out.println(Concatenate("soreful","islam"));
    }
   public static String  Concatenate(String... strs){

StringBuilder sb = new StringBuilder();
for (String str:strs){
    sb.append(str).append(" ");

}
return sb.toString();
   }
}
