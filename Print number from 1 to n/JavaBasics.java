//Print number from 1 to n

 import java.util.*;
 public class JavaBasics {

   public static void main(String[] args) {
    
     Scanner sc = new Scanner(System.in);
     int range = sc.nextInt();
     int counter = 1;

     while (counter<= range ){
       System.out.println(counter+" ");
       counter++;
     }
     System.out.println();
   }
}
//example OUTPUT :- 1 2 3 4 5 