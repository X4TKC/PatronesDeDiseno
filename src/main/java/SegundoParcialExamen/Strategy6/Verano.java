package SegundoParcialExamen.Strategy6;
import java.util.List;

public class Verano implements IStrategy {

    private List<Ropa> ropaList;
    private int nuevoPrecio;

    public Verano(List<Ropa> ropaList) {
        this.ropaList = ropaList;
    }
    @Override
    public void cambioDeEstacion() {
        for (int i = 0; i < ropaList.size(); i++){
            nuevoPrecio = ropaList.get(i).getPrecio()-((10*ropaList.get(i).getPrecio())/100);
            System.out.println("Ropa "+ropaList.get(i).getTipo() +" en verano rebaja su precio a: "+nuevoPrecio);
        }
    }
}
