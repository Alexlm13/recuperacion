package UD5Arrays.ejercicio3;

import java.util.*;
import UD5Arrays.ejercicio2.Articulo;

public class Prueba {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        Articulo a1=new Articulo("B001", "Disco hockey");
        Articulo a2=new Articulo("B002", "Zapatillas senderimso");

        int tamaño=2;
        
        PruebaArticulo prueba=new PruebaArticulo(tamaño);

        prueba.almacena(a1);
        prueba.almacena(a2);

        System.out.println(prueba);

        entrada.close();
    }
}
