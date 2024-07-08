import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        String nombre = myScanner.nextLine();

        System.out.println("Ingresa tu edad: ");
        Integer edad = myScanner.nextInt();

        System.out.println("Su nombre es "+ nombre + " y tiene " + edad + " años");

        myScanner.close();
    }
}
