import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Ingresa un número entre 0 y 100: ");

        int numero = myScanner.nextInt();

        if (numero >= 90 && numero <= 100){
            System.out.println("Su calificación es A");
        }else if (numero >= 80 && numero <= 89){
            System.out.println("Su calificación es B");
        }else if (numero >= 70 && numero <= 79){
            System.out.println("Su calificación es C");
        }else if (numero >= 60 && numero <= 69){
            System.out.println("Su calificación es D");
        }else if (numero < 60){
            System.out.println("Su calificación es F"); 
        }else{
            System.out.println("El número ingresado está fuera del rango.");
        }

        myScanner.close();
    }
}
