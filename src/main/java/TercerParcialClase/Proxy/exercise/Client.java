package TercerParcialClase.Proxy.exercise;

public class Client {
    public static void main (String [] args){
        // create Proxy
        Cajero cajero = new Cajero(new Cuenta(enumMoney.Bs,800));
        cajero.request();
        cajero = new Cajero(new Cuenta(enumMoney.$,800));
        cajero.request();
        cajero = new Cajero(new Cuenta(enumMoney.Euros,800));
        cajero.request();
    }
}
