package Switch;
import java.util.Scanner;

public class Calificaciones {

    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");

        int numero = myScanner.nextInt();

        String resultado = switch (numero){
            case 1 -> "Muy efciciente";
            case 2 -> "Deficiente";
            case 3 -> "Suficiente";
            case 4 -> "Notable";
            case 5 -> "Sobresaliente";
            default -> "Número es inválido";
        };

        System.out.println("La calificación es: " + resultado);

        myScanner.close();


    }
}