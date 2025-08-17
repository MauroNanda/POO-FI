package ar.edu.unju.fi.poo2025.tp1;
import java.util.Scanner;

public class Actividad1 {
    public static void ejecutar(){
        Scanner escaner = new Scanner(System.in);
        System.out.println("Ingrese su altura (cm)");
        double altura = escaner.nextDouble()/100;
        System.out.println("Ingrese su peso (kg)");
        double peso = escaner.nextDouble();
        double imc = CalculoIMC.calcular(altura,peso);
        System.out.println("El IMC es: "+imc);
    }
}
