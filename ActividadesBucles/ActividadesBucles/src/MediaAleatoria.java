import java.util.Random;
public class MediaAleatoria {
    public static void main(String[] args) {

        Random rnd = new Random();
        int suma = 0;

        for(int i = 0; i < 10; i++) {
            int numero = rnd.nextInt(100) + 1;
            System.out.println("Número: " + numero);
            suma += numero;
        }

        double media = (double) suma / 10;
        System.out.println("La media es: " + media);
    }
}
