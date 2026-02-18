import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainHashMapCuenta {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> contadorPalabras = new HashMap<>();

        System.out.println("Introduce un texto:");
        String texto = scanner.nextLine();


        texto = texto.toLowerCase().replaceAll("[.,;:!?]", "");

        String[] palabras = texto.split("\\s+");

        for (String palabra : palabras) {
            if (contadorPalabras.containsKey(palabra)) {
                contadorPalabras.put(palabra, contadorPalabras.get(palabra) + 1);
            } else {
                contadorPalabras.put(palabra, 1);
            }
        }

        System.out.println("\nFrecuencia de cada palabra:");
        for (Map.Entry<String, Integer> entrada : contadorPalabras.entrySet()) {
            System.out.println(entrada.getKey() + " -> " + entrada.getValue());
        }

        scanner.close();
    }
}
