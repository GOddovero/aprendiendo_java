import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosScanner {
    public static void main(String[] args) {

        @SuppressWarnings("resource") //no se que hace pero sin esto scanner marca "warning"
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");

        //String numeroStr = scanner.nextLine();

        int numeroDecimal = 0;
        
        try {
            numeroDecimal = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Error: Debe Ingresar un numero entero");;
            main(args);
            System.exit(0);
        }
        
        System.out.println("numeroDecimal: " + numeroDecimal);

        String mensajeBinario = "numero binario de: " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        
        String mensajeOctal = "numero octal de: " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        String mensajeHexadecimal = "numero hexadecimal de: " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = mensajeBinario;
        mensaje += "\n" + mensajeOctal;
        mensaje += "\n" + mensajeHexadecimal;

        System.out.println(mensaje);
    }
}
