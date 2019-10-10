package mediator.roomchat;

public abstract class Persona {
    protected IChat chat;
    private String name;

    public String getName() {
        return name;
    }

    public Persona(String name, IChat chat){
        this.chat=chat;
        this.name=name;
    }
    public abstract void send(String msg,String destino);
    public abstract void messageReceived ( String msg);
}
