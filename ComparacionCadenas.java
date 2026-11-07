
import java.util.Scanner;

public class ComparacionCadenas {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa el primer texto: ");
        String texto1 = teclado.nextLine();

        System.out.print("Ingresa el segundo texto: ");
        String texto2 = teclado.nextLine();

        if (texto1.length() == texto2.length()) {
            System.out.println("Los textos tienen la misma longitud.");
        } else {
            System.out.println("Los textos tienen diferente longitud.");
        }

        if (texto1.equals(texto2)) {
            System.out.println("Los textos son iguales.");
        } else {
            System.out.println("Los textos son diferentes.");
        }

        teclado.close();
    }
}
