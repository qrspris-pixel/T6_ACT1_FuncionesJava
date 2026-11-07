
import java.util.Scanner;

public class ManipulacionTexto {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa un texto largo:");
        String texto = teclado.nextLine().toLowerCase();

        String[] palabras = texto.split("[^\\p{L}]+");
        int contador = 0;

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equals("ingeniería")) {
                contador++;
            }
        }

        System.out.println("La palabra ingenieria aparece "
                + contador + " veces.");

        teclado.close();
    }
}
