package SegundoParcialClase.command.exercise;


import java.util.HashMap;

public class Invoker {
    private HashMap<String,IOperation> commandList = new HashMap();


    public void setCommand(IOperation command, String alias){commandList.put(alias,command);}

    public void runCommands(String user){

        for (String key:commandList.keySet()
                ) {
            commandList.get(key).execute(user);
        }


       // commandList.clear();
    }
    public void runCommand(String alias,String user){


        commandList.get(alias).execute(user);


    }
}
