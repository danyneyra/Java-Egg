import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Ingresa la base de un rectángulo: ");
        int baseRectangulo = myScanner.nextInt();
        System.out.println("Ingresa la altura del rectángulo: ");
        int alturaRectangulo = myScanner.nextInt();

        System.out.println("El perímetro del rectángulo es: " + (2*baseRectangulo + 2*alturaRectangulo));
        System.out.println("El área del rectángulo es: " + (baseRectangulo*alturaRectangulo));

        myScanner.close();
    }
}
