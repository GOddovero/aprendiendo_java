package operadores;

public class OperadorInstanceOf {
    public static void main(String[] args) {

        // Creando un objeto de la clase String
        String texto = new String("Creando un objeto de la clase String");

        // Creando un objeto de la clase Integer
        Integer numero = 7;

        Boolean b1 = texto instanceof String;
        System.out.println("Texto es de tipo String: " + b1);

        b1 = texto instanceof Object;
        System.out.println("Texto es de tipo Object: " + b1);

        b1 = numero instanceof Integer;
        System.out.println("Numero es de tipo Integer: " + b1);

        b1 = numero instanceof Number;
        System.out.println("Numero es de tipo Number: " + b1);

        b1 = numero instanceof Object;
        System.out.println("Numero es de tipo Object: " + b1);

        Double decimal = 45.54;
        b1 = decimal instanceof Number;
        System.out.println("Decimal es de tipo Number: " + b1);

        b1 = b1 instanceof Boolean;
        System.out.println("b1 es de tipo Object: " + b1);

    }
}
