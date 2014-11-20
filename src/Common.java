import java.util.*;

public class Common {

  public static void main(String[] args) {
    int[] a = new int[]{1, 2, 3, 4, 6, 8, 1, 1, 1, 3, 5};
    int[] b = new int[]{5, 7, 6, 8, 9, 10, 11, 12, 5, 1, 1, 1};

    Arrays.sort(a);
    Arrays.sort(b);

    if (a[0] > b[0]) {
      int[] temp = a;
      a = b;
      b = temp;
    }

    List<Integer> common = new ArrayList<>();
    int ai = 0;
    int bi = 0;

    for (;;) {
      if (ai >= a.length || bi >= b.length) {
        break;
      }

      if (a[ai] == b[bi]) {
        common.add(a[ai]);
        ai++;
        bi++;
        continue;
      }

      if (bi > b.length - 1 || (ai < a.length - 1 && a[ai + 1] < b[bi + 1])){
        ai++;
      } else {
        bi++;
      }

    }

    System.out.println(common);

  }
}
