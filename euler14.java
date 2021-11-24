public class euler14 {
  public static void main(String[] args) {
    int longestchain = 0;
    int currentchain = 1;
    for (int i = 2; i < 10; i++) {
      int num = i;
      currentchain = 0;
      while (num != 1) {
        if (num % 2 == 0) {
          num = num/2;
        } else {
          num = 3*num+1;
        }
        currentchain++;
        num++;
      }
    }
    if (currentchain > longestchain) {
      longestchain = currentchain;
    }
    System.out.println(longestchain);
  }
}