

package programa02;
import java.util.Scanner;

public class Programa02 {

 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Hola perro, ¿Cuantos años tienes? ");
        int edad;
        edad = entrada.nextInt(); 
        if (edad <= 17 ){
            System.out.println("Menor de edad");
        }
        if (edad >= 18 ){
            System.out.println("Mayor de edad");
    }
}
}
