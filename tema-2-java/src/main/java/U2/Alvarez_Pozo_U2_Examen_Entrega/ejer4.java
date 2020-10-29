package U2.Entregable;

import java.util.Scanner;

public class ejer4 {
  public static void main(String[] args) {
    System.out.println("Introduce un numero");
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();

    for (int i = num; i < num + 5; i++) {
      int num_divisibles = 0;
      for (int j = 1; j <= i; j++) {
        if ((i % j) == 0) {
          num_divisibles++;
        }
      }
      if (num_divisibles <= 2) {
        System.out.println(i + " Es primo");

      } else {
        System.out.println(i + " no es primo");
      }
    }
  }
}
