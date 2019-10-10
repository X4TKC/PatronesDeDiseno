package mediator.example;

public class Vuelo112 extends Vuelo {

    public Vuelo112(ITorre torre, String name){
        super(torre,name);
    }
    @Override
    public void send(String msg, String vuelo) {
        System.out.println("Vuelo112 send message: "+msg);
        torre.send(msg,this,vuelo);


    }

    @Override
    public void messageReceived(String msg) {
        System.out.println("Vuelo112 recibe message: "+msg);
    }
}
