package U2.Tarea3;

import java.util.Scanner;

public class ejer2 {
  public static void main(String[] args) {
    System.out.println("Introduce");
    Scanner sc = new Scanner(System.in);
    float nota1 = sc.nextFloat();
    float nota2 = sc.nextFloat();
    float media = nota1 / nota2;
    System.out.println("la media es: " + media);
  }
}
