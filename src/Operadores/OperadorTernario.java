package operadores;

import java.util.Scanner;

public class OperadorTernario {
    @SuppressWarnings({ "unused", "resource" })
    public static void main(String[] args) {
        
        /*
        variable = condicion ? si es verdadero : si es falso;
         */

        String variable = 7 == 5 ? "Si es verdadero" : "Si es falso";
        System.out.println(variable);

        String estado = "";
        double promedio = 0.0;
        double matematicas = 0.0;
        double fisica = 0.0;
        double quimica = 0.0;
        double biologia = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la calificacion de matematicas: ");
        matematicas = scanner.nextDouble();
        System.out.println("Ingresa la calificacion de fisica: ");
        fisica = scanner.nextDouble();
        System.out.println("Ingresa la calificacion de quimica: ");
        quimica = scanner.nextDouble();

        System.out.println("Ingresa la calificacion de biologia: ");
        biologia = scanner.nextDouble();


        promedio = (matematicas + fisica + quimica + biologia) / 4.0;

        estado = promedio >= 5.49 ? "Aprobado": "Reprobado";
        
        System.out.println("promedio = " + promedio);
        System.out.println("estado = " + estado);
    }
}
