package U2.Tarea5;

import java.util.Scanner;

public class ejer4 {
  public static void main(String[] args) {
    System.out.println("Introduce dos numeros");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    if (a % 2 == 0 && b % 2 == 0) {
      System.out.println("Los dos soon numeros pares");
    } else if (a % 2 == 0 || b % 2 == 0) {
      System.out.println("Solo 1 numero es par");
    } else {
      System.out.println("Ninguno de los dos son par");
    }
  }
}
