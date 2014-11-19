import java.util.*;

public class RotateCheck {
  public static void main(String[] args) {
    System.out.println(isRotated(new int[]{1, 2, 3, 5, 1, 2, 3}, new int[]{3, 5, 1, 2, 3, 1, 2}));
    System.out.println(isRotated(new int[]{1, 2, 3, 5, 1, 2, 3}, new int[]{3, 5, 1, 2, 4, 1, 2}));
    System.out.println(isRotated(new int[]{1, 2, 3, 5, 1, 2, 3}, new int[]{1, 2, 3, 5, 1, 2, 3}));
  }

  public static boolean isRotated(int[] a, int[] b) {
    if (a.length != b.length) return false;

    int start = a[0];

    main: for (int i = 0; i < b.length; i++) {

      if (b[i] != start) {
        continue;
      }

      for (int j = 0; j < a.length; j++) {
        
        int bindex = j + i;
        if (bindex > b.length - 1) {
          bindex -= b.length;
        }

        if (a[j] != b[bindex]) {
          continue main;
        }
        
      }
      return true;

    }

    return false;
  }
}
