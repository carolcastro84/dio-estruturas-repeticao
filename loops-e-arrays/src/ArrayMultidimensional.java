import java.util.Random;

public class ArrayMultidimensional {
    public static void main(String[] args) throws Exception {
        Random random = new Random();

        int [][] matrizAleatoria = new int[4][4];

        for (int i = 0; i < matrizAleatoria.length; i++){
            for (int x = 0; x < matrizAleatoria[i].length; x++){
                matrizAleatoria[i][x] = random.nextInt(9);
            }
        }

        for (int[] linha  : matrizAleatoria) {
            for (int elemento : linha) {
                System.out.print(elemento + "    " );
            }
            System.out.println("\n");
        }

    }
    
}
