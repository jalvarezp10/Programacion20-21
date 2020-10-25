package U2.Tarea5;

import java.util.Scanner;

public class ejer3 {
  public static void main(String[] args) {
    System.out.println("Introduce un numero");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    if (a % 2 == 0) {
      System.out.println("No es impar");

    } else {
      System.out.println("Es impar");
    }
  }
}
