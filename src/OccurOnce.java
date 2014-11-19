import java.util.*;

public class OccurOnce {

  public static void main(String[] args) {
    int[] arr = new int[]{ 1, 1, 2, 3, 3, 7, 56, 56, 3, 4, 4, 5, 5, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 14, 14};

    Arrays.sort(arr);

    if (arr.length == 1) {
      System.out.println(arr[0]);
      return;
    }

    for (int i = 1; i < arr.length - 1; i++) {
      if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1]) {
        System.out.println(arr[i]);
        return;
      }
    }

    System.out.println("No singles");

  }
}
