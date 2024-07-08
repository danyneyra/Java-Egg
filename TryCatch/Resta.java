package TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Resta {
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        int resultado = 0;

        try {
            System.out.print("Ingrese un número: ");
            int primero = myScanner.nextInt();
            System.out.print("Ingrese otro número: ");
            int segundo = myScanner.nextInt();
            resultado = primero - segundo;
        }
        catch (InputMismatchException e){
            e.printStackTrace();
            System.out.println("Ingresó un caracter en lugar de un número");
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Sucedió un error");
        }
        
        System.out.println("El resultado es: " + resultado);

        myScanner.close();

    }
}
