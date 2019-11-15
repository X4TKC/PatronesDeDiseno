package TercerParcialExamen.Adapter;

import java.util.ArrayList;

public class Client {
    public Client() {
    }

    public static void main(String[] args) {
        Diesel diesel = new Diesel();
        AutoElectrico electrico = new AutoElectrico();
        GasEspecial especial = new GasEspecial();
        Gasolina gasolina = new Gasolina();
        Adaptador adaptador = new Adaptador(electrico);
        ArrayList<IAutoNormal> autos = new ArrayList();
        autos.add(especial);
        autos.add(adaptador);
        autos.add(diesel);
        autos.add(gasolina);
        diesel.setLlenarGasolina(20);
        especial.setLlenarGasolina(60);
        gasolina.setLlenarGasolina(9);
        adaptador.setLlenarGasolina(94);

        for(int i = 0; i < autos.size(); ++i) {
            ((IAutoNormal)autos.get(i)).estadoCombustible();
        }

    }
}
