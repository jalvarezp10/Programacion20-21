package U2.Tarea5;

import java.util.Scanner;

public class ejer5 {
  public static void main(String[] args) {
    System.out.println("Introduce 3 numeros");
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    if (a > b && a > c) {
      System.out.println(a + " Es el mayor numero");
    } else if (b > a && b > c) {
      System.out.println(b + " Es el mayor numero");
    } else {
      System.out.println(c + " Es el mayor numero");
    }
  }
}
