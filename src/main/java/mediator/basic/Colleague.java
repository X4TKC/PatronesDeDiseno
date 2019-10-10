package mediator.basic;

public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }
    public abstract void send(String msg);
    public abstract void messageReceived ( String msg);
}
