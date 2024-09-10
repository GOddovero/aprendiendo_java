package string;

public class EjemploStringMetodos {

    public static void main(String[] args) {
    String nombre = "Gaspar";

    System.out.println("Mayusculas: " + nombre.toUpperCase());
    System.out.println("Minusculas: " + nombre.toLowerCase());
    System.out.println("Longitud: " + nombre.length());
    System.out.println("Primera letra: " + nombre.charAt(0));
    System.out.println("Ultima letra: " + nombre.charAt(nombre.length() - 1));
    System.out.println("nombre.equals(\"Gaspar\"): " + nombre.equals("Gaspar"));
    System.out.println("nombre.equals(\"gaspar\"): " + nombre.equals("gaspar"));
    System.out.println("nombre.equalsIgnoreCase(\"gaspar\"): " + nombre.equalsIgnoreCase("gaspar"));
    System.out.println("nombre.compareTo(\"Gaspar\"): " + nombre.compareTo("Gaspar"));
    System.out.println("nombre.compareTo(\"Diego\"): " + nombre.compareTo("Diego"));
    System.out.println("nombre.substring(1): " + nombre.substring(1)); // el primer argumentos del substring se incluye
    System.out.println("nombre.substring(1, 3): " + nombre.substring(1, 3)); // el segundo argumentos del substring no se incluye
    System.out.println("nombre.substring(nombre.length() - 1): " + nombre.substring(nombre.length() - 1)); 

    String trabalengua = "Trabalenguas";
    System.out.println("trabalenguas = " + trabalengua.replace("a", "."));
    System.out.println("trabalengua.indexOf('a'): " + trabalengua.indexOf('a'));
    System.out.println("trabalengua.lastIndexOf('a'): " + trabalengua.lastIndexOf('a'));
    System.out.println("trabalengua.contains(a): " + trabalengua.contains("a"));
    System.out.println("trabalenguas.startsWith(Traba): " + trabalengua.startsWith("Traba"));
    System.out.println("trabalenguas.endsWith(nguas): " + trabalengua.endsWith("nguas"));

    System.out.println("  trabalenguas  ");
    System.out.println("  trabalenguas  ".trim()); // quita los espacios antes y despues de la palabra
    }
}
