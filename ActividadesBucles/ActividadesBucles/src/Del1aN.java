import java.util.Scanner;
public class Del1aN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa N: ");

        int N = sc.nextInt();

        for(int i = 1; i <= N; i++) {
            System.out.println(i);
        }
    }
}
