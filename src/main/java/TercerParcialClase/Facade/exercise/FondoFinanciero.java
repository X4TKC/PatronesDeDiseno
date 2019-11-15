package TercerParcialClase.Facade.exercise;

public class FondoFinanciero {
    private String disponibilidad;
    public FondoFinanciero(String disponibilidad){
        this.disponibilidad=disponibilidad;

    }
    public void doFinancierStuff(){
        System.out.println("Doing financier stuff "+this.disponibilidad);
    }
}
