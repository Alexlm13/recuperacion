package ejercicio10;

public class Incidencia {
    //atributos
    private static int contador=0;
    private static int pendientes=0;

    private int codIncidencia;
    private int puesto;
    private String problema;
    private String solucion;
    private boolean resuelta;

    //METODOS
    //constructor
    public Incidencia(int puesto, String problema){
        this.puesto=puesto;
        this.problema=problema;
        this.codIncidencia= ++contador;
        this.resuelta=false;
        pendientes++;
    }

    public void resuelve(String solucion){
        if (!resuelta) {
            this.solucion=solucion;
            this.resuelta=true;
            pendientes--;
        }
    }

    public static int getPendientes() {
        return pendientes;
    }

    @Override
    public String toString() {
        if (resuelta) {
            return "Incidencia "+codIncidencia+"| Puesto: "+puesto+" | "+problema+" | Resuelta |"+solucion;
        } else {
            return "Incidencia "+codIncidencia+"| Puesto: "+puesto+" | "+problema+" | Pendiente";
        }
    }

}
