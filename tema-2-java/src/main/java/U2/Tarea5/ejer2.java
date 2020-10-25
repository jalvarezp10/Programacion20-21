package U2.Tarea5;

import java.util.Scanner;

public class ejer2 {
  public static void main(String[] args) {
    System.out.println("Introduce el numero 12");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    if (a == 12) {
      System.out.println("Correcto");

    } else {
      System.out.println("Incorrecto");
    }
  }
}
