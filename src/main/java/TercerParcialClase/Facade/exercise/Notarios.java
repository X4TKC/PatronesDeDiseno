package TercerParcialClase.Facade.exercise;

public class Notarios {
    private String disponibilidad;
    public Notarios(String disponibilidad){
        this.disponibilidad=disponibilidad;

    }
    public void doNotaryStuff(){
        System.out.println("Doing Notary stuff "+this.disponibilidad);
    }
}
