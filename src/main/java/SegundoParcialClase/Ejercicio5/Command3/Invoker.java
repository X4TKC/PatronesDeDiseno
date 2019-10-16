package SegundoParcialClase.Ejercicio5.Command3;


import java.util.HashMap;

public class Invoker {
    private HashMap<String,IOperation> commandList = new HashMap();


    public void setCommand(IOperation command, String alias){commandList.put(alias,command);}

    public void runCommands(){

        for (String key:commandList.keySet()
                ) {
            commandList.get(key).execute();
        }


       // commandList.clear();
    }
    public void runCommand(String alias){


        commandList.get(alias).execute();


    }
}
