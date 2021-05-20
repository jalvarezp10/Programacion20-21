import java.util.Random;

public class ej7 {
    public static void main(String[] args) {
        int num[][]=new int[10][10];
        Random random=new Random();
        int max=0;
        int min=301;
        int media=0;
        for (int i = 0; i < num.length ; i++) {
            for (int j = 0; j < num.length ; j++) {
                num[i][j]=random.nextInt(300-200)+200;
                if (i==j){
                    System.out.print(num[i][j]+" ");
                    media+=num[i][j];
                    if (max<num[i][j]){
                        max=num[i][j];

                    }
                    if (min>num[i][j]){
                        min=num[i][j];

                    }
                }else {
                    System.out.print("   ");
                }




            }
            System.out.println();

        }
        System.out.println("El numero maximo es :" +max);
        System.out.println("El numero minimo es :" +min);
        System.out.println("La media es :" +media/10);




        
    }
}
