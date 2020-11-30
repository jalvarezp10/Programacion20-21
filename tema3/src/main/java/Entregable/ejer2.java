package Entregable;

import java.util.Scanner;

public class ejer2 {
    public static void main(String[] args) {
        System.out.println("Intoruce un numero: ");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        convierteEnMorse(n);



    }
    public static int[] convierteEnMorse(int n){

       int codigo[] = new int[n];
        codigo[0] = Integer.parseInt("-----");
        codigo[1] = Integer.parseInt(".----");
        codigo[2] = Integer.parseInt("..---");
        codigo[3] = Integer.parseInt("...--");
        codigo[4] = Integer.parseInt("....-");
        codigo[5] = Integer.parseInt(".....");
        codigo[6] = Integer.parseInt("-....");
        codigo[7] = Integer.parseInt("--...");
        codigo[8] = Integer.parseInt("---..");
        codigo[9] = Integer.parseInt("----.");
        return codigo;


    }


}
