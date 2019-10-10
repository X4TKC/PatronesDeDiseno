package mediator.example;

public abstract class Vuelo {
    protected ITorre torre;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vuelo(ITorre mediator, String name){
        this.torre = mediator;
        this.name=name;
    }
    public abstract void send(String msg,String vuelo);
    public abstract void messageReceived ( String msg);
}
