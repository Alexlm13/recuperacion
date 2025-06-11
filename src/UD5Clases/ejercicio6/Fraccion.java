package UD5Clases.ejercicio6;

public class Fraccion {

    //ATRIBUTOS
    private int numerador;
    private int denominador;

    //METODOS

    //constructor
    public Fraccion(int numerador, int denominador){
        this.denominador=denominador;
        this.numerador=numerador;
    }


    public void invierte(){
        int invertir;

        invertir=numerador;
        numerador=denominador;
        denominador=invertir;
        System.out.println("La fracción invertida sería: "+numerador+"/"+denominador);
    }

    public int multiplicacion(Fraccion f1, Fraccion f2){
        Fraccion f3 = new Fraccion(numerador, denominador);
        
    }

}

