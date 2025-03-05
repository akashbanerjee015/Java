//Print  sum of first n natural number 

 import java.util.*;
  public class JavaBasics {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int sum =0 ;

     int i = 1;
     while(i <= n ){
       sum += i;
       i++;
     }
     System.out.println("Sum is " + sum);

    }
   }

//example OUTPUT :- 5
//                  Sum is 15   
