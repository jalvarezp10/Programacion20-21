import jdk.swing.interop.SwingInterOpUtils;

import java.util.Random;

public class ej4 {


    public static void main(String[] args) {
        String [] pais = {"España", "Rusia", "Japón","Australia"};

        Random ramdom = new Random();

        int[] min= new int[]{210, 210, 210, 210};
        int[] max= new int[]{140, 140, 140, 140};
        int media[] =new int[4];
        int estaturas[][] = new int[4][10];
        for (int i = 0; i < pais.length; i++) {
            System.out.println(pais[i]+" :");


        }
        for (int i = 0; i < estaturas.length; i++) {
            for (int j = 0; j < 10; j++) {
                estaturas[i][j] = ramdom.nextInt(210 - 140) + 140;


            }
        }
        for (int i = 0; i < estaturas.length; i++) {

            for (int j = 0; j <10 ; j++) {

                media[i]=(media[i]+estaturas[i][j]);
                if (estaturas[i][j]<min[i]){
                    min[i]=estaturas[i][j];
                }
                if (estaturas[i][j]>max[i]){
                    max[i]=estaturas[i][j];
                }
                System.out.print(estaturas[i][j]+" ");




            }
            System.out.print("| "+media[i]/10+" "+max[i]+" "+min[i]+" ");
            System.out.println();














        }


    }



}
