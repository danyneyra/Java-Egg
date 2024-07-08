package Switch;
import java.util.Scanner;

public class DiasdeSemana {
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Ingresa un número del 1 al 7: ");

        int numero = myScanner.nextInt();

        String dia = switch (numero) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "El número no es válido";
        };

        System.out.println("El día de la semana es: " + dia);
    }
}
