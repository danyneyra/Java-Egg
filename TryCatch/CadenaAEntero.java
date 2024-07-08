package TryCatch;

import java.util.Scanner;

public class CadenaAEntero {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int resultado = 0;

        try {
            System.out.print("Ingrese un texto para convertir a número: ");
            String texto = myScanner.nextLine();
            resultado = Integer.parseInt(texto);
        }
        catch (NumberFormatException e){
            e.printStackTrace();
            System.out.println("Error al convertir el texto al número");
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Sucedió un error");
        }
        
        System.out.println("El resultado es: " + resultado);

        myScanner.close();
    }
}
