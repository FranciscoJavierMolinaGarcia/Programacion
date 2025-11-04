import java.util.Scanner;
import java.util.Random;
public class AdivinaDiez {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int secreto = rnd.nextInt(10) + 1;
        int intento;

        do {
            System.out.print("Adivina el número (1-10): ");
            intento = sc.nextInt();
            if(intento != secreto) {
                System.out.println("Intenta de nuevo.");
            } else {
                System.out.println("¡Correcto!");
            }
        } while(intento != secreto);
    }
}