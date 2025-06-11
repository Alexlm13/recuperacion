package UD5Clases.ejercicio13;

public class Main {
    public static void main(String[] args) {
        Cubo c1=new Cubo(20, 12);
        Cubo c2=new Cubo(30, 19);

        c1.añadirLitros(2);
        c2.añadirLitros(12);
        System.out.println();
        c1.quitarLitros(15);
        c2.quitarLitros(19);

    }
}
