public class VariablesQuestions {

    public static void main (String[] args){

        //LEVEL 1 VARIABLES QUESTION (1 TO 15)

        //DAY ---01


        int num = 10;
        System.out.println("print num:" + num );

        double num2 = 5.5;
        System.out.println("print num2:" + num2);

        char grade ='A';
        System.out.println("print grade:" +grade);

         String name = "Nikhildon";
         System.out.println("my name is:" + name);

         boolean isStudent = true;
         System.out.println("mai hu yaa nhi:" + isStudent);

         //make two variable then print

        char myvar1 = 78;
        char myvar2 = 82;

        System.out.println("first variable:" + myvar1);
        System.out.println("second variable:" + myvar2);

        //print value of a and b

        int a = 5;
        int b = 10;

        System.out.println("first variable a:" + a);
        System.out.println("second variable b:" + b);

        //print x+y
        int x = 15;
        int y= 59;

        System.out.println("sum:" +(x+y));

        //print p-q
        int p = 12;
        int q = 23;

        System.out.println("minus:" + (p-q));

        //print A*B
        int A=89;
        int B=6589;

        System.out.println("multiply:" + (A*B));

        //PRINT Y/Z

        int Y = 98;
        int Z = 2;

        System.out.println("divide:" + (Y/Z));

        // PUT DECIMAL IN INT

          /*int decimal = 90.3; //int kewal whole numbers print krta hai

        System.out.println(decimal);*/



        // Add string + string

        String firstname = "Nikhil";
        String lastName= "tripathi";

        String fullName = firstname+ " " + lastName;

        System.out.println(fullName);

        //int + string print krna hai

        int sprite = 10;
        String coldrink = "sprite";

        System.out.println("int value: " + sprite);
        System.out.println("string: " + coldrink);


        //one variable change value

        int mynum = 10;
        System.out.println("BEFORE: "+ mynum);

        mynum = 30;
        System.out.println("AFTER: " + mynum);


        //level-2 start beginers

        //DAY-2-------QUE.1 TO 15

        //PRINT 3 VARIABLES SUM


        int m1 = 21;
        int m2 = 32;
        int m3 = 42;


        System.out.println("SUM: " +(m1+m2+m3));


        //AVERAGE OF TWO NUMBERS

        int n = 12;
        int r = 23;
         double avg = (n+ r)/8.5;

        System.out.println("Average: " + avg);


        // square of numbers

        int W = 32;

        int SQUARE = W*W ;

        System.out.println("square: " + SQUARE);


        //cube of numbers

        int K = 981;

        int cube = K*K*K;

        System.out.println("CUBE:" + cube);


        // AREA OF RECTANGLE

        int length = 21;
        int breadth = 43;

        int area = length * breadth;
        System.out.println("AREA OF RECTANGLE:" + area);


        // AREA OF CIRCLE
        int R = 23;

        double pi = 3.14;

        double areaofcircle = pi*R*R;
        System.out.println("CIRCLE:" + areaofcircle);

        // CELCIUS to FERANHITE

        int celsius = 23;
        double Fahrenheit = (celsius*9.0/5)+32;

        System.out.println("FARANHEIT:" + Fahrenheit);

        //SWAP TWO NUMBERS WITHOUT TEMP (tricky ques)

        int M = 23;
        int N = 54;

        System.out.println("BEFORE SWAP: a = " + M + " , b =" + N);


        M=M+N; // logic...
        N=M-N;
        M=M-N; //.....logic

        System.out.println("AFTER SWAP: a = " + M + " , b =" + N);


        //largest of 2 numbers

        int H = 89;
        int L = 88;
        if (H>L){
            System.out.println("h is greater");
        } else if (H<L) {
            System.out.println("L is greater");
        } else{
            System.out.println("both are equal");
        }


        // CHECK EVEN ODD

        int MYNUM = 22;

        if (MYNUM%2==0) {
            System.out.println("even");

        }else{
            System.out.println(" ODD");
        }

        // ASCII OF CHARACTER (using typecasting)
        char ch = 'A';
         System.out.println((int) ch); // one type change another type

         int in = 98;
         System.out.println((char) in); // one type change another type

        // int convert to double

        int e=23;
        System.out.println((double) e);

        //double to int

        double d = 3.3;
        System.out.println((int) d);

        //boolean check

        boolean isteacher = true;

        if (isteacher) {
            System.out.println("true");
        } else{
            System.out.println("false");
        }











    }
}
