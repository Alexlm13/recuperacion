package UD5Arrays.ejercicio2;

public class Articulo {
    //atributos
    private String codigo, descripcion;
    private int precioVenta, precioCompra, stock;

    //Metodo constructor
    public Articulo(String codigo, String descripcion){
        this.codigo=codigo;
        this.descripcion=descripcion;
    }

    //GETTERS
    public String getCodigo() {
        return codigo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public int getPrecioCompra() {
        return precioCompra;
    }
    public int getPrecioVenta() {
        return precioVenta;
    }
    public int getStock() {
        return stock;
    }

    //SETTERS
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }
    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    //toString
    @Override
    public String toString() {
        return "Código: "+codigo+"\nDescripción: "+descripcion+"\n";
    }
}
