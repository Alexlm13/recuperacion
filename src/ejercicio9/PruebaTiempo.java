package ejercicio9;

public class PruebaTiempo {
    public static void main(String[] args) {
        Tiempo t=new Tiempo(0, 30, 40);
        Tiempo t2=new Tiempo(0, 35, 20);

        t.suma(t2);
        System.out.println(t);


        Tiempo t3=new Tiempo(12, 56, 40);
        Tiempo t4=new Tiempo(11, 3, 20);

        t3.suma(t4);
        System.out.println(t3);
    }
}
