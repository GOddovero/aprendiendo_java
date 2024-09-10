package operadores;

public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {

        // Creando un objeto de la clase String
        Object texto = new String("Creando un objeto de la clase String");

        // Creando un objeto de la clase Integer
        Number numero = Integer.valueOf(7);

        Boolean b1 = texto instanceof String;
        System.out.println("Texto es de tipo String: " + b1);

        b1 = texto instanceof Object;
        System.out.println("Texto es de tipo Object: " + b1);

        b1 = texto instanceof Integer;
        System.out.println("Texto es de tipo Integer: " + b1);

        b1 = numero instanceof Integer;
        System.out.println("Numero es de tipo Integer: " + b1);

        b1 = numero instanceof Number;
        System.out.println("Numero es de tipo Number: " + b1);

        b1 = numero instanceof Object;
        System.out.println("Numero es de tipo Object: " + b1);

        b1 = numero instanceof Long;
        System.out.println("Numero es de tipo Long: " + b1);

        b1 = numero instanceof Double;
        System.out.println("Numero es de tipo Double: " + b1);

        Number decimal = 45.54;
        b1 = decimal instanceof Number;
        System.out.println("Decimal es de tipo Number: " + b1);
        b1 = decimal instanceof Double;
        System.out.println("Decimal es de tipo Double: " + b1);
        b1 = decimal instanceof Float;
        System.out.println("Decimal es de tipo Float: " + b1);

        b1 = decimal instanceof Integer;
        System.out.println("Decimal es de tipo Integer: " + b1);


        b1 = b1 instanceof Boolean;
        System.out.println("b1 es de tipo Object: " + b1);

    }
}
