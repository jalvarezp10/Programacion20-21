import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int altura;

        do {
            System.out.println("Inserte altura");
            altura=sc.nextInt();

        } while (altura<3 && altura%2==0);
        for (int i = 1; i <=altura ; i++) {
            for (int j = 1; j <=altura ; j++) {
                if (i==j||i+j==altura+1){
                    System.out.print("*");

                }else  {
                    System.out.print(" ");

                }


            }
            System.out.println();

        }

    }
}
