package seccion2;
import java.util.Scanner;
public class DetalleDeFactura {

    public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingresa el nombre o descripcion de la factura:");

    String nombre = scanner.nextLine();

    System.out.println("Ingresa el precio de la factura:");
    double precio = scanner.nextDouble();

    System.out.println("Ingresa la cantidad de la factura:");
    double cantidad = scanner.nextDouble();

    double total = precio*cantidad;
    System.out.println("La factura del producto "+nombre+
                    "\n tiene un total bruto de: $"+ total +
                    "\n con un impuesto de 19%: $" + total *0.19 +
                    "\n y un total de: $"+total*1.19);
    }
}
