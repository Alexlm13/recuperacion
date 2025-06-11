package UD5Arrays.ejercicio1;

public class Autobus {
    String matricula;
    String modelo;
    int potenciaCV;
    int numeroPlazas;

    //METODOS

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public int getNumeroPlazas() {
        return numeroPlazas;
    }
    
    public int getPotenciaCV() {
        return potenciaCV;
    }
    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public String toString() {
        return "Matrícula: "+matricula+"\nModelo: "+modelo+"\nPotenciaCV: "+potenciaCV+"\nPlazas: "+numeroPlazas+"\n";
    }
}
