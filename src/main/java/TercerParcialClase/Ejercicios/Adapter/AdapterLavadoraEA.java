package TercerParcialClase.Ejercicios.Adapter;

public class AdapterLavadoraEA implements IArtefactosEA {
    Lavadora component;
    public AdapterLavadoraEA(Lavadora component){
        this.component = component;
    }


    @Override
    public void precio() {
        System.out.println("El precio es "+component.getCosto()+"$ ");
    }

    @Override
    public void tiempoDeVida() {
        System.out.println("Tiempo de vida de "+component.getGarantia()+" anos ");
    }
}