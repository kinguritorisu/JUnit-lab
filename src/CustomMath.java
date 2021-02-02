public class CustomMath {

  public static int sum(int x, int y) {
    return x + y;
  }

  public static int division(int x, int y) {
    if (y == 0) {
      throw new IllegalArgumentException("Divider is 0");
    }
    return (x / y);
  }

  public static boolean isOdd(int x) {
    return x % 2 == 1;
  }

  public static void main(String[] args) {
    division(1, 0);
  }
}
