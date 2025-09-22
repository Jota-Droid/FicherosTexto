package ejercicios;

import java.io.*;
import java.util.*;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el nombre del fichero: ");
        String nombreArchivo = "src/ejercicios/" + scanner.nextLine();
        String archivoSalida = "salida.txt";

        List<String> lineas = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;

            while ((linea = reader.readLine()) != null) {
                lineas.add(linea);
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivoSalida))) {
                for (int i = lineas.size() - 1; i >= 0; i--) {
                    writer.write(lineas.get(i));
                    writer.newLine();
                }

                System.out.println("Archivo '" + archivoSalida + "' creado con éxito.");
                System.out.println("Se han escrito " + lineas.size() + " líneas en orden inverso.");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}

