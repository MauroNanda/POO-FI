package ar.edu.unju.fi.poo2025.tp1;

public class ProximosBisiestos {
    public static void mostrar(){
        int anioActual = ObtenerAnoActual.extraer() + 1;
        int contador = 0;
        while (contador < 10){
            if (EsBisiesto.comprobar(anioActual)){
                System.out.println(anioActual + " es un año bisiesto");
                contador++;
            }
            anioActual++;
        }
    }
}
