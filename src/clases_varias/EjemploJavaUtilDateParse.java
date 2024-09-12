package clases_varias;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) throws ParseException {
        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingresa una fecha con formato 'yyyy-MM-dd': ");
        try{
            Date fecha = format.parse(s.nextLine());
            System.out.println("fecha " + fecha);
            String fechaStr = format.format(fecha);
            System.out.println("fechaStr " + fechaStr);

            Date fecha2 = new Date();
            if (fecha.after(fecha2)) {
                System.out.println("Fecha del usuario es despues de la fecha actual");
            }else if (fecha.before(fecha2)) {
                System.out.println("Fecha del usuario es antes de la fecha actual");
            }else if (fecha.equals(fecha2)){
                System.out.println("Fecha del usuario es igual a la fecha actual");
            }
            if(fecha.compareTo(fecha2) > 0){
                System.out.println("Fecha del usuario es despues de la fecha actual");
            } else if(fecha.compareTo(fecha2) < 0){
                System.out.println("Fecha del usuario es antes de la fecha actual");
            } else if(fecha.compareTo(fecha2) == 0){
                System.out.println("Fecha del usuario es igual a la fecha actual");
            }
        }catch(ParseException e){
            System.err.println("Error al parsear la fecha: " + e.getMessage());
            System.err.println("El formato correcto es: yyyy-MM-dd");
        }
    }
}
