package Math;

import java.util.Scanner;

public class Redondeo {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Redondeo");
        System.out.println("---------------");
        System.out.print("Ingresa un número decimal: ");

        double numero = myScanner.nextDouble();
        float redondeo = Math.round(numero);

        System.out.println("El valor redondeo es: " + redondeo);

        myScanner.close();
    }
}
