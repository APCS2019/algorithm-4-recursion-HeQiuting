public class Recursion{
   //part1: factorial non-recursion
   public static int factorialFor(int n){
      int temp = 1;
      for(int i = 2; i <= n; i++){
         temp = i * temp;
      }
      return temp;
   }
   
   
   
   //part2: factorial recursion
   public static int factorial(int n){
      if(n == 0 || n == 1){
         return 1;
      }
      return n * factorial(n - 1);
   }
   
   
   
   //part3: fibonacci sequence non-recursion
   public static int fibonacci(int n){
      int first = 1;
      int second = 1;
      int temp = 1;
      for(int i = 2; i <= n; i++){
         temp = fibonacci(i - 1) + fibonacci(i - 2);
      }
      return temp;
      //
    
         
   
   
   //part4: fibonacci sequence recursion
   public static int fibo(int n){
      if(n == 1 || n == 2){
         return 1;
      }
      return fibo(n - 1) + fibo(n - 2)
   }


}
