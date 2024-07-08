package Switch;
import java.util.Scanner;

public class FiguraGeometrica {
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Áreas de Figuras Geómetricas");
        System.out.println("1 - Círculo");
        System.out.println("2 - Cuadrado");
        System.out.println("3 - Triángulo");
        System.out.print("Escoge una opción: ");

        int opcion = myScanner.nextInt();

        double area = switch (opcion) {
            case 1 -> {
                System.out.print("Ingrese el radio del círculo: ");
                int radio = myScanner.nextInt();
                yield 3.14 * (radio * radio);
            }
            case 2 -> {
                System.out.print("Ingrese el lado del Cuadrado: ");
                int lado = myScanner.nextInt(); 
                yield lado * lado;
            }
            case 3 -> {
                System.out.print("Ingrese la base del Triángulo: ");
                int base = myScanner.nextInt(); 
                System.out.print("Ingrese la altura del Triángulo: ");
                int altura = myScanner.nextInt(); 
                yield (base * altura) / 2;
            }
            default -> 0;
        };

        System.out.println("El área es: " + (area));

        myScanner.close();
    }
}
