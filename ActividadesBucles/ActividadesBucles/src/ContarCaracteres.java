import java.util.Scanner;
public class ContarCaracteres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cadena: ");
        String cadena = sc.nextLine();

        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            contador++;
        }

        System.out.println("La cadena tiene: " + contador + " caracteres.");
    }
}
