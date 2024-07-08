import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");

        int edad = myScanner.nextInt();
        
        if (edad >= 65){
            System.out.println("Eres adulto mayor");
        } else if ( edad >= 18 && edad < 65){
            System.out.println("Eres adulto");
        }else{
            System.out.println("Eres menor de edad");
        }

        myScanner.close();
    }
}
