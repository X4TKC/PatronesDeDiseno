package PrimerParcial.builder;

//import ComputadoraBuilder.CompuProductBuilder;

public class Tira extends ParrillaProductBuilder {
    @Override
    public void buildTipoCarne() {
        parrillas.setTipoCarne("Tira de carne");
    }

    @Override
    public void buildRefresco() {
        parrillas.setSaborRefresco("Coca Cola");
    }

    @Override
    public void buildGuarnicion() {
        parrillas.setGuarniciones("fideo");
    }
}
