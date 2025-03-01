//Check if a student will Pass or Fail

import java.util.*;

    public class JavaBasics{
      public static void main(String[] args){
         Scanner sc =  new Scanner(System.in);
         int marks = sc .nextInt();
         String status= ((marks >=33))?"pass":"fail";
         System.out.println(status);
     }
}

//example OUTPUT:- 95
//                 pass