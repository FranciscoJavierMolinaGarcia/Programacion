import java.util.Scanner;
public class CambiarCaso {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Cadena: ");
        String cadena = sc.nextLine();
        String modif = "";

        for(int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if(Character.isLowerCase(c)) {
                modif += Character.toUpperCase(c);
            } else if(Character.isUpperCase(c)) {
                modif += Character.toLowerCase(c);
            } else {
                modif += c;
            }
        }
        System.out.println("Cadena modificada: " + modif);
    }
}
