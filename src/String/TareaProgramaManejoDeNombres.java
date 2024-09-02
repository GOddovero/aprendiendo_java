package String;
import java.util.Scanner;
/*
Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como argumentos de línea de comandos.

Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter pero convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona. Por ejemplo para Andres debe quedar como N.es

Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable). 
*/
public class TareaProgramaManejoDeNombres {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el primer Nombre: ");
        String nombre1 = scanner.nextLine();

        System.out.println("Ingrese el segundo Nombre: ");
        String nombre2 = scanner.nextLine();

        System.out.println("Ingrese el tercer Nombre: ");
        String nombre3 = scanner.nextLine();

        String nombreModificado1 = nombre1.substring(1, 2).toUpperCase().concat("." + nombre1.substring(nombre1.length() - 2, nombre1.length()));

        String nombreModificado2 = nombre2.substring(1, 2).toUpperCase().concat("." + nombre2.substring(nombre2.length() - 2, nombre2.length()));

        String nombreModificado3 = nombre3.substring(1, 2).toUpperCase().concat("." + nombre3.substring(nombre3.length() - 2, nombre3.length()));
        System.out.println(nombreModificado1 + "_" + nombreModificado2 + "_" + nombreModificado3);
    }

}
