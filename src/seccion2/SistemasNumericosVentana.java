package seccion2;
import javax.swing.JOptionPane;

public class SistemasNumericosVentana {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero");
        int numeroDecimal = 0;
        
        try {
            numeroDecimal = Integer.parseInt(numeroStr);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Debe Ingresar un numero entero");
            main(args);
            System.exit(0);
        }
        
        System.out.println("numeroDecimal: " + numeroDecimal);
        String mensajeBinario = "numero binario de: " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(mensajeBinario);

        int numeroBinario = 0b11111111;

        System.out.println("numeroBinario: " + numeroBinario);
        
        String mensajeOctal = "numero octal de: " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(mensajeOctal);

        int numeroOctal = 0377;

        System.out.println("numeroOctal: " + numeroOctal);
        String mensajeHexadecimal = "numero hexadecimal de: " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(mensajeHexadecimal);

        int numeroHex = 0xff;

        System.out.println("numeroHex: " + numeroHex);

        String mensaje = mensajeBinario;
        mensaje += "\n" + mensajeOctal;
        mensaje += "\n" + mensajeHexadecimal;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
