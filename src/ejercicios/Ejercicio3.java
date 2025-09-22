package ejercicios;
import java.io.*;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el nombre del fichero: ");
        String nombreArchivo ="src/ejercicios/" + scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            int contador = 0;

            while (reader.readLine() != null) {
                contador++;
            }

            System.out.println("El fichero contiene " + contador + " líneas.");

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        scanner.close();
    }
}