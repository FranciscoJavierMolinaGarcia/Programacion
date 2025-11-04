import java.util.Scanner;
public class ContarConsonantes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Cadena: ");
        String cadena = sc.nextLine().toLowerCase();
        int contador = 0;

        for(int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if("bcdfghjklmnpqrstvwxyz".indexOf(c) != -1) {
                contador++;
            }
        }
        System.out.println("Cantidad de consonantes: " + contador);
    }
}
