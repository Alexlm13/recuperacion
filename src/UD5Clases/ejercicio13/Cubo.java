package UD5Clases.ejercicio13;

public class Cubo {
    private int cantidadMaxima;
    private int litrosContiene;

    public Cubo(int cantidadMaxima, int litrosContiene){
        this.cantidadMaxima=cantidadMaxima;
        this.litrosContiene=litrosContiene;
    }

    public void quitarLitros(int litros){
        if (litrosContiene<litros) {
            System.out.println("No puedes echar "+litros+" litros ya que la cantdidad de litros que contiene el cubo es de "+litrosContiene+" litros");
        } else {
            litrosContiene-=litros;
        }
    }

    public void añadirLitros(int litros){
        if (litrosContiene+litros>cantidadMaxima) {
            System.out.println("Si viertes "+litros+" litros en el cubo acabará desbordandose");
        } else {
            litrosContiene+=litros;
        }
    }

    @Override
    public String toString() {
        return "El cubo tiene una capacidad máxima de "+cantidadMaxima+" litros, y contiene exáctamente "+litrosContiene+" litros.";
    }
}
