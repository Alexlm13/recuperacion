package UD5Arrays.ejercicio3;

import UD5Arrays.ejercicio2.Articulo;

public class PruebaArticulo {
    int objetoAlmacenado=0;
    int tamañoArray;
    private Articulo[] articulos;

    //Metodo constructor
    public PruebaArticulo(int tamañoArray){
        this.tamañoArray=tamañoArray;
        this.articulos=new Articulo[tamañoArray];
    }

    //Metodo almacena
    public boolean almacena(Articulo a1){
        if (objetoAlmacenado < tamañoArray) {
            articulos[objetoAlmacenado]=a1;
            objetoAlmacenado++;
            return true;
        } else {
            return false;
        }
    }

    //toString
    @Override
    public String toString() {
        String articulo="";
        for (int i = 0; i < objetoAlmacenado; i++) {
            articulo+=articulos[i].toString();
            articulo+="\n";
        }
        return articulo.toString();
    }
}