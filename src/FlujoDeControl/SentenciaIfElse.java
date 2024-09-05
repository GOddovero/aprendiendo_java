package FlujoDeControl;

public class SentenciaIfElse {

    public static void main(String[] args) {
        
        float promedio = 5.8f;
        if(promedio == 10.0f){
            System.out.println("Felicitaciones, tu promedio es perfecto");
        }else if(promedio >= 6.5f && promedio < 10.0f){
            System.out.println("Felicitaicones aprobaste!");
        }else{
            System.out.println("Reprobaste");
        }
    }
}
