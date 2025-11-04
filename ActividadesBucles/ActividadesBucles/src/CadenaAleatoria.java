import java.util.Random;
import java.util.Scanner;
public class CadenaAleatoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Longitud de la cadena: ");
        int num = sc.nextInt();

        String cadena = "";

        for(int i = 0; i < num; i++){
            char c = (char)(rnd.nextInt(26)+ 'a');
            cadena += c;
        }
        System.out.println("Cadena aleatoria: " + cadena);
    }
}
