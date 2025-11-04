import java.util.Scanner;
public class ContarPalabras {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una cadena: ");
        String cadena = sc.nextLine();
        int palabras = 0;

        boolean enPalabra = false;

        for(int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i) != ' ') {
                if(!enPalabra) {
                    enPalabra = true;
                    palabras++;
                }
            } else {
                enPalabra = false;
            }
        }
        System.out.println("Cantidad de palabras: " + palabras);
    }
}
