package ar.edu.unju.fi.poo2025.tp1;

public class EsBisiesto {
    public static boolean comprobar(int anioActual ){
        return (anioActual % 4 == 0 && anioActual % 100 != 0) || (anioActual % 400 == 0);
    }
}
