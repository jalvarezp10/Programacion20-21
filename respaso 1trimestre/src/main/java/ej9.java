import java.util.Random;

public class ej9 {
    public static void main(String[] args) {
        Random random = new Random();
        int num_notas = 4 * (random.nextInt(7 - 1) + 1);
        int contador = 0;
        int indice_primera_nota=0;
        System.out.println(num_notas);
        String notas[] = {"do", "re", "mi", "fa", "sol", "la", "si"};
        String melodia = "";
        for (int i = 0; i < num_notas; i++) {
            if (i!=num_notas-1) {

                int numero_aleatorio = random.nextInt(7);
                if (i == 0) {
                    indice_primera_nota = numero_aleatorio;
                }
                melodia += notas[numero_aleatorio];
                melodia+=" ";
                contador++;
                if (contador == 4) {
                    melodia += "| ";
                    contador = 0;
                }
            }else {
                melodia+=notas[indice_primera_nota];
                melodia+= "|| ";
            }


        }
        System.out.println(melodia);


    }
}
