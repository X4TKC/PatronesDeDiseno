package TercerParcialClase.Ejercicios.Decorador;

public class SeguroCuenta extends Decorator {
    private double x=15.0;
    public SeguroCuenta(IBanco componente) {
        super(componente);
    }
    public void operation(){
        super.operation();
        System.out.println("Monto: "+getMonto()+" X: " + x);
        setMonto(getMonto()-x);
        System.out.println("Monto "+x+" descontado del monto total para el seguro de la cuenta ");
    }
}
