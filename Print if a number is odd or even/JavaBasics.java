//Print if a number is odd or even 

 import java.util.*;
 public class JavaBasics{
     public static void main(String[] args){
             Scanner sc = new Scanner(System.in);
             int number  =sc.nextInt();
             if(number  % 2 == 0){
                 System.out.println("Even Number");
             }else{
                 System.out.println("Odd Number ");
             }
     }
}

//example OUTPUT :- 5
//                 Odd Number