package SegundoParcialClase.command.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Invoker {
    private HashMap<String,ICommand> commandList = new HashMap();


    public void setCommand(ICommand command, String alias){commandList.put(alias,command);}

    public void runCommands(){

        for (String key:commandList.keySet()
             ) {
            commandList.get(key).execute();
        }


        commandList.clear();
    }
    public void runCommand(String alias){


        commandList.get(alias).execute();


    }
}
