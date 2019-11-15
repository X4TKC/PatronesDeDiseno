package TercerParcialClase.Proxy.basic;


public class Client {

    public static void main (String [] args){
        // create Proxy
        ISubject proxy = new Proxy("blocked");

        proxy.request();
    }
}