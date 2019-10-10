package SegundoParcialClase.command.basic;

public class CommandConcrete1 implements ICommand {
    private Receiver receiver;


    public CommandConcrete1 (Receiver receiver){
        this.receiver=receiver;
    }
    @Override
    public void execute(){
        receiver.operation1();
    }

}
