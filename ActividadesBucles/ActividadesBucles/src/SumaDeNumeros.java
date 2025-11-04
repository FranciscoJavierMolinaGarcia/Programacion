import java.util.Scanner;
public class SumaDeNumeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa N: ");

        int N = sc.nextInt();
        int suma = 0;
        for(int i = 2; i <= N; i += 2) {
            suma += i;
        }

        System.out.println("Suma de pares: " + suma);
    }
}

