package operadores;

public class ProcedenciaOperadores {

    public static void main(String[] args) {
        /*
        Orden de precedencia:
        1. Operador de imcremento decremento (++,--,+,-,!)
        2. Parentesis
        3. Multiplicacion y division
        4. Suma y resta
        5. Operadores relacionales (>,<,>=,<=, instanceof)
        6. Operadores relaciones igualdad (==,!=)
        7. And (&&)
        8. Or (||)
        9. Ternario ()?:
        10.Aritmeticos y asignaciones (=,+=,-=,*=,/=,%=)
         */
        
        int i = 14;
        int j = 8;
        int k = 20;
        
        double promedio = (i + j + k) / 3.0;
        System.out.println("promedio = " + promedio);
        
    }
}
