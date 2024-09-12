package clases_varias;

import java.util.Map;
public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {
        Map<String, String> varEnv = System.getenv();
        System.out.println("Variables de ambiente del sistema = " + varEnv);

        System.out.println("------------------Listando variables de entorno del sistemas-------------");
        for(String key :varEnv.keySet()){
            System.out.println(key + "=>" + varEnv.get(key));
        }
        String username = System.getenv("USERNAME");
        System.out.println("Username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("Java Home = " + javaHome);

        String temDir = System.getenv("TEMP");
        System.out.println("Temp = " + temDir);

        String path = System.getenv("PATH");
        System.out.println("Path = " + path);

        String path2 = varEnv.get("Path");
        System.out.println("Path2 = " + path2);

        String saludarHola = varEnv.get("SALUDAR_HOLA");
        System.out.println("SaludarHola = " + saludarHola);
        
    }

}
