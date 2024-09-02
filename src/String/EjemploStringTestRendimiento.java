package String;

public class EjemploStringTestRendimiento {
public static void main(String[] args) {
    String a = "a";
    String b = "b";
    String c = a;
    StringBuilder sb = new StringBuilder(a);

    long inicio = System.currentTimeMillis();

    for (int i = 0; i < 10000; i++) {
        //c = c.concat(a).concat(b).concat("\n"); //1000 => 2ms / 3ms. 10000 => 77ms / 83ms
        //c += a + b + "\n";  //1000 => 16ms / 22ms. 10000 => 51ms / 66ms
        sb.append(a).append(b).append("\n");// 1000 => 1ms. 10000 => 2ms
    }
    long fin = System.currentTimeMillis();

    System.out.println("c => " + c);
    System.out.println("sb => " + sb.toString());
    System.out.println(" Tiempo: " + (fin - inicio));
}
}
