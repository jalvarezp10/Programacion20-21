package U2.Tarea8;

import java.util.Scanner;

public class ejer2 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int edad;
    int contador = 0;

    int suma = 0;

    int mayor_de_edad = 0;

    do {
      System.out.println("Introduce las edades de los alumnos: ");
      edad = sc.nextInt();

      if (edad > 0) {
        contador++;
        suma = suma + edad;
      }

      if (edad > 18) {
        mayor_de_edad++;
      }

    } while (edad > 0);

    System.out.println("Suma total de las edades:" + suma);

    int media;

    media = suma / (contador);

    System.out.println("Número de alumnos: " + (contador));

    System.out.println("Media de edad: " + media);
    System.out.println("Alumnos mayores de edad: " + mayor_de_edad);
  }
}
