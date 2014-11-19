import java.util.*;

public class Merge {
  public static void main(String[] args) {
    int[] a = {1, 3, 5, 7};
    int[] b = {2, 4, 6, 8, 0, 0, 0, 0};

    int n = a.length;
    int ai = n - 1;
    int bi = n - 1;

    for (int i = b.length - 1; i >= 0; i--) {
      int an = ai >= 0 ? a[ai] : 0;
      int bn = bi >= 0 ? b[bi] : 0;

      if (an > bn) {
        b[i] = an;
        ai--;
      } else {
        b[i] = bn;
        bi--;
      }
    }

    System.out.println(Arrays.toString(b));

  }
}
