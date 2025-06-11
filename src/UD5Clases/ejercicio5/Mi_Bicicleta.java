package UD5Clases.ejercicio5;

public class Mi_Bicicleta {

    //ATRIBUTOS
    private String color="negro";
    private int velocidad=0;
    private int marcha=2;

    //METODOS
    int cambiarMarcha(int marcha){
        return marcha++;
    }

    int Avanzar(int velocidad){
        return velocidad++;
    }

    int Frenar(int velocidad){
        return velocidad--;
    }

}
