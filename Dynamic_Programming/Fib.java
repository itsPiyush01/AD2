public class Fib {

     public static void main(String[] args) {

          // 0 1 1 2 3 5 8 12

          // TIME O(a^n) a=1.6
          /*
           * FIB_r Fibonacci Numbers by Recursion
           */

          int n = 45;
          long start = System.nanoTime();

          System.out.println(fib_r(n));// 8
          long end = System.nanoTime();
          long elapsedTime = end - start;
          System.out.println("Time: " + elapsedTime);

          /*
           * FIB_C Fibonacci Numbers by Caching
           */

          start = System.nanoTime();

          f_c[0] = 0;
          f_c[1] = 1;
          for (int i = 2; i <= n; i++) {
               f_c[i] = -1;
          }
          System.out.println(fib_c(n));
          end = System.nanoTime();
          elapsedTime = end - start;
          System.out.println("Time: " + elapsedTime);

          /*
           * Fibonacci Numbers by Dynamic Programming
           */

          start = System.nanoTime();

          System.out.println(fib_dp(n));
          end = System.nanoTime();
          elapsedTime = end - start;
          System.out.println("Time: " + elapsedTime);

          /*
           * Fibonacci Ultimate
           */
          start = System.nanoTime();
          System.out.println(fib_ult(n));
          end = System.nanoTime();
          elapsedTime = end - start;
          System.out.println("Time: " + elapsedTime);

     }

     public static int fib_r(int n) {
          if (n == 1 || n == 0)
               return n;
          return fib_r(n - 1) + fib_r(n - 2);
     }

     public static int MAXN = 45;
     public static int UNKNOWN = -1;
     public static int[] f_c = new int[MAXN + 1];

     /*
      * FIB_C Fibonacci Numbers by Caching
      */
     public static int fib_c(int n) {
          if (f_c[n] == -1) {
               f_c[n] = fib_c(n - 1) + fib_c(n - 2);
          }

          return (f_c[n]);
     }

     /*
      * FIB_DP Fibonacci Numbers by Dynamic Programming
      */

     public static int fib_dp(int n) {
          int i;
          int f[] = new int[MAXN + 1];

          f[0] = 0;
          f[1] = 1;
          for (i = 2; i <= n; i++) {
               f[i] = f[i - 1] + f[i - 2];
          }
          return (f[n]);
     }

     public static int fib_ult(int n) {
          int i = 0;
          int a = 0, b = 1;
          int c = 0;
          for (i = 2; i <= n; i++) {
               c = a + b;
               a = b;
               b = c;

          }

          return c;
     }

}