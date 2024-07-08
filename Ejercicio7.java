import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        
        System.out.println("Par e Impar");
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        int numero = myScanner.nextInt();

        String resultado = (numero % 2) == 0 ? "Par" : "Impar";

        System.out.println("El número " + numero + " es: " + resultado);

        myScanner.close();
    }
}
