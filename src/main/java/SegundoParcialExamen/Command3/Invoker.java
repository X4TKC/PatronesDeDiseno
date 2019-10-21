package SegundoParcialExamen.Command3;
import java.util.ArrayList;



public class Invoker {
    private ArrayList<IAccion> commandList = new ArrayList();

    public Invoker() {
    }

    public void setCommand(IAccion command) {
        this.commandList.add(command);
    }

    public void runCommands() {


        for (int i = 0; i <commandList.size() ; i++) {
            commandList.get(i).execute();
        }


    }

}
