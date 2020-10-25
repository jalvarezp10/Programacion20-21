package U2.Tarea8;

import java.util.Scanner;

public class ejer1 {
  public static void main(String[] args) {
    System.out.println("Introduce un numero");
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    while (i != 0) {
      if (i % 2 == 0) {
        System.out.println("Par");
      } else {
        System.out.println("Impar");
      }
      i = sc.nextInt();
    }
    System.out.println("Finiquitao");
  }
}
