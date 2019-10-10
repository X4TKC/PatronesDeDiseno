package SegundoParcialClase.command.basic;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<ICommand> commandList = new ArrayList<>();


    public void setCommand(ICommand command){commandList.add(command);}

    public void runCommands(){
        for (ICommand command:commandList
             ) {
            command.execute();
        }
        commandList.clear();
    }
}
