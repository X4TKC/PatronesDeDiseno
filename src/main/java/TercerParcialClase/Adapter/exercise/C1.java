package TercerParcialClase.Adapter.exercise;

public class C1 implements ICooperativas {
    private double credito;

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }


    @Override
    public void credito(int cred) {
        credito=cred;
    }
}
