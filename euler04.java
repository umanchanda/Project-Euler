import java.io.*;
import java.util.*;
public class euler4 {
  public static void main(String[] args) {
    ArrayList<Integer> mylist = new ArrayList<Integer>();
    int product = 0;
    for (int a = 100; a <= 999; a++) {
      for (int b = 100; b <= 999; b++) {
        product = a * b;
        String prod = Integer.toString(product);
        if (isPalindrome(prod)) {
          int c = Integer.parseInt(prod);
          mylist.add(c);
        }
      }
    }
    Collections.sort(mylist);
    System.out.println(mylist);
  }
  
  public static boolean isPalindrome(String s) {
    StringBuilder sb = new StringBuilder(s);
    StringBuilder revsb = new StringBuilder(sb.reverse());
    String rev = revsb.toString();
    
    if (s.equals(rev)) {
      return true;
    }
    return false;
  }
  
  /* public static int findMax(ArrayList<Integer> list) {
    int max = 0;
    for (int i : list) {
      if (max > i) {
        max = i;
      }
    }
    return max;
  } */
}