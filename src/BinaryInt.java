import java.util.*;

public class BinaryInt {

  public static void main(String[] args) {
    printBinary(5); // 101
    printBinaryNonTroll(5);
    printBinary(12509); // 11000011011101
    printBinaryNonTroll(12509);
  }

  public static void printBinary(int num) {
    System.out.println(Integer.toString(num, 2));
  }

  public static void printBinaryNonTroll(int num) {
    String ret = "";
    for (int i = 0;; i++) {
      int shift = num >> i;
      if (shift == 0) break;
      if ((shift & 0x1) == 1) {
        ret = "1" + ret;
      } else {
        ret = "0" + ret;
      }
    }
    System.out.println(ret);
  }

}
