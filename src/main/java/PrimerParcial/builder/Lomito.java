package PrimerParcial.builder;

//import ComputadoraBuilder.CompuProductBuilder;

public class Lomito extends ParrillaProductBuilder {
    @Override
    public void buildTipoCarne() {
        parrillas.setTipoCarne("Lomo");
    }

    @Override
    public void buildRefresco() {
        parrillas.setSaborRefresco("Pepsi");
    }

    @Override
    public void buildGuarnicion() {
        parrillas.setGuarniciones("Arroz");
    }
}
