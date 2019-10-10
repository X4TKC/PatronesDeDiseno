package mediator.roomchat;

public class PersonSpecific extends Persona {
    public PersonSpecific(String name, IChat chat){
        super(name,chat);
    }
    @Override
    public void send(String msg, String destino) {
        System.out.println(this.getName()+" send message: "+msg);
        chat.send(msg,this,destino);

    }

    @Override
    public void messageReceived(String msg) {
            System.out.println(this.getName()+" has received this message "+msg);
    }
}
