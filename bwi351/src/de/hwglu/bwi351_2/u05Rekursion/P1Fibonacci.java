package de.hwglu.bwi351_2.u05Rekursion;

public class P1Fibonacci {
  static long fib(long n) {
    if (n == 0 || n == 1)
      return n;
    else
      return fib(n-2)+ fib(n-1);
    }

// Fibonacci von n (iterativ)
  static long fibIterative(long n) {
// hier kommt die L�sung rein


    return 1;
  }

  public static void main(String[] args) {
      for (long i = 0; i <= 20; i++)
   System.out.println("fib(" + i + "): rekursiv: " + fib(i) + ", iterativ: " + fibIterative(i));
//  Versuch einer Laufzeiteinsch�zung
     long i = 40;
    System.out.println("fib(" + i + "): iterativ: " + fibIterative(i));
    System.out.println("fib(" + i + "): rekursiv: " + fib(i));

  }
}