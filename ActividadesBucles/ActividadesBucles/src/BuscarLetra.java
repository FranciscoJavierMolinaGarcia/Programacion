import java.util.Scanner;
public class BuscarLetra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la cadena: ");
        String cadena = sc.nextLine();
        System.out.println("Ingresa la letra que quieres bnuscar: ");

        char letra = sc.next().charAt(0);
        int contador = 0;

        for(int i = 0; i < cadena.length(); i++){
            if(cadena.charAt(i) == letra){
                contador++;
            }
        }
        System.out.println("La letra " + letra + "aparece " +  contador + " veces.");
    }
}
