import java.io.*;
import java.util.*;

public class MoverBloque {
    private String origen;
    private String destino;

    public MoverBloque(String origen, String destino) {
        this.origen = origen;
        this.destino = destino;
    }

    public void moverPorTitulo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el título a buscar (ej. Java): ");
        String tituloBuscado = sc.nextLine().trim();

        List<String> restantes = new ArrayList<>();
        List<String> bloqueActual = new ArrayList<>();
        boolean moverBloque = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(origen));
            BufferedWriter writer = new BufferedWriter(new FileWriter(destino, true))) {

            String linea;
            while ((linea = reader.readLine()) != null) {
                if (linea.startsWith("Titulo:")) {
                    bloqueActual.clear();
                    moverBloque = linea.replace("Titulo:", "").trim().equalsIgnoreCase(tituloBuscado);
                    bloqueActual.add(linea);
                } else if (!linea.isEmpty()) {
                    bloqueActual.add(linea);
                } else {
                    bloqueActual.add(""); 

                    if (moverBloque) {
                        for (String l : bloqueActual) {
                            writer.write(l);
                            writer.newLine();
                        }
                    } else {
                        restantes.addAll(bloqueActual);
                    }
                    bloqueActual.clear();
                }
            }

            if (!bloqueActual.isEmpty()) {
                if (moverBloque) {
                    for (String l : bloqueActual) {
                        writer.write(l);
                        writer.newLine();
                    }
                } else {
                    restantes.addAll(bloqueActual);
                }
            }

        } catch (IOException e) {
            System.out.println("Error al procesar el archivo.");
            e.printStackTrace();
        }

        try (BufferedWriter reescribir = new BufferedWriter(new FileWriter(origen))) {
            for (String linea : restantes) {
                reescribir.write(linea);
                reescribir.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al reescribir el archivo original.");
            e.printStackTrace();
        }

        sc.close();
    }
}
