package CollectionAndGenerics.varargs;

public class varargs {

    public static void main(String... args) {
        System.out.println(sum(4,5));
        System.out.println(sun(5,6));
//x

        
    }
    public static int sun(int... a){

        int sum=0;
     for(int i :a){
         sum +=i;
     }
     return sum;
    }

 public static int sum(int[] a){

        int sum = 0;
     for (int i : a) {
         sum +=i;
     }
     return sum;
 }

    public  static int sum(int a,int b){


        return a+b;
    }
}

