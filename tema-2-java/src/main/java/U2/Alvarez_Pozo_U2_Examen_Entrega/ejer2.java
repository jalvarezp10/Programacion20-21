package U2.Entregable;

import java.util.Scanner;

public class ejer2 {
  public static void main(String[] args) {
    System.out.println("Introduzca un numero entero positivo");
    Scanner sc = new Scanner(System.in);
    long num = sc.nextLong();
    int pares = 0;
    int impares = 0;
    while (num > 0) {
      int digito = (int) (num % 10);
      if (digito % 2 == 0) {

        pares++;
      } else {
        impares++;
      }
      num = num - digito;
      num = num / 10;
    }
    System.out.println("Hay " + impares + " impares");
    System.out.println("Hay " + pares + " pares");
  }
}
