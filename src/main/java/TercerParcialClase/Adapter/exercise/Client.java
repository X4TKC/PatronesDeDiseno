package TercerParcialClase.Adapter.exercise;

import java.util.ArrayList;

public class Client {

    public static void main(String[] args){
        C1 c1 = new C1();
        C2 c2 = new C2();
        AdapterC1 adapterC1 = new AdapterC1(c1);
        AdapterC2 adapterC2 = new AdapterC2(c2);
        BancoSol bancoSol = new BancoSol();
        Union union = new Union();
        Prodem prodem = new Prodem();

        c1.credito(5);
        c2.credito(5);

        adapterC1.setCuenta();
        adapterC2.setCuenta();
        bancoSol.setCuenta(10);
        union.setCuenta(12);
        prodem.setCuenta(9);
        ArrayList<IBancoBs> bancos=new ArrayList<>();
        bancos.add(adapterC1);
        bancos.add(adapterC2);
        bancos.add(bancoSol);
        bancos.add(union);
        bancos.add(prodem);
        for (int i = 0; i <bancos.size(); i++) {
            bancos.get(i).Prestamo();
            System.out.println(bancos.get(i).getCuenta() +" Bs");
        }

    }
}
