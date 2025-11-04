import java.util.Scanner;
public class ContarDigitos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Número entero: ");
        int num = sc.nextInt();
        int contador = 0;
        int n = Math.abs(num);

        do {
            n /= 10;
            contador++;
        } while(n != 0);

        System.out.println("Cantidad de dígitos: " + contador);
    }
}