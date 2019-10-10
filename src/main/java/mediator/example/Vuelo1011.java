package mediator.example;

public class Vuelo1011 extends Vuelo {


    public Vuelo1011(ITorre torre, String name){
        super(torre,name);
    }

    @Override
    public void send(String msg, String vuelo) {
        System.out.println("Vuelo1011 send message: "+msg);
        torre.send(msg,this,vuelo);

    }

    @Override
    public void messageReceived(String msg) {
        System.out.println("Vuelo1011 recibe message: "+msg);
    }
}
