package mediator.basic;

public class Client {
    public static void main (String[] args){
        ConcreateMediator mediator = new ConcreateMediator();

        ConcreateColleague1 colleague1 = new ConcreateColleague1(mediator);
        ConcreateColleague2 colleague2 = new ConcreateColleague2(mediator);

        mediator.setColleage1(colleague1);
        mediator.setColleage2(colleague2);

        colleague1.send("mensaje 1 - pregunta");
        colleague2.send("mensaje 2 - respuesta");
    }
}
