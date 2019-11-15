package TercerParcialClase.Facade.exercise;

public class Arquitectos {
    private String disponibilidad;
    public Arquitectos(String disponibilidad){
        this.disponibilidad=disponibilidad;

    }
    public void doArquitectStuff(){
        System.out.println("Doing Arquitect stuff "+this.disponibilidad);
    }
}
