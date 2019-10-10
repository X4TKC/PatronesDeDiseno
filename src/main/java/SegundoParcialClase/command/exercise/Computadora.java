package SegundoParcialClase.command.exercise;

import java.util.Date;

public class Computadora {

    private String user="";
    private Date date;


    public void apagar(String user) {
        this.user=user;
        date=new Date();
        System.out.println("Accion apagar por usuario "+ user + " en la fecha " + date);

    }
    public void cerrarSesion(String user){
        this.user=user;
        date=new Date();
        System.out.println("Accion Cerrar Sesion por usuario "+ user + " en la fecha " + date);
    }
    public void reiniciar(String user){

        this.user=user;
        date=new Date();
        System.out.println("Accion Reiniciar por usuario "+ user + " en la fecha " + date);
    }
    public void suspender(String user){
        this.user=user;
        date=new Date();
        System.out.println("Accion Suspender por usuario "+ user + " en la fecha " + date);

    }
}
