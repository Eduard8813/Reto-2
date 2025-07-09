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

    @Override
    public String toString(){
        return "Tarea: " +  "Titulo: " + titulo + "Descripcion: " + descripcion + "Completado: " + completada;
    }

    public void add(Tarea tarea) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
}