package SegundoParcialExamen.Strategy6;

import java.util.List;

public class Otono implements IStrategy {

    private List<Ropa> ropaList;
    private int nuevoPrecio;

    public Otono(List<Ropa> ropaList) {
        this.ropaList = ropaList;
    }
    @Override
    public void cambioDeEstacion() {
        for (int i = 0; i < ropaList.size(); i++){
            nuevoPrecio = ropaList.get(i).getPrecio()-((50*ropaList.get(i).getPrecio())/100);
            System.out.println("Ropa "+ropaList.get(i).getTipo() +" en otono rebaja su precio a: "+nuevoPrecio);
        }

    }
}
