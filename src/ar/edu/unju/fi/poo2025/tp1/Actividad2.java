package ar.edu.unju.fi.poo2025.tp1;

import java.util.Scanner;

public class Actividad2 {
    public static void rentabilidad() {
        System.out.println("Ingrese el capital a depositar: ");
        Scanner escaner = new Scanner(System.in);
        double capital = escaner.nextDouble();
        System.out.println("Ingrese el plazo de días que desea invertir: ");
        double tiempo = escaner.nextDouble();
        double tasa = 33;
        double rentabilidad = CalculoRentabilidad.calcular(capital,tiempo,tasa);
        System.out.println("La rentabilidad con un capital de "+capital+" a un plazo de "+tiempo+" es de: "+rentabilidad);
    }
}
