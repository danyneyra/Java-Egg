package Math;

import java.util.Scanner;

public class NumeroAleatorio {
    public static void main(String[] args) {
        
        System.out.println("Número Aleatorio");
        System.out.println("---------------");

        int min = 1;
        int max = 355;
        int rango = max - min + 1;

        int aleatorio = (int)((Math.random() * rango) + min);

        System.out.print("El número generado es: " + aleatorio);
    }
}
