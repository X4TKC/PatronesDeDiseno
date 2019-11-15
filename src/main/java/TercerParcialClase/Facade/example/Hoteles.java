package TercerParcialClase.Facade.example;

public class Hoteles {

    private String disponibilidad;
    public Hoteles(String disponibilidad){
        this.disponibilidad=disponibilidad;

    }
    public void findHotel(){
        System.out.println("Buscando Hoteles"+this.disponibilidad);
    }
}
