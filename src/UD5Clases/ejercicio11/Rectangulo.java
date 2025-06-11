package UD5Clases.ejercicio11;

public class Rectangulo {
    private int base;
    private int altura;
    private static int RectanguloCreados;

    public Rectangulo(int base, int altura){
        this.base=base;
        this.altura=altura;
        RectanguloCreados++;
    }

    public static int getRectanguloCreados() {
        return RectanguloCreados;
    }

    @Override
    public String toString() {
        String cadena="";
        for (int i = 0; i < this.altura; i++) {
            cadena+="*";
            for (int j = 0; j < this.base; j++) {
                cadena+="*";
            }
            cadena+="\n";
        }
        return cadena;
    }
}
