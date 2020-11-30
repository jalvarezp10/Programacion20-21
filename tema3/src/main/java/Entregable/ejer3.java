package Entregable;

import java.util.Scanner;

public class ejer3 {
    public static void main(String[] args) {
        System.out.println("Introduce el tamaño de array");
        Scanner sc=new Scanner(System.in);
        int aleatorio=(int) (Math.random()*(200-100+1))+100;
        int tamaño= sc.nextInt();
        int array [][] = new int[tamaño][tamaño];
        for (int x=100;x<=array.length;x++)
            for (int y = 100; y <=array.length ; y++) {
                array[x][y]= aleatorio;
            }
        System.out.println(array);




    }
}
