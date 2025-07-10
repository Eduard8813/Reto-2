// Este archivo es parte de un proyecto de gestión de tareas en Java.
import java.util.Scanner;

public class Crear {
    String Titulo;
    String Descripcion;
    String Fecha;

    public Crear()
    {

    }

    public Crear(String titulo, String descripcion, String fecha) {
        Titulo = titulo;
        Descripcion = descripcion;
        Fecha = fecha;
    }
    
    public String getDescripcion() {
        return Descripcion;
    }
    public String getFecha() {
        return Fecha;
    }
    public String getTitulo() {
        return Titulo;
    }
    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
    public void setFecha(String fecha) {
        Fecha = fecha;
    }
    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public void inicio(){
        solicitar();
    }

    public void solicitar(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Cuantas tareas desea crear?");
        int cantidad;
        cantidad = scanner.nextInt();
        scanner.nextLine(); 

        for(int i = 0; i < cantidad; i++){
            System.out.println("Ingrese el titulo de la tarea" + " " + (i + 1) + ":");
            String titulo = scanner.nextLine();
            setTitulo(titulo);

            System.out.println("Ingrese la descripcion de la tarea");
            String descripcion = scanner.nextLine();
            setDescripcion(descripcion);
            
            System.out.println("Agregar fecha (formato: YYYY-MM-DD HH:MM):");
            String fecha = scanner.nextLine();
            setFecha(fecha);
            validar();
        }
        seguir();
    }

        public void validar(){
        if(Titulo != null && !Titulo.isEmpty() || Descripcion != null && !Descripcion.isEmpty() || Fecha != null && !Fecha.isEmpty()) {
            System.out.println("----------------------------------------------");
            System.out.println("Tarea creada con éxito.");

            System.out.println("Datos :" + "\nTitulo: " + Titulo + 
                            "\nDescripcion: " + Descripcion + 
                            "\nFecha: " + Fecha);
            System.out.println("----------------------------------------------");
            enviar();

        } else {
            System.out.println("Por favor, complete todos los campos.");
            solicitar();
        }
    }

        void seguir(){
            System.out.println("¿Desea crear otra tarea? (si/no)");
            Scanner scanner = new Scanner(System.in);
            String respuesta = scanner.nextLine();

            if (respuesta.equalsIgnoreCase("si") || respuesta.equalsIgnoreCase("Si")) {
                solicitar();
            } else if (respuesta.equalsIgnoreCase("no") || respuesta.equalsIgnoreCase("No")) {
                System.out.println("Saliendo...");
                aplicacion app = new aplicacion();
                app.regresaMenu();
            } else {
                System.out.println("Respuesta no válida, por favor intente de nuevo.");
                seguir();
            }
        }
            
            void enviar(){
                guardarTarea guardar = new guardarTarea("tareas.txt");
                String contenido = "Titulo: " + Titulo + "\n" +
                                "Descripcion: " + Descripcion + "\n" +
                                "Fecha: " + Fecha + "\n";
                guardar.guardarTexto(contenido);
            }
}
