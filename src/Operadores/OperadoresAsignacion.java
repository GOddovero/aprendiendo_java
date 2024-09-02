package Operadores;

public class OperadoresAsignacion {

    public static void main(String[] args) {
        int i = 5;
        int j = i + 4;

        i += 2;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        i += 5;
        System.out.println("i = " + i);

        i -= 4;
        System.out.println("i = " + i);

        i *= 3;
        System.out.println("i = " + i);

        i /= 5;
        System.out.println("i = " + i);

        i %= 2;
        System.out.println("i = " + i);

        String sqlString = "select * from clientes as c";
        sqlString += " where c.id = 5" ;

        System.out.println(sqlString);
    }
}
