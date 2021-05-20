import java.util.Random;
import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int altura= sc.nextInt();
        int ancho=sc.nextInt();
        Random random=new Random();

        char pecera[][]=new char[altura][ancho];
        for (int i = 0; i < altura ; i++) {
            for (int j = 0; j < ancho ; j++) {

                if(i==0 || i==altura-1 ||j==0||j==ancho-1){
                    pecera[i][j]='*';

                }else {
                    pecera[i][j]=' ';

                }


            }

        }
        pecera[random.nextInt(altura-2)+1][random.nextInt(ancho-2)+1]='&';
        for (int i = 0; i < altura ; i++) {
            for (int j = 0; j < ancho ; j++) {

                System.out.print(pecera[i][j]);


            }
            System.out.println();

        }


    }
}
