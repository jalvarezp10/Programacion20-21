import java.util.Scanner;

public class ej17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("introduce la altura");
        int altura= sc.nextInt();
        for (int i = 1; i <=altura ; i++) {
            for (int j = 1; j <=altura ; j++) {
                if (i==1||j==1||i+j==altura+1){
                    System.out.print("*");

                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}
