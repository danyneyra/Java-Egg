import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");

        int numero = myScanner.nextInt();

        if (numero == 0){
            System.out.println("El Número es 0");
        }else if (numero > 0){
            System.out.println("El Número es Positivo");
        }else{
            System.out.println("El Número es Negativo");
        }

        myScanner.close();
    }
}
