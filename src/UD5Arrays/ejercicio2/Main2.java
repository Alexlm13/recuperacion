package UD5Arrays.ejercicio2;

public class Main2 {
    public static void main(String[] args) {
        Articulo [] articulos=new Articulo[3];
        articulos[0]=new Articulo("C01", "Camiseta");
        articulos[1]=new Articulo("C02", "Pantalón");
        articulos[2]=new Articulo("C03", "Zapatillas");

        for (Articulo articulo : articulos) {
            System.out.println(articulo);
        }
    }
}
