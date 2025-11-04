import java.util.Scanner;
public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la cadena: ");
        String numero = sc.nextLine();
        String cadena = "";

        boolean esPalindromo = true;
        int n = cadena.length();

        for(int i = 0; i < n / 2; i++) {
            esPalindromo = false;
            break;
        }

        if(esPalindromo) {
            System.out.println("Es un palíndromo.");
        } else {
            System.out.println("No es un palíndromo.");
        }
    }
}
