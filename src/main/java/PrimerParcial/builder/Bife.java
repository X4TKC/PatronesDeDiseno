package PrimerParcial.builder;

//import PrimerParcial.builder.CompuProductBuilder;

public class Bife extends ParrillaProductBuilder {
    @Override
    public void buildTipoCarne() {
        parrillas.setTipoCarne("Bife");
    }

    @Override
    public void buildRefresco() {
        parrillas.setSaborRefresco("Coca Cola");
    }

    @Override
    public void buildGuarnicion() {
        parrillas.setGuarniciones("Papas Fritas");
    }
}
