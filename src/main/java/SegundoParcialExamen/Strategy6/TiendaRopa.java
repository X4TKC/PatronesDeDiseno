package SegundoParcialExamen.Strategy6;
import java.util.List;

public class TiendaRopa {
    private IStrategy strategy;
    private List<Ropa> ropaList;
    private int precio;
    private enumEstacion estacion;



    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void setEstacion(enumEstacion estac) {
        this.estacion = estac;
        if (estacion==enumEstacion.Invierno){
            estrategiaInvierno();
        }else if (estacion==enumEstacion.Primavera){
            estrategiaPrimavera();
        }else if (estacion==enumEstacion.Verano){
            estrategiaVerano();
        }else if (estacion==enumEstacion.Otono){
            estrategiaOtonio();
        }else {
            estrategiaPrimavera();
        }

    }

    public void estrategiaInvierno() {
     this.strategy = new Invierno(ropaList);
    }

    public void estrategiaOtonio() {
        this.strategy = new Otono(ropaList);
    }

    public void estrategiaVerano() {
        this.strategy = new Verano(ropaList);
    }
    public void estrategiaPrimavera() {
        this.strategy = new Primavera(ropaList);
    }


    public TiendaRopa(List<Ropa> ropaList){
        this.ropaList=ropaList;
    }
    public void cambiarEstrategia(){
        strategy.cambioDeEstacion();
    }

    //otros metodos
}
