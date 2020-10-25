package U2.Tarea8;

import java.util.Scanner;

public class ejer4 {
  public static void main(String[] args) {
    System.out.println("Introduce un numero");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      System.out.println(i);
    }
  }
}
