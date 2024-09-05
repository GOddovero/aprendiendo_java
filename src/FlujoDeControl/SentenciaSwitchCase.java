package FlujoDeControl;
import java.util.Scanner;
public class SentenciaSwitchCase {

    public static void main(String[] args) {
    
        int num = 5;
        switch (num) {
            case 1:
                System.out.println("El numero es 1");
                break;
            case 2:
                System.out.println("El numero es 2");
                break;
            case 3:
                System.out.println("El numero es 3");
                break;
            default:
                System.out.println("El numero no es 1, 2 o 3");
        }

        String nombre = "Gaspar";
        switch (nombre) {
            case "Gaspar":
                System.out.println("Bienvenido Gaspar");
                break;
            case "admin":
                System.out.println("Bienvenido admin");
                break;
            default:
                System.out.println("Usuario Desconocido");
        }
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el mes: ");
        int mes = scanner.nextInt();
        String nombreMes = null;
        int cantidadDias = 0;

        switch(mes){
            case 1:
                nombreMes = "Enero";
                cantidadDias = 31;
                break;
            case 2:
                nombreMes = "Febrero";
                cantidadDias = 28;
                break;
            case 3:
                nombreMes = "Marzo";
                cantidadDias = 31;
                break;
            case 4:
                nombreMes = "Abril";
                cantidadDias = 30;
                break;
            case 5:
                nombreMes = "Mayo";
                cantidadDias = 31;
                break;
            case 6:
                nombreMes = "Junio";
                cantidadDias = 30;
                break;
            case 7:
                nombreMes = "Julio";
                cantidadDias = 31;
                break;
            case 8:
                nombreMes = "Agosto";
                cantidadDias = 31;
                break;
            case 9:
                nombreMes = "Septiembre";
                cantidadDias = 30;
                break;
            case 10:
                nombreMes = "Octubre";
                cantidadDias = 31;
                break;
            case 11:
                nombreMes = "Noviembre";
                cantidadDias = 30;
                break;
            case 12:
                nombreMes = "Diciembre";
                cantidadDias = 31;
                break;
            default:
                System.out.println("Mes no valido");
                nombreMes = null;
        }
        System.out.println("El mes es " + nombreMes + " y tiene " + cantidadDias + " dias");
    }
}
