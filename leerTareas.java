// Este archivo leer lo que hay en el archivo tareas.txt y lo muestra por consola.
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class leerTareas {
    private String leer;

    public leerTareas(String leer) {
        this.leer = leer;
    }

    public void mostrarContenido(){
        try(BufferedReader br = new BufferedReader(new FileReader(leer))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            aplicacion app = new aplicacion();
            app.regresaMenu(); 
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
