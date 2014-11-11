import java.util.*;

public class MergeSort {
  public static void main(String[] args) {
    int[] toSort = new int[]{5, 3, 2, 8, 1, 4, 7, 6};

    System.out.println(Arrays.toString(mergeSort(toSort)));
  }

  public static int[] mergeSort(int[] unsorted) {
    if (unsorted.length == 2) {
      return new int[] {Math.min(unsorted[0], unsorted[1]), Math.max(unsorted[0], unsorted[1])};
    }

    int[] a = new int[unsorted.length / 2];
    int[] b = new int[unsorted.length / 2];
    for (int i = 0; i < unsorted.length / 2; i++) {
      a[i] = unsorted[i];
      b[i] = unsorted[unsorted.length - (unsorted.length / 2 - i)];
    }

    a = mergeSort(a);
    b = mergeSort(b);

    int[] sorted = new int[unsorted.length];

    int ap = 0;
    int bp = 0;

    for (int i = 0; i < sorted.length; i++) {
      if (bp >= b.length || (ap < a.length && a[ap] < b[bp])) {
        sorted[i] = a[ap++];
      } else {
        sorted[i] = b[bp++];
      }
    }

    return sorted;
  }
}
