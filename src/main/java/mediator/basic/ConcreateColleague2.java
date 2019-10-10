package mediator.basic;

public class ConcreateColleague2 extends Colleague {
    public ConcreateColleague2(Mediator mediator){
        super(mediator);
    }
    @Override
    public void send(String msg) {
        mediator.send(msg,this);
    }

    @Override
    public void messageReceived(String msg) {
        System.out.println("Colleague 2 recibe message: "+msg);
    }
}
