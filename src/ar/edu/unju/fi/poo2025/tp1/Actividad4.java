package ar.edu.unju.fi.poo2025.tp1;

import java.util.Scanner;

public class Actividad4 {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Verificación Palíndromos");
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();

        boolean resultado = PalindromoValidador.esPalindromo(palabra);

        if(resultado) {
            System.out.println("La palabra '" + palabra + "' es un palíndromo");
        } else {
            System.out.println("La palabra '" + palabra + "' NO es un palíndromo");
        }

        scanner.close();
    }
}