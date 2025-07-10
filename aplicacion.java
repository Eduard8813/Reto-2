//El menu de controla el flujo de la aplicacion, permite crear tareas, verlas y marcarlas como completadas.
import java.util.Scanner;
public class aplicacion {
    Scanner scanner = new Scanner(System.in);
    
    public void menu(){
        System.out.println("Bienvenido al gestor de tareas");
        System.out.println("1. Crear tarea");
        System.out.println("2. Ver tareas");
        System.out.println("3. Marcar tarea como completada");
        System.out.println("4. Mostrar tareas pendientes");
        System.out.println("5. Mostrar tareas completadas");
        System.out.println("5. Salir");
    
        int opcion = scanner.nextInt();
        scanner.nextLine(); 
        
        switch(opcion) {
            case 1:
                Crear tarea = new Crear();
                tarea.inicio();
                break;
            case 2:
                System.out.println("Mostrando tareas...");
                System.out.println("----------------------------------------------");
                leerTareas tareas = new leerTareas("tareas.txt");
                tareas.mostrarContenido();
                System.out.println("----------------------------------------------");
                break;
            case 3:
                MoverBloque filtrar = new MoverBloque("tareas.txt", "tareasCompletadas.txt");
                filtrar.moverPorTitulo();
                break;
            case 4:
                System.out.println("Saliendo...");
                scanner.close();
                break;
            case 5:
                System.out.println("Saliendo...");
                scanner.close();
                break;
            default:
                System.out.println("Opción no válida, intenta de nuevo.");
                menu();
        }
    }
}