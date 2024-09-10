package string;
public class EjemploStringInmutable {

    public static void main(String[] args) {
    
        String curso = "Programacion Java";
        String profesor = "Gaspar Oddovero";

        String resultado = curso.concat(profesor); //concat crea una nueva instancia, no modifica la original
        System.out.println("curso: " + curso);
        System.out.println("resultado: " + resultado);

        String resultado2 = curso.transform((c) ->{
            return c + " " + profesor;
        });

        System.out.println("resultado2: " + resultado2);

        String resultado3 = resultado.replace("a", "A");

        System.out.println("resultado3: " + resultado3);
    }
}
