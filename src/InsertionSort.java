import java.util.*;

class InsertionSort {

  public static void main(String[] args) {
    int[] arr = new int[]{5, 3, 7, 2, 56, 21, 5, 9, 22, 123, 0};

    for (int i = 1; i < arr.length; i++) {

      for (int j = i - 1; j >= 0; j--) {
        if (arr[j + 1] < arr[j]) {
          int temp = arr[j + 1];
          arr[j + 1] = arr[j];
          arr[j] = temp;
        } else {
          break;
        }
      }

    }

    System.out.println(Arrays.toString(arr));
  }

}
