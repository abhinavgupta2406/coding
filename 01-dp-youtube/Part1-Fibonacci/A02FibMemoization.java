import java.util.HashMap;
import java.util.Map;

public class A02FibMemoization {
  
  /**
   * Memoization
   * 
   * Time: O(n) - picture the tree and there will be only 2 nodes for each element top to bottom
   * Space: O(n)
   */
  private static int fib(int n, Map<Integer, Integer> memo) {
    if (memo.containsKey(n)) { return memo.get(n); }
    if (n <= 2) { return 1; }
    memo.put(n, fib(n-1, memo) + fib(n-2, memo));
    return memo.get(n);
  }

  public static void main(String args[]) {
    Map<Integer, Integer> memo = new HashMap<>();
    System.out.println(fib(5, memo));
    System.out.println(fib(6, memo));
    System.out.println(fib(7, memo));
    System.out.println(fib(50, memo)); // Although returning wrong values, but fast
  }
}
