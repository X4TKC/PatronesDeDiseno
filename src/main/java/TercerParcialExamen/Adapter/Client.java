package TercerParcialExamen.Adapter;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        AutoDiesel autoDiesel = new AutoDiesel();
        AutoElectrico autoElectrico = new AutoElectrico();
        AutoGasEspecial autoGasEspecial = new AutoGasEspecial();
        AutoGasolina autoGasolina = new AutoGasolina();
        AdapterAutoElectrico adapterAutoElectrico = new AdapterAutoElectrico(autoElectrico);
        ArrayList<IAuto> autos = new ArrayList();
        autos.add(autoGasEspecial);
        autos.add(adapterAutoElectrico);
        autos.add(autoDiesel);
        autos.add(autoGasolina);
        autoDiesel.setLlenarGasolina(20);
        autoGasEspecial.setLlenarGasolina(60);
        autoGasolina.setLlenarGasolina(9);
        adapterAutoElectrico.setLlenarGasolina(94);

        for(int i = 0; i < autos.size(); ++i) {
            autos.get(i).estadoCombustible();
        }

    }
}
