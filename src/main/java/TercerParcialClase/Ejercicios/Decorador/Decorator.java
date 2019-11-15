package TercerParcialClase.Ejercicios.Decorador;

public abstract class Decorator implements IBanco {
    private IBanco componente;



    public Decorator(IBanco componente){
        this.componente = componente;

    }
    @Override
    public void operation(){

        componente.operation();
    }
    @Override
    public void setMonto(double monto) {
        componente.setMonto(monto);
    }

    @Override
    public double getMonto() {
        return componente.getMonto();
    }

    @Override
    public void setName(String name) {
        componente.setName(name);
    }

    @Override
    public String getName() {
        return componente.getName();
    }
}
