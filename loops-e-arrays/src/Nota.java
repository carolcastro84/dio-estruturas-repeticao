import java.util.Scanner;

public class Nota {
    /*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/
public static void main(String[] args) throws Exception { 
    int nota;
    Scanner scan = new Scanner(System.in);

    while (true){
        System.out.println("Informe uma nota entre 0 e 10.");
        nota = scan.nextInt();

        if (nota >= 0 && nota <= 10) break;

        System.out.println("Nota inválida, informe novamente!");
    }

    }

}
