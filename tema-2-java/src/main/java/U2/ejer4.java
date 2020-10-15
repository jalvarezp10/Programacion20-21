package U2;

import java.util.Scanner;

public class ejer4 {
  public static void main(String[] args) {
    System.out.println("Introduce un numero de longitud");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.println("En millas son " + num * 1909);
  }
}
