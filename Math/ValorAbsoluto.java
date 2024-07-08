package Math;

import java.util.Scanner;

public class ValorAbsoluto {
    
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Valor Absoluto");
        System.out.println("---------------");
        System.out.print("Ingresa un número: ");

        int numero = myScanner.nextInt();
        int absoluto = Math.abs(numero);

        System.out.println("El valor absoluto es: " + absoluto);

        myScanner.close();

    }
}
