package UD5Clases.ejercicio12;

public class Linea {
    Punto a, b;
    public Linea(Punto a, Punto b){
        this.a=a;
        this.b=b;
    }

    @Override
    public String toString() {
        return "Línea formada por los puntos "+a+" y "+b;
    }
}
