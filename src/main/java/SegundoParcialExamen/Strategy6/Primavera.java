package SegundoParcialExamen.Strategy6;

import java.util.List;

public class Primavera implements IStrategy {

    private List<Ropa> ropaList;


    public Primavera(List<Ropa> ropaList) {
        this.ropaList = ropaList;
    }
    @Override
    public void cambioDeEstacion() {

        for (int i = 0; i < ropaList.size(); i++){
            System.out.println("Ropa "+ropaList.get(i).getTipo() +" en primavera se maneitne su precio a "+ropaList.get(i).getPrecio());
        }
    }
}
