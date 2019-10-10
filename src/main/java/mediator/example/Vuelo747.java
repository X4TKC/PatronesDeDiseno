package mediator.example;

public class Vuelo747 extends Vuelo {

    public Vuelo747(ITorre torre, String name){
        super(torre, name);
    }
    @Override
    public void send(String msg, String vuelo) {
        System.out.println("Vuelo747 send message: "+msg);
        torre.send(msg,this,vuelo);


    }

    @Override
    public void messageReceived(String msg) {
        System.out.println("Vuelo747 recibe message: "+msg);
    }
}
