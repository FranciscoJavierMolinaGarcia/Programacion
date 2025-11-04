import java.util.Scanner;
import java.util.Random;
public class JuegoAdivinanza {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numeroSecreto = rand.nextInt(100) + 1;
        int num;

        do {
            System.out.print("Adivina el número (1-100): ");
            num = sc.nextInt();
            if(num < numeroSecreto) {
                System.out.println("Es mayor.");
            } else if(num > numeroSecreto) {
                System.out.println("Es menor.");
            } else {
                System.out.println("¡Correcto!");
            }

        } while(num != numeroSecreto);
    }
}

