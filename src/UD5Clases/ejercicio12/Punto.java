package UD5Clases.ejercicio12;

public class Punto {
    private double x, y;

    public Punto(double x, double y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "("+x+" , "+y+")";
    }
}
