import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("Calculadora");

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero1 = myScanner.nextInt();

        System.out.print("Ingresa otro número: ");
        int numero2 = myScanner.nextInt();

        System.out.println(" 1 - sumar");
        System.out.println(" 2 - restar");
        System.out.println(" 3 - multiplicar");
        System.out.println(" 4 - dividir");

        System.out.print("Ingresa el número de operación a realizar: ");
        int operacion = myScanner.nextInt();

        int resultado = operacion == 1? numero1 + numero2: operacion == 2? numero1 - numero2: operacion == 3? numero1 * numero2: numero1 / numero2;

        System.out.println("El resultado es: " + (resultado));

        myScanner.close();
    }
}
