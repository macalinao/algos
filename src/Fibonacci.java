import java.util.*;

public class Fibonacci {

  public static void main(String[] args) {
    System.out.println(fib(50));
    System.out.println(fibIter(50));
  }

  public static long[] memo = new long[101];

  public static long fib(int x) {
    if (x <= 0) return 0;
    if (x == 1) return 1;
    if (x == 2) return 1;

    if (memo[x] != 0) {
      return memo[x];
    }

    memo[x] = fib(x - 2) + fib(x - 1);
    return  memo[x];
  }

  public static long fibIter(int x) {
    if (x <= 0) return 0;
    if (x == 1) return 1;
    if (x == 2) return 1;

    long a = 1;
    long b = 1;

    for (long i = 3; i <= x; i++) {

        long sum = a + b;
        a = b;
        b = sum;

    }

    return b;

  }

}
