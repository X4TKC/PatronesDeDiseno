package TercerParcialClase.Facade.example;

public class Seguro {
    private String date;
    private String disponibilidad;
            public Seguro(String disponibilidad, String date){
                this.disponibilidad=disponibilidad;
                this.date=date;
            }
            public void amount(){
                System.out.println("Buscando Seguro"+this.disponibilidad);
            }
}
