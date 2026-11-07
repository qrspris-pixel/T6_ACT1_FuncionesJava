
import java.util.Scanner;
import java.time.LocalDate;

public class ConversionFechas {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa una fecha (YYYY-MM-DD): ");
        String fechaIngresada = teclado.nextLine();

        LocalDate fecha = LocalDate.parse(fechaIngresada);

        LocalDate semanaDespues = fecha.plusWeeks(1);
        LocalDate mesAntes = fecha.minusMonths(1);

        System.out.println("Fecha ingresada: " + fecha);
        System.out.println("Una semana despues: " + semanaDespues);
        System.out.println("Un mes antes: " + mesAntes);

        teclado.close();
    }
}

