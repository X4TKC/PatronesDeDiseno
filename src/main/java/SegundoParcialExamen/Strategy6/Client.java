package SegundoParcialExamen.Strategy6;

import java.util.LinkedList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        List<Ropa> ropaList = new LinkedList<>();

        Ropa ropa1 = new Ropa("Tipo 1",2000);
        Ropa ropa2 = new Ropa("Tipo 2",5000);
        Ropa ropa3 = new Ropa("Tipo 3", 6000);
        Ropa ropa4 = new Ropa("Tipo 4", 4000);
        Ropa ropa5 = new Ropa("Tipo 5", 3500);

        ropaList.add(ropa1);
        ropaList.add(ropa2);
        ropaList.add(ropa3);
        ropaList.add(ropa4);
        ropaList.add(ropa5);


        TiendaRopa context = new TiendaRopa(ropaList);

        context.setEstacion(enumEstacion.Invierno);
        context.cambiarEstrategia();
        System.out.println();
        context.setEstacion(enumEstacion.Verano);
        context.cambiarEstrategia();
        System.out.println();
        context.setEstacion(enumEstacion.Primavera);
        context.cambiarEstrategia();
        System.out.println();
        context.setEstacion(enumEstacion.Otono);
        context.cambiarEstrategia();




    }
}
