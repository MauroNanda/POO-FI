package ar.edu.unju.fi.poo2025.tp1;

public class PalindromoValidador {
    public static boolean esPalindromo(String palabra) {
        int izquierda = 0;
        int derecha = palabra.length() - 1;

        while(izquierda < derecha) {
            if(palabra.charAt(izquierda) != palabra.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        }
        return true;
    }
}
