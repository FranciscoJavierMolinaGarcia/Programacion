import java.util.Random;
public class ContraseñaAleatoria {
    public static void main(String[] args) {

        Random rnd = new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String contrasena = "";

        for(int i = 0; i < 8; i++) {
            int index = rnd.nextInt(caracteres.length());
            contrasena += caracteres.charAt(index);
        }
        System.out.println("Contraseña: " + contrasena);
    }
}