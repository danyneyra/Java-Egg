import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Ingresa su contraseña: ");

        String password = myScanner.next();

        if (password.equals("gato")){
            System.out.println("Acceso concedido");
        }else{
            System.out.println("Acceso denegado");
        }

        myScanner.close();
    }
}
