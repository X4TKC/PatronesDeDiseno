package mediator.example;


public class Client {
    public static void main (String[] args){
        torreGeneral torre = new torreGeneral();

        Vuelo747 vuelo747 = new Vuelo747(torre,"vuelo747");
        Vuelo1011 vuelo1011 = new Vuelo1011(torre,"vuelo1011");
        Vuelo112 vuelo112 = new Vuelo112(torre,"vuelo112");
        Vuelo7E7 vuelo7E7 = new Vuelo7E7(torre,"vuelo7E7");

        torre.setVuelo7E7(vuelo7E7);
        torre.setVuelo112(vuelo112);
        torre.setVuelo747(vuelo747);
        torre.setVuelo1011(vuelo1011);

        vuelo7E7.send("mensaje - hola vuelo 1011","vuelo1011");
        vuelo112.send("mensaje - hola vuelo 7E7","vuelo7E7");
        vuelo112.send("mensaje - hola vuelos","");
    }
}
