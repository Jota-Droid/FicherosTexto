package ejercicios;

import java.io.*;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreArchivo = "ejercicios/frases.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            System.out.println("Introduce frases (escribe 'fin' para terminar):");

            String frase;
            while (true) {
                System.out.print("Frase: ");
                frase = sc.nextLine();

                if (frase.equalsIgnoreCase("fin")) {
                    break;
                }

                writer.write(frase);
                writer.newLine();
            }

            System.out.println("Frases guardadas en " + nombreArchivo);

        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }

        sc.close();
    }
}

