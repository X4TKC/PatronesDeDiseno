package TercerParcialClase.Facade.exercise;

public class Abogados {
    private String disponibilidad;
    public Abogados(String disponibilidad){
        this.disponibilidad=disponibilidad;

    }
    public void doLegalStuff(){
        System.out.println("Doing legal stuff "+this.disponibilidad);
    }
}
