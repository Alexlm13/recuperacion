package UD5Arrays.ejercicio2;

public class Main {
    public static void main(String[] args) {
        Articulo[] articulos=new Articulo[]{
            new Articulo("C01", "Camiseta"),
            new Articulo("C02", "Pantalón"),
            new Articulo("C03", "Zapatillas")
        };

        for (Articulo articulo : articulos) {
            System.out.println(articulo);
        }

    }
}
