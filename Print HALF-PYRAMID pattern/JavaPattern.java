//Print HALF-PYRAMID pattern 

 public class JavaPattern{
          public static void main(String[] args) {
             int n = 4 ;

             for( int line = 1 ; line<= n ; line++ ){
                 //numbers print
                 for(int number = 1; number <= line; number++){
                     System.out.print(number);
                 }
                 System.out.println();
             }
         }
    }
    //OUTPUT:- 1
    //         12       
    //         123
    //         1234