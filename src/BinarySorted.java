import java.util.*;

public class BinarySorted {

  public static void main(String[] args) {
    int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    System.out.println(bs(4, a)); // 3
  }

  public static int bs(int find, int[] a) {
    int low = 0;
    int high = a.length - 1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (find < a[mid]) {
        high = mid - 1;
      } else if (find > a[mid]) {
        low = mid + 1;
      } else {
        return mid;
      }
    }
    return -1;
  }
}
