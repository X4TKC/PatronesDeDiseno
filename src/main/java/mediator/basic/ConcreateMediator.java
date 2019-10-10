package mediator.basic;

public class ConcreateMediator implements Mediator {
    private ConcreateColleague1 user1;
    private ConcreateColleague2 user2;

    public void setColleage1(ConcreateColleague1 colleage1){
        user1=colleage1;
    }
    public void setColleage2(ConcreateColleague2 colleage2){
        user2=colleage2;
    }
    @Override
    public void send(String msg, Colleague colleague) {
        if (colleague == user1){
            user2.messageReceived(msg);
        }else{
            user1.messageReceived(msg);
        }
    }
}
