package U2.Tarea6;

import java.util.Scanner;

public class ejer2 {
  public static void main(String[] args) {
    System.out.println("Escribe un numero del uno al diez");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    switch (num) {
      case 1:
        System.out.println("uno");
        break;
      case 2:
        System.out.println("dos");
        break;
      case 3:
        System.out.println("tres");
        break;
      case 4:
        System.out.println("cuatro");
        break;
      case 5:
        System.out.println("cinco");
        break;
      case 6:
        System.out.println("seis");
        break;
      case 7:
        System.out.println("siete");
        break;
      case 8:
        System.out.println("ocho");
        break;
      case 9:
        System.out.println("nueve");
        break;
      case 10:
        System.out.println("diez");
        break;
    }
  }
}
