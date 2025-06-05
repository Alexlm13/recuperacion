package ejercicio9;

public class Tiempo {

    //ATRIBUTOS
    private int horas, minutos, segundos;

    //METODOS
    //constructor

    public Tiempo(int horas, int minutos, int segundos){
        this.horas=horas;
        this.minutos=minutos;
        this.segundos=segundos;
        Ajuste();
    }

    public void suma(Tiempo t){
        this.horas+=t.horas;
        this.minutos+=t.minutos;
        this.segundos+=t.segundos;
        Ajuste();
    }

    public void resta(Tiempo t){
        this.horas-=t.horas;
        this.minutos-=t.minutos;
        this.segundos-=t.segundos;
        Ajuste();
    }

    private void Ajuste(){
        //ajuste de segundos
        if (this.segundos>=60) {
            this.minutos++;
            this.segundos-=60;
        } else if (this.segundos<0) {
            this.segundos+=60;
            this.minutos--;
        }

        //ajuste de minutos
        if (this.minutos>=60) {
            this.horas++;
            this.minutos-=60;
        } else if (this.minutos<0) {
            this.minutos+=60;
            this.horas--;
        }

        //ajuste de horas
        if (horas>=24) {
            int dias=0;
            dias=dias+(horas/24);
            horas=horas%24;
            System.out.println("Ha pasado "+dias+" día/s");
        }
        if (horas<0){
            horas=0;
        }
    }

    @Override
    public String toString() {
        return (this.horas+"h "+this.minutos+"m "+this.segundos+"s");
    }
}
