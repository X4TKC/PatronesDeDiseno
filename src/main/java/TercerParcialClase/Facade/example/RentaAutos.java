package TercerParcialClase.Facade.example;

public class RentaAutos {
    private String date;
    private String disponibilidad;
            public RentaAutos(String disponibilidad, String date){
                this.disponibilidad=disponibilidad;
                this.date=date;
            }
            public void rentasDisponibles(){
                System.out.println("Buscando Renta de Autos"+this.disponibilidad);
            }
}
