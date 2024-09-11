package clases_varias;

class Persona{
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    public String leerNombre(){
        return this.nombre;
    }
}
public class PasarPorReferencia2 {

    public static void main(String[] args) {
    Persona persona = new Persona();
    persona.modificarNombre("Andres");

    System.out.println("Iniciamos el metodo main");
    
    System.out.println("Persona.nombre = " + persona.leerNombre());
    System.out.println("Antes de invocar el metodo test");
    test(persona);
    System.out.println("Despues de invocar el metodo test");
    System.out.println("Persona.nombre = " + persona.leerNombre());
    System.out.println("Finaliza el metodo main con los datos de la persona modificada");
    }
    public static void test(Persona persona){
        System.out.println("Iniciamos el metodo test");
        persona.modificarNombre("Gaspar");
        System.out.println("Terminamos el metodo test");
    }
}
