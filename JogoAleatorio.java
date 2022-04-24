import java.util.Random;
import java.util.Scanner;

public class JogoAleatorio {

    public static void main(String[] args) {

        int qntdTentativa = 0, tentativa = 0;

        Random random = new Random();
        Scanner texto = new Scanner(System.in);

        int numeroAleatorio = random.nextInt(100);

        while (tentativa != numeroAleatorio){

            System.out.print("Digite um número entre 0 e 100 para adivinhar o número secreto: ");
            tentativa = texto.nextInt();

            if (tentativa > numeroAleatorio){
            System.out.println("O número que você escolheu é maior do que o secreto, tente novamente");
            qntdTentativa++;
            }
            else if (tentativa < numeroAleatorio) {
            System.out.println("O número que você escolheu é menor do que o secreto, tente novamente!");
            qntdTentativa++;
            } else {
                System.out.println("Parabéns você acertou!");
                qntdTentativa++;
            }
        }

        System.out.println("O número de tentativas até acertar foi de: " + qntdTentativa + "!");
        System.out.println("O número secreto entre de 0 até 100 para esta rodada foi " + numeroAleatorio + ".");

    }
}