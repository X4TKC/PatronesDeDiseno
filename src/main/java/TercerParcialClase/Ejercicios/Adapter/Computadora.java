package TercerParcialClase.Ejercicios.Adapter;

public class Computadora implements IArtefactosEA {

    private int precio;
    private int tiempo;
    public Computadora(int precio, int tiempo){
        this.precio=precio;
        this.tiempo=tiempo;
    }
    @Override
    public void precio() {
        System.out.println("El precio es "+precio+"$ ");
    }

    @Override
    public void tiempoDeVida() {
        System.out.println("Tiempo de vida de "+tiempo+" anos ");
    }
}