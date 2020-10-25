package U2.Tarea5;

import java.util.Scanner;

public class ejer1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un numero");
    int a = sc.nextInt();
    if (a < 0) {
      System.out.println("Es negativo");

    } else if (a > 0) {
      System.out.println("Es positivo");
    } else {
      System.out.println("Es cero");
    }
  }
}
