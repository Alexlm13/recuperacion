package UD5Arrays.ejercicio4;

import UD5Arrays.ejercicio2.Articulo;
import UD5Arrays.ejercicio3.PruebaArticulo;
import java.util.*;


public class GestorAlmacen {
    private PruebaArticulo almacen;
    private Scanner entrada=new Scanner(System.in);

    //Constructor
    public GestorAlmacen(int tamañoArray){
        almacen= new PruebaArticulo(tamañoArray);
    }

    //Entrada automatizada
    public void entradaAutomatizada(){
        almacen.almacena(new Articulo("1", "Tornillo"));
        almacen.almacena(new Articulo("2", "Martillo"));
        almacen.almacena(new Articulo("3", "Sierra"));
        almacen.almacena(new Articulo("4", "Clavo"));
        System.out.println("Se añadieron artículos de prueba");
    }

    //Lista
    public void lista(){
        System.out.println(almacen.toString());
    }

    //Alta
    public void alta(){
        System.out.println("Dar de alta un artículo: ");
        System.out.println("Código: ");
        String codigo=entrada.nextLine();
        System.out.println("Descripción: ");
        String descripcion=entrada.nextLine();
        Articulo newArticulo=new Articulo(codigo, descripcion);
    
        System.out.print("Precio de compra: ");
        newArticulo.setPrecioCompra(entrada.nextInt());
        System.out.print("Precio de venta: ");
        newArticulo.setPrecioVenta(entrada.nextInt());
        System.out.print("Stock inicial: ");
        newArticulo.setStock(entrada.nextInt());
        entrada.nextLine();

        if (almacen.almacena(newArticulo)) {
            System.out.println("Se añadió correctamente.");
        } else {
            System.out.println("No hay espacio en el almacén.");
        }
    }

    //Baja
    public void baja(){
        System.out.println("Código del artículo que desea eliminar: ");
        String codigo=entrada.nextLine();
    
        Articulo[] articulos=almacen.getArticulos();

        boolean eliminado=false;

        for (int i = 0; i < articulos.length; i++) {
            if (articulos[i]!=null && articulos[i].getCodigo().equals(codigo)) {
                articulos[i]=null;
                break;
            }
        }
        if (eliminado) {
            System.out.println("Artículo eliminado correctamente.");
        }else{
            System.out.println("No se encontró un artículo con ese código.");
        }
    }
}
