package clases_varias;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {
        Date fecha = new Date();
        System.out.println(fecha);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy");

        String fechaStr = sdf.format(fecha);
        long j = 0;
        for (int i = 0; i < 10000; i++) {
            j +=i;  
        }
        System.out.println("J: " + j);

        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() - fecha.getTime();
        System.out.println("Tiempo transcurrido en el for: " + tiempoFinal);
        System.out.println(fechaStr);
    }
}
