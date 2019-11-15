package TercerParcialExamen.Adapter;

public class Adaptador implements IAutoNormal{
    private AutoElectrico electrico = new AutoElectrico();

    public Adaptador(AutoElectrico electrico) {
        this.electrico = electrico;
    }

    public void setLlenarGasolina(int gasolina) {
        this.electrico.cargar(gasolina);
    }

    public int estadoCombustible() {
        return this.electrico.estadoElectricidad();
    }
}
