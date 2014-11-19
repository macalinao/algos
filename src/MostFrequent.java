import java.util.*;

public class MostFrequent {
  public static void main(String[] args) {
    int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 1, 2, 2, 2, 3, 4, 5, 6, 7, 8, 9, 5, 5, 5, 5, 5};

    Arrays.sort(arr);

    int most = arr[0];
    int mostCt = 0;

    int curr = arr[0];
    int ct = 0;

    for (int i = 0; i < arr.length; i++) {

      int n = arr[i];
      if (n != curr) {
        if (ct > mostCt) {
          most = curr;
          mostCt = ct;
        }
        curr = n;
        ct = 1;
        continue;
      }

      ct++;
    }

    if (ct > mostCt) {
      most = curr;
      mostCt = ct;
    }

    System.out.println(most);

  }
}
