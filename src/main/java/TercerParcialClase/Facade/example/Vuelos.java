package TercerParcialClase.Facade.example;

public class Vuelos {
    private String date;
    private String disponibilidad;
            public Vuelos(String disponibilidad, String date){
                this.disponibilidad=disponibilidad;
                this.date=date;
            }
            public void findFly(){
                System.out.println("Buscando Vuelos"+this.disponibilidad);
            }
}
