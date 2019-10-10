package PrimerParcial.builder;


public class Cliente {
    public static void main(String[] args) {
        Mesero mesero = new Mesero();
        ParrillaProductBuilder TiraPlato = new Tira();
        mesero.setProductBuilder(TiraPlato);
        mesero.buildParrilla();
        Parrillas parrillas = mesero.getProduct();
        System.out.println(parrillas.getTipoCarne());


        ParrillaProductBuilder Lomo = new Lomito();
        mesero.setProductBuilder(Lomo);
        mesero.buildParrilla();
        parrillas = mesero.getProduct();
        System.out.println(parrillas.getTipoCarne());

        ParrillaProductBuilder Bife = new Bife();
        mesero.setProductBuilder(Bife);
        mesero.buildParrilla();
        parrillas = mesero.getProduct();
        System.out.println(parrillas.getGuarniciones());
    }
}
