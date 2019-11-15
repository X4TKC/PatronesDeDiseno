package TercerParcialClase.Ejercicios.Adapter;

public class Refrigerador implements  IArtefactosEB{

    private int costo;
    private int garantia;
    public Refrigerador (int costo, int garantia){
        this.costo=costo;
        this.garantia=garantia;
    }

    public int getCosto(){
        return costo;
    }
    public int getGarantia(){
        return garantia;
    }


    @Override
    public void costo() {
        System.out.println("El costo es "+costo+"$ ");
    }

    @Override
    public void tiempoDeGarantia() {
        System.out.println("Tiempo de garantia de "+garantia+" anos");
    }
}