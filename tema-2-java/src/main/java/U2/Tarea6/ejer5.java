package U2.Tarea6;

import java.util.Scanner;

public class ejer5 {
  public static void main(String[] args) {
    System.out.println("Introduce el valor del radio");
    Scanner sc = new Scanner(System.in);
    int radio = sc.nextInt();

    System.out.println("1.Calcular diametro");
    System.out.println("2.Calcular perimetro");
    System.out.println("3.Calcular área");

    int a = sc.nextInt();
    switch (a) {
      case 1:
        System.out.println(2 * radio + " Es la longitud del diametro");
        break;
      case 2:
        System.out.println(2 * 3.14 * radio + " Es la longitud del perimetro");
        break;
      case 3:
        System.out.println(3.14 * radio * radio + " Es el area de la circunferencia");
        break;
      default:
        System.out.println("No existe esa opcion");
    }
  }
}
