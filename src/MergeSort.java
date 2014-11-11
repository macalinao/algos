import java.util.*;

public class MergeSort {
  public static void main(String[] args) {
    int[] toSort = new int[]{5, 3, 2, 8, 1, 4, 7, 6};
    int[] toSortOdd = new int[]{5, 3, 2, 8, 1, 9, 4, 7, 6};

    System.out.println(Arrays.toString(mergeSort(toSort)));
    System.out.println(Arrays.toString(mergeSort(toSortOdd)));
  }

  public static int[] mergeSort(int[] unsorted) {
    if (unsorted.length == 2) {
      return new int[] {Math.min(unsorted[0], unsorted[1]), Math.max(unsorted[0], unsorted[1])};
    }

    boolean odd = unsorted.length % 2 != 0;
    int oddVal = unsorted[unsorted.length / 2];
    int[] a = new int[unsorted.length / 2];
    int[] b = new int[unsorted.length / 2];
    for (int i = 0; i < unsorted.length / 2; i++) {
      a[i] = unsorted[i];
      b[i] = unsorted[i + (odd ? 1 : 0) + unsorted.length / 2];
    }

    a = mergeSort(a);
    b = mergeSort(b);

    int[] sorted = new int[unsorted.length];

    int ap = 0;
    int bp = 0;
    boolean oddUsed = false;

    for (int i = 0; i < sorted.length; i++) {
      boolean aOut = ap >= a.length;
      boolean bOut = bp >= b.length;

      if (bOut) {
        if (odd && a[ap] > oddVal && !oddUsed) {
          sorted[i] = oddVal;
          oddUsed = true;
        } else {
          sorted[i] = a[ap++];
        }
      } else if (aOut) {
        if (odd && b[bp] > oddVal && !oddUsed) {
          sorted[i] = oddVal;
          oddUsed = true;
        } else {
          sorted[i] = b[bp++];
        }
      } else {
        if (odd && a[ap] > oddVal && b[bp] > oddVal && !oddUsed) {
          sorted[i] = oddVal;
          oddUsed = true;
        } else if (a[ap] < b[bp]) {
          sorted[i] = a[ap++];
        } else {
          sorted[i] = b[bp++];
        }
      }

    }

    return sorted;
  }
}
