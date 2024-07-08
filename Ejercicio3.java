import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){

        int numero1 = 15;
        int numero2 = 20;

        System.out.println("La suma de 15 + 20 = " + (numero1+numero2));

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Ingresa un número: ");
        int numero3 = myScanner.nextInt();

        System.out.println("Ingresa otro número: ");
        int numero4 = myScanner.nextInt();

        System.out.println("La suma de " + numero3 + " + " + numero4 + " = " + (numero3+numero4));

        myScanner.close();
    }
}
