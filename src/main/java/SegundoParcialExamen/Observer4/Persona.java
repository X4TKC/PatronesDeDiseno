package SegundoParcialExamen.Observer4;

import java.util.ArrayList;

public class Persona implements IObserver {
    private ArrayList<enumCategoria> preferencia;
    private String name;

    public Persona(ArrayList<enumCategoria> preferencia, String name){
        this.preferencia=preferencia;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<enumCategoria> getPreferencia() {
        return preferencia;
    }

    public void setPreferencia(ArrayList<enumCategoria> preferencia) {
        this.preferencia = preferencia;
    }

    @Override
    public ArrayList<enumCategoria> getKey() {
        return preferencia;
    }

    @Override
    public void update(String msg) {
//    	if(getPreferencia() == preferencia.contains(enumCategoria.Ninguna)) {
//    		System.out.println("Person " + name + " choose not to see any notification");
//    	} else {
    		System.out.println("Person " + name + " recieve a notification for the preference " + msg );
    	//}
    }
}
