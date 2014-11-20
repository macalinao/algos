import java.util.*;

public class BinaryRecursive {

  public static void main(String[] args) {
    int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    System.out.println(bsrec(6, a, 0, a.length - 1)); // 5
  }

  public static int bsrec(int find, int[] a, int start, int end) {
    int mid = start + (end - start) / 2;

    if (a[mid] == find) {
      return mid;
    } else if (find < a[mid]) {
      return bsrec(find, a, start, mid);
    } else if (find > a[mid]) {
      return bsrec(find, a, mid, end);
    }

    return -1;
  }

}
