public class CWN_09_PS_PR2 {
     public static void main(String []args){
         char grade = 'b';
         grade = (char)(grade + 8);
         System.out.println(grade);

         //Decrypting the grade
         grade = (char)(grade - 8);
         System.out.println(grade);
     }
}
