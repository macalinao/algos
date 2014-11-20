import java.util.*;

public class BinaryRotated {

  public static void main(String[] args) {
    int[] a = new int[]{11, 12, 13, 14, 15, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    System.out.println(bsr(6, a, 0, a.length - 1)); // 2
  }

  public static int bsr(int find, int[] a, int start, int end) {
    int mid = start + (end - start) / 2;

    // Handles arrays of 1 el
    if (a[mid] == find) {
      return mid;
    }

    if (a[start] > a[mid] && (find > a[start] || find < a[mid])) {
      // anomaly -- left rotated and find in there
      return bsr(find, a, start, mid);

    } else if (a[mid] > a[end] && (find < a[end] || find > a[mid])) {
      // anomaly -- right rotated and find in there
      return bsr(find, a, mid, end);

    } else if (a[start] < a[mid] && find < a[mid]) {
      // Normal -- first half
      return bsr(find, a, start, mid);

    } else if (a[mid] < a[end] && find > a[mid]) {
      // Normal -- last half
      return bsr(find, a, mid, end);
    }

    return -1;
  }

}
