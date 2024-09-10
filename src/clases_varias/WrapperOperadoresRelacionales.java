package clases_varias;

public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

        System.out.println("num1 == num2: " + (num1 == num2)); //Devuelve True porque son objetos iguales, compara si los valores son la misma instancia.

        num2 = 1000;

        
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

        System.out.println("num1 == num2: " + (num1 == num2)); //Devuelve False porque son objetos diferentes, compara si los valores son la misma instancia.

        System.out.println("tienen el mismo valor?" + (num1.equals(num2))); //Devuelve True porque los valores son iguales.

        System.out.println("tienen el mismo valor?" + (num1.intValue()==num2.intValue())); //Devuelve True porque los valores son iguales.

        num2 = 500;
        boolean condicion = num1 > num2; //Hace automaticamente el casting de Integer a int.
        System.out.println("num1 > num2: " + condicion);


    }

}
