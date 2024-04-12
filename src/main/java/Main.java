
public class Main {
  public static void main(String[] args) {
    long ant = 9223372036854775807L;
    int real = 2147483647;
    short antslay = (short) 400;
    bingen(ant);
  }
  public static void bingen(long num) {
    if (num > 0) {
      System.out.print(num % 2);
      bingen(num / 2);
    }
  }
}

