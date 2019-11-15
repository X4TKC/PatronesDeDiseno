package TercerParcialClase.Ejercicios.Decorador;

public class Banco implements IBanco {
    private double monto;
    private String name;
    public Banco(String name, double monto){
        this.monto=monto;
        this.name=name;
    }

    @Override
    public void setMonto(double monto) {
        this.monto=monto;
    }

    @Override
    public double getMonto() {
        return monto;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void operation() {

    }
}
