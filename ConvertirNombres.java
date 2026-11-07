
import java.util.Scanner;

public class ConvertirNombres {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String nombre = "";

        while (!nombre.equalsIgnoreCase("salir")) {

            System.out.print("Ingresa un nombre completo (o salir): ");
            nombre = teclado.nextLine();

            if (!nombre.equalsIgnoreCase("salir")) {
                System.out.println("Nombre en mayusculas: "
                        + nombre.toUpperCase());
            }
        }

        System.out.println("Programa finalizado.");

        teclado.close();
    }
}
