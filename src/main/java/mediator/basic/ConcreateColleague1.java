package mediator.basic;

public class ConcreateColleague1 extends Colleague {
    public ConcreateColleague1(Mediator mediator){
        super(mediator);
    }
    @Override
    public void send(String msg) {
       mediator.send(msg,this);
    }

    @Override
    public void messageReceived(String msg) {
        System.out.println("Colleague 1 recibe message: "+msg);
    }
}
