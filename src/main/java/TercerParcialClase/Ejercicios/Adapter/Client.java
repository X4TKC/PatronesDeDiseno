package TercerParcialClase.Ejercicios.Adapter;

import java.util.ArrayList;

public class Client {

    public static void main(String[] args){

        Celular celular=new Celular(500,6);
        Tablet tablet = new Tablet(100,2);
        Computadora computadora= new Computadora(150,7);
        
        Televisor televisor = new Televisor(120,11);
        Lavadora lavadora= new Lavadora(300,6);
        Refrigerador refrigerador = new Refrigerador(420,8);
        AdapterTelevisorEA televisorEA = new AdapterTelevisorEA(televisor);
        AdapterLavadoraEA lavadoraEA = new AdapterLavadoraEA(lavadora);
        AdapterRefrigeradorEA refrigeradorEA = new AdapterRefrigeradorEA(refrigerador);

        ArrayList<IArtefactosEA> list = new ArrayList<>();
        list.add(celular);
        list.add(tablet);
        list.add(computadora);
        list.add(televisorEA);
        list.add(lavadoraEA);
        list.add(refrigeradorEA);
        for (IArtefactosEA var:list) {
            var.precio();
            var.tiempoDeVida();
        }



    }
        

    }

