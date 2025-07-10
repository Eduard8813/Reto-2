// Este archivo guarda las tareas en un archivo de texto.
import java.io.FileWriter;
import java.io.IOException;

public class guardarTarea {
    String ruta;

    public guardarTarea(String ruta) {
        this.ruta = ruta;
    }

    public void guardarTexto(String contenido){
        try (FileWriter writer = new FileWriter(ruta, true)) {
            writer.write(contenido);
            writer.write("\n");
            System.out.println("Tarea guardad con exito" + " en "+ " "+ ruta);
        } catch (Exception e) {
            System.out.println("Error al guardar la tarea: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
