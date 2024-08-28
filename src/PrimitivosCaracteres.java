public class PrimitivosCaracteres {
    public static void main(String[] args) {

        var caracter = '\u0040'; // Puede almacenar cualquier tipo de caracter unicode
        System.out.println("Caracter: " + caracter);

        var decimal = 64;
        System.out.println("decimal: " + decimal);
        System.out.println("Caracter = Decimal? " + (decimal == caracter));

        char simbolo = '@';
        System.out.println("simbolo: " + simbolo);
        System.out.println("Caracter = simbolo? " + (simbolo == caracter));

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';
        
        System.out.println("Char corresponde en byte:" + espacio + Character.BYTES);
        System.out.println("Char corresponde en bites:" + retroceso + Character.SIZE);
        System.out.println("El valor maximo de character es:" + tabulador + Character.MAX_VALUE);
        System.out.println("El valor minimo de character es:" + nuevaLinea + retornoCarro + Character.MIN_VALUE);
    }
}
