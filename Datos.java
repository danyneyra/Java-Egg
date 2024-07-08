import java.time.LocalDate;

public class Datos {
    public static void main (String[] args){

        double temperatura = 30.5;
        double precio = 199.99;
        String nombre = "Dany Daniel";
        LocalDate fecha = LocalDate.of(2008, 12, 31);
        long poblacion = 300000000;
        int duracion = 120;
        boolean disponible = true;
        double distancia = 15.5;
        int celular = 987654321;
        int stock = 10;

        System.out.println("La temperatura es: " + temperatura);
        System.out.println("El precio de audífonos: "+ precio);
        System.out.println("Mi nombre es: "+nombre);
        System.out.println("La fecha de nacimiento es: " + fecha);
        System.out.println("EL total de la población es de: "+ poblacion);
        System.out.println("La duración de la película es de: "+duracion+ "minutos");
        System.out.println("La disponibilidad del producto es: "+ disponible);
        System.out.println("La distancia recorrida es: "+distancia+"km");
        System.out.println("EL número celular es: "+ celular);
        System.out.println("La cantidad de stock es de: " + stock);
    }
    
}
