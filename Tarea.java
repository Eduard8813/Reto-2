//Controlar el estado de una tarea, si esta completada o no, y permite marcarla como completada.

public class Tarea{
    String titulo;
    String descripcion;
    private boolean completada;

    public Tarea(String titulo, String descripcion){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.completada = false;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public String getTitulo() {
        return titulo;
    }
    public boolean isCompletado(){
        return completada;
    }

    public void marcarCompletado(){
        this.completada = true;
    }
    
    public String getInfor() {
        return "Tarea: " +  "Titulo: " + titulo + "Descripcion: " + descripcion + "Completado: " + completada;
    }

}