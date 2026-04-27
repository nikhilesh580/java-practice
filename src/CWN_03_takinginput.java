import java.util.Scanner;

public class CWN_03_takinginput {
    public static void main (String []args){
        System.out.println("Taking input from the user ");
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter number 1");
//        int a = sc.nextInt();
//        System.out.println("Enter number 2");
//        int b = sc.nextInt();
//
//        int sum = a+b;
//        System.out.println("the sum of these number is");
//        System.out.println(sum);



        // for float

//        System.out.println("Enter number 1");
//        float a = sc.nextFloat();
//        System.out.println("Enter number 2");
//        float b = sc.nextFloat();
//        float sum = a+b;
//        System.out.println("the sum of these number is");
//
//        System.out.println(sum);


        // for bolean
//        System.out.println("Enter number 1");
//        boolean b1 = sc.hasNextInt();
//        System.out.println(b1);


        // for string
        //(two case of string )
        // first case

        //String str = sc.next(); // puri string me sirf first string ko lenga
        //System.out.println(str);

        //case 2
        String str = sc.nextLine();
        System.out.println(str);
    }

}
