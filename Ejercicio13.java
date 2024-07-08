import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Ingresa precio de producto $: ");

        double precio = myScanner.nextInt();

        if (precio >= 100){
            double descuento = precio - (precio * 0.10);
            System.out.println("El precio con decuento es $" + descuento);
        }else{
            System.out.println("El precio es $" + precio);
        }

        myScanner.close();
    }
}
