import java.util.Scanner;

public class Ejercicio5 {
    public static void main (String[] args){

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Ingresa tu año de nacimiento: ");
        int añoNacimiento = myScanner.nextInt();

        final int añoActual = 2024;

        int calcularEdad = añoActual - añoNacimiento;

        System.out.println("Tu edad actual es: " + calcularEdad);
        String esMayor = (calcularEdad >= 18) ? "Eres mayor de 18 años" : "Eres menor de 18 años";

        System.out.println(esMayor);

        myScanner.close();
    }
}
