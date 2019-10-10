package SegundoParcialClase.command.example;

public class CommandConcrete2 implements ICommand {
    private Receiver receiver;


    public CommandConcrete2(Receiver receiver){
        this.receiver=receiver;
    }
    @Override
    public void execute(){
        receiver.operation2();
    }

}
