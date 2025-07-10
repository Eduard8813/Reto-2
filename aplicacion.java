//El menu de controla el flujo de la aplicacion, permite crear tareas, verlas y marcarlas como completadas.
import java.util.Scanner;
public class aplicacion {
    Scanner scanner = new Scanner(System.in);
    
    public void menu(){
        System.out.println("Bienvenido al gestor de tareas");
        System.out.println("1. Crear tarea");
        System.out.println("2. Ver tareas");
        System.out.println("3. Marcar tarea como completada");
        System.out.println("4. Salir");
        
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        
        switch(opcion) {
            case 1:
                menu();
                break;
            case 2:
                menu();
                break;
            case 3:
                menu();
                break;
            case 4:
                System.out.println("Saliendo...");
                scanner.close();
                break;
            default:
                System.out.println("Opción no válida, intenta de nuevo.");
                menu();
        }
    }
}