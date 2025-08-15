package ar.edu.unju.fi.poo2025.tp1;
import java.util.Scanner;

public class Actividad1 {
    public static void ejecutar(){
        System.out.println("Hola mundo");
        Scanner escaner = new Scanner(System.in);
        System.out.println("Ingrese su altura (cm)");
        Double altura = escaner.nextDouble()/100;
        System.out.println("Ingrese su peso (kg)");
        Double peso = escaner.nextDouble();
        Double imc = CalculoIMC.calcular(altura,peso);
        System.out.println("El IMC es: "+imc);
    }
}
