public class LCM {
  public static void main(String[] args) {
    System.out.println(lcm(4, 7)); // 28
    System.out.println(lcm(4, 8)); // 8
  }

  public static int lcm(int a, int b) {
    return a * b / gcd(a, b);
  }

  // The euclidean algorithm
  public static int gcd(int a, int b) {
    if (a == 0) return b;
    while (b != 0) {
      if (a > b) {
        a = a - b;
      } else {
        b = b - a;
      }
    }
    return a;
  }

}
