package TercerParcialClase.Ejercicios.Decorador;

public class BancaInternet extends Decorator {
    private boolean enable=false;
    public BancaInternet(IBanco componente) {
        super(componente);
    }
    public void operation(){
        super.operation();
        enable=true;
        System.out.println("Banca por internet habilitada ");
    }
}
