package Switch;
import java.util.Scanner;

public class SeleccionOpcion {
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Opción 1: Guardar");
        System.out.println("Opción 2: Cargar");
        System.out.println("Opción 3: Salir");
        System.out.print("Ingresa el número de la opción: ");
        int opcion = myScanner.nextInt();

        String resultado = switch (opcion) {
            case 1 -> "Guardar";
            case 2 -> "Cargar";
            case 3 -> "Salir";
            default -> "Opción no válida";
        };

        System.out.println("La opción escogida es: " + resultado);

        myScanner.close();
    }
}
