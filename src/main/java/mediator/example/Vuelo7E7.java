package mediator.example;

public class Vuelo7E7 extends Vuelo {

    public Vuelo7E7(ITorre torre, String name){
        super(torre,name);
    }
    @Override
    public void send(String msg, String vuelo) {
        System.out.println("Vuelo7E7 send message: "+msg);
        torre.send(msg,this,vuelo);

    }

    @Override
    public void messageReceived(String msg) {
        System.out.println("Vuelo7E7 recibe message: "+msg);
    }
}
