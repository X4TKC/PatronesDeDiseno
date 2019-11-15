package TercerParcialClase.Facade.example;

public class AgenciaViajes {
    Hoteles encontrarHotel;
    RentaAutos encontrarAuto;
    Seguro encontrarSeguro;
    Vuelos encontrarVuelo;
    public AgenciaViajes(String disponibilidad, String date){
        encontrarHotel = new Hoteles(disponibilidad);
        encontrarAuto= new RentaAutos(disponibilidad,date);
        encontrarSeguro = new Seguro(disponibilidad,date);
        encontrarVuelo = new Vuelos(disponibilidad, date);
    }
    public void find(){
        encontrarHotel.findHotel();
        encontrarAuto.rentasDisponibles();
        encontrarSeguro.amount();
        encontrarVuelo.findFly();
    }
}
