package U2.Tarea8;

import java.util.Scanner;

public class ejer3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num_azar = (int) (Math.random() * 100 + 1);
    System.out.println("Introduce un numero a ver si coincide con el aleatorio");
    int num = sc.nextInt();
    while (num != num_azar || num == -1) {
      if (num > num_azar) {
        System.out.println("Mas pequeño");
      } else {
        System.out.println("Mas grande");
      }
      num = sc.nextInt();
    }
    System.out.println("Enhorabuena");
  }
}
