import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;

        do {
            System.out.print("Inserta la altura: ");
            altura = sc.nextInt();
        } while (altura <= 0);

        for (int i = 0; i <= altura - 2; i++) {

            for (int j = 0; j <= altura - 1; j++) {
                if (j == 0 || j == altura - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        for (int i = 0; i < altura - 1; i++) {
            if (i == 0) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
    }}
