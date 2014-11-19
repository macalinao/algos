import java.util.*;

public class RmSpaces {
  public static void main(String[] args) {
    String input = "  I      am   a student.";

    System.out.println(rmSpaces(input));
    System.out.println(rmSpacesHard(input));
  }

  public static String rmSpaces(String input) {
    String[] parts = input.split("[ ]+");
    String ret = "";
    for (String p : parts) {
      if (p.equals("")) continue;
      ret += p + " ";
    }
    return ret.substring(0, ret.length() - 1);
  }

  public static String rmSpacesHard(String input) {
    StringBuilder s = new StringBuilder();

    char last = ' ';

    for (char c : input.toCharArray()) {
       if (!(last == ' ' && c == ' ')) {
         s.append(c);
       }
       last = c;
    }

    return s.toString();
  }
}
