public class ej2 {
    public static void main(String[] args) {
        System.out.println(calculaExponente(3,28));



    }
    static int calculaExponente(int base, int num){


        int contador=0;

        while (num>0){

            if (num % base == 0){
                contador++;
                num=num/base;


            }else {
                return -1;

            }








        }




            return contador;








    }
}
