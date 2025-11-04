import java.util.Scanner;
public class ContarVocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una cadena: ");
        String cadena = sc.nextLine().toLowerCase();

        int contador = 0;

        for(int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        System.out.println("Cantidad de vocales: " + contador);
    }
}
