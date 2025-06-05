package ejercicio4;

public class Autobus {
    private String matricula;
    private String modelo;
    private int potenciaCV;
    private int numeroPlazas;

    //METODOS

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }
    
    public int getNumeroPlazas() {
        return numeroPlazas;
    }
    
    public int getPotenciaCV() {
        return potenciaCV;
    }
}
