package ar.edu.unju.fi.poo2025.tp1;

public class CalculoRentabilidad {
    public static double calcular (double capital, double tiempo,double tasa) {
        double resultado = capital * (tasa / 100.0) * (tiempo / 365.0);
        return Math.round(resultado * 100.0) / 100.0;
    }
}
