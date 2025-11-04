import java.util.Scanner;
public class CadenasVariables {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int contador = 0;
        String masLarga = "";

        while(true) {
            System.out.print("Ingresa una cadena ('salir' para terminar): ");
            String cadena = sc.nextLine();

            if(cadena.equals("salir")) break;
            contador++;
            if(cadena.length() > masLarga.length()) masLarga = cadena;
        }

        System.out.println("Cadenas ingresadas: " + contador);
        System.out.println("La cadena más larga es: " + masLarga);
    }
}
