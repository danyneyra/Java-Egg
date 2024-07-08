import java.util.Scanner;

public class Ejercicio4 {
    public static void main (String[] args){

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Ingresa un número entero: ");
        int primerNumero = myScanner.nextInt();

        System.out.println("Ingresa otro número entero: ");
        int segundoNumero = myScanner.nextInt();

        System.out.println("El número "+primerNumero+ " es mayor a "+ segundoNumero+ " = "+ (primerNumero> segundoNumero));

        System.out.println("El número "+primerNumero+ " es diferente a "+ segundoNumero+ " = "+ (primerNumero != segundoNumero));

        System.out.println("El número "+primerNumero+ " es divisible por 2 = "+ ((primerNumero % 2) == 0));

        myScanner.close();
    }
}
