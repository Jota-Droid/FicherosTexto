package ejercicios;


import java.io.*;
import java.util.*;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el nombre del fichero: ");
        String nombreArchivo = "src/ejercicios/" + scanner.nextLine();

        List<String> lineas = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;

            while ((linea = reader.readLine()) != null) {
                lineas.add(linea);
            }

            System.out.println("El fichero contiene " + lineas.size() + " líneas.");
            System.out.println("\nContenido en orden inverso:");
            System.out.println("===========================");

            for (int i = lineas.size() - 1; i >= 0; i--) {
                System.out.println(lineas.get(i));
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        scanner.close();
    }
}

