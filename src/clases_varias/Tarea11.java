package clases_varias;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Tarea11 {
    /*
    Para esta tarea se pide ingresar una fecha de nacimiento en formato string, convertirla a una del fecha del tipo java.util.Date y calcular la edad de la persona de acuerdo a la fecha actual.
    Intentar usar solo lo visto hasta el momento.
     */

    public static void main(String[] args) {

    String fechaNacimiento = "2001-02-10";
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    try {
        Date fechaNacimientoDate = sdf.parse(fechaNacimiento);

        Calendar calendarioNacimiento = Calendar.getInstance();
        calendarioNacimiento.setTime(fechaNacimientoDate);

        Calendar calendarioActual = Calendar.getInstance();
        int edad = calendarioActual.get(Calendar.YEAR) - calendarioNacimiento.get(Calendar.YEAR);

        if(calendarioActual.get(Calendar.DAY_OF_YEAR)< calendarioNacimiento.get(Calendar.DAY_OF_YEAR)){
            
            edad--;
        }
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);

        System.out.println("Edad: " + edad);
    } catch (ParseException e) {
        e.printStackTrace();
    }
    }
}
