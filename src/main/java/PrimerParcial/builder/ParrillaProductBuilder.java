package PrimerParcial.builder;


public abstract class ParrillaProductBuilder {
    protected Parrillas parrillas;

    public Parrillas getParrillas() {
        return parrillas;
    }

    public void createProduct() {

        parrillas = new Parrillas();
    }

    public abstract void buildTipoCarne();

    public abstract void buildRefresco();

    public abstract void buildGuarnicion();


}
