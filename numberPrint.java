import java.util.Scanner;

public class numberPrint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter a number: ");
        int number= input.nextInt();
        for(int i=1; i<=number;i++)
        {
            System.out.println(i);
        }

    }
}
