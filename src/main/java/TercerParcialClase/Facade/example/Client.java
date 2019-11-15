package TercerParcialClase.Facade.example;

public class Client {
    public static void main(String[] args){
//        Hoteles encontrarHotel = new Hoteles("abc");
//        RentaAutos encontrarAuto = new RentaAutos("abc","asd");
//        Seguro encontrarSeguro = new Seguro("abc","asd");
//        Vuelos encontrarVuelo = new Vuelos("abc","asd");
//
//        encontrarHotel.findHotel();
//        encontrarAuto.rentasDisponibles();
//        encontrarSeguro.amount();
//        encontrarVuelo.findFly();
        AgenciaViajes agenciaViajes = new AgenciaViajes("abc","asd");
        agenciaViajes.find();

    }
}
