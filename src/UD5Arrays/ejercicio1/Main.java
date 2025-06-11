package UD5Arrays.ejercicio1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        Autobus[] autobuses=new Autobus[4];

        for (int i = 0; i < autobuses.length; i++) {
            autobuses[i]=new Autobus();
            System.out.println("Introduzca los datos del bus "+(i+1));
            System.out.println("Matrícula: ");
            System.out.print(">>>> ");
            autobuses[i].matricula=entrada.nextLine();
            System.out.println("Modelo: ");
            System.out.print(">>>> ");
            autobuses[i].modelo=entrada.nextLine();
            System.out.println("CV: ");
            System.out.print(">>>> ");
            autobuses[i].potenciaCV=entrada.nextInt();
            System.out.println("Plazas: ");
            System.out.print(">>>> ");
            autobuses[i].numeroPlazas=entrada.nextInt();
            System.out.println("");
            entrada.nextLine();
        }

        System.out.println("Datos de los autobuses: ");
        for (Autobus autobus : autobuses) {
            System.out.println(autobus);
        }
        
    }
}
