import java.util.Scanner;
public class SumarDigitos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Número entero: ");
        int num = sc.nextInt();
        int suma = 0;
        int n = Math.abs(num);

        do {
            suma += n % 10;
            n /= 10;
        } while(n != 0);

        System.out.println("Suma de dígitos: " + suma);
    }
}