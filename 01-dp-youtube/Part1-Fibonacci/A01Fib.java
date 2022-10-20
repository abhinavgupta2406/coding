class A01Fib {
  /**
   * 1, 2, 3, 4, 5, 6, 7, 8
   * 1, 1, 2, 3, 5, 8, 13, 21
   * 
   * Time: O(2^n) - Because at each level of tree there are 2 additional nodes
   * Space: O(n) - Because after function returns, value is deleted from recursion stack.
   */
  private static int fib(int n) {
    if (n <= 2) { return n; }
    return fib(n-1) + fib(n-2);
  }

  public static void main(String args[]) {
    System.out.println(fib(5));
    System.out.println(fib(6));
    System.out.println(fib(7));
    System.out.println(fib(8));
    System.out.println(fib(50)); // It will take huge time
  }
}