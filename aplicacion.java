import java.util.List;
import java.util.Scanner;

public class aplicacion {
    public void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        GestorTarea gestorTarea = new GestorTarea();
        int opcion;

            System.out.println("\n1. Agregar tarea");
            System.out.println("2. Marcar tarea como completada");
            System.out.println("3. Mostrar tareas pendientes");
            System.out.println("4. Mostrar tareas completadas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el título de la tarea: ");
                    String titulo = sc.nextLine();
                    System.out.print("Ingrese la descripción de la tarea: ");
                    String descripcion = sc.nextLine();
                    gestorTarea.agregarTareas(titulo, descripcion);
                    mostrarMenu();
                    break;
                case 2:
                    System.out.print("Ingrese el índice de la tarea a marcar como completada: ");
                    int indice = sc.nextInt();
                    gestorTarea.marcarTareaCompletado(indice);
                    mostrarMenu();
                    break;
                case 3:
                    List<Tarea> pendientes = gestorTarea.ObtenerTareasPendientes();
                    System.out.println("Tareas pendientes:");
                    for (int i = 0; i < pendientes.size(); i++) {
                        System.out.println(i + ". " + pendientes.get(i));
                    }
                    mostrarMenu();
                    break;
                case 4:
                    List<Tarea> completadas = gestorTarea.ObtenerTareasCompletadas();
                    System.out.println("Tareas completadas:");
                    for (int i = 0; i < completadas.size(); i++) {
                        System.out.println(i + ". " + completadas.get(i));
                    }
                    mostrarMenu();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    mostrarMenu();
            }
            while (opcion != 5);

        sc.close();
    }
}
