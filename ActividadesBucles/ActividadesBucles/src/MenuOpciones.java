import java.util.Scanner;
public class MenuOpciones {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("-------------------------");
            System.out.println("1: Contar caracteres");
            System.out.println("2: Invertir cadena");
            System.out.println("3: Salir");
            System.out.print("Elige una opción: ");
            System.out.println("-------------------------");
            opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion) {
                case 1:
                    System.out.print("Cadena: ");
                    String cadena1 = sc.nextLine();
                    System.out.println("Caracteres: " + cadena1.length());
                    break;
                case 2:
                    System.out.print("Cadena: ");
                    String cadena2 = sc.nextLine();
                    String invertida = "";
                    for(int i = cadena2.length() - 1; i >= 0; i--) {
                        invertida += cadena2.charAt(i);
                    }
                    System.out.println("Invertida: " + invertida);
                    break;
            }
        } while(opcion != 3);
    }
}