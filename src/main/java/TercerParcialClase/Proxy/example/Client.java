package TercerParcialClase.Proxy.example;


public class Client {

    public static void main (String [] args){
        // create Proxy
        IServer proxy = new Proxy(new Request("youtube",80));

        proxy.request();
    }
}