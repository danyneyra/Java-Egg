import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");

        int numero = myScanner.nextInt();

        int divisible3 = numero % 3;
        int divisible5 = numero % 5;

        if (divisible3 == 0 && divisible5 == 0){
            System.out.println("El número es divisible por 5 y 3");
        }else if(divisible5 == 0){
            System.out.println("El número solo es divisible por 5");
        }else if(divisible3 == 0){
            System.out.println("El número solo es divisible por 3");
        }else{
            System.out.println("El número no es divisible por 5 ni 3");
        }

        myScanner.close();
    }
    
}
