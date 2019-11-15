package TercerParcialExamen.Adapter;

public class AdapterAutoElectrico implements IAuto {
    private AutoElectrico electrico = new AutoElectrico();

    public AdapterAutoElectrico(AutoElectrico electrico) {
        this.electrico = electrico;
    }

    public void setLlenarGasolina(int gasolina) {
        this.electrico.cargar(gasolina);
    }

    public int estadoCombustible() {

        return this.electrico.estadoElectricidad()/10;
    }
}
