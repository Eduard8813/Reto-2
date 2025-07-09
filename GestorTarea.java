import java.util.ArrayList;
import java.util.List;

public class GestorTarea {
    private List<Tarea> tarea;

    public GestorTarea(){
        this.tarea = new ArrayList<>();
    }

    public void agregarTareas(String titulo, String descripcion){
        Tarea tarea = new Tarea(titulo, descripcion);
        this.tarea.add(tarea);
    }

    public void marcarTareaCompletado(int indice){
        if(indice >= 0 && indice < tarea.size()){
            tarea.get(indice).marcarCompletado();
        }else{
            System.out.println("Indice de tarea no valido");
        }
    }
    
    public List<Tarea> ObtenerTareasPendientes(){
        List<Tarea> pendientes = new ArrayList<>();
        for(Tarea tarea : tarea){
            if(!tarea.isCompletado()){
                pendientes.add(tarea);
            }
        }
        return pendientes;
    }

    public List<Tarea> ObtenerTareasCompletadas(){
        List<Tarea> completadas = new ArrayList<>();
        for(Tarea tarea : tarea){
            if(tarea.isCompletado()){
                completadas.add(tarea);
            }
        }
        return completadas;
    }
}