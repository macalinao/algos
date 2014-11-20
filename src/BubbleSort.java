import java.util.*;

class BubbleSort {

  public static void main(String[] args) {
    int[] arr = new int[]{5, 3, 7, 2, 56, 21, 5, 9, 22, 123, 0};

    boolean sorted = false;
    while (!sorted) {
      sorted = true;
      for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] > arr[i + 1]) {
          int temp = arr[i + 1];
          arr[i + 1] = arr[i];
          arr[i] = temp;
          sorted = false;
        }
      }
    }

    System.out.println(Arrays.toString(arr));
  }

}
