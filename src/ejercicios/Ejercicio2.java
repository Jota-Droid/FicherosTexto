package ejercicios;

import java.io.*;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el nombre del fichero: ");
        String nombreArchivo ="src/ejercicios/" + scanner.nextLine();


        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            int contador = 0;

            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
                contador++;

                if (contador % 24 == 0) {
                    System.out.println("\n--- PULSA INTRO PARA CONTINUAR ---");
                    scanner.nextLine();
                }
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        scanner.close();
    }
}


