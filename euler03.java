import java.util.*;
public class euler3 {
  public static void main(String[] args) {
    long num = 600851475143L;
    for (long i = 1L; i < num; i++) {
      if (num % i == 0) {
        if (isPrime(i)) {
          System.out.println(i);
        }
      }
    }
  }
  
  public static boolean isPrime(long l) {
    for (long i = 2L; i < l; i++) {
      if (l % i == 0) {
        return false;
      }
    }
    return true;
  }
}