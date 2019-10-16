package SegundoParcialClase.state.example;

import java.util.Date;


public class Bloqueado implements IState {

    private String password;
    private static int count;
    private final int MAX_SECONDS=15;
    private String intentoPassword;
    private boolean comprobante;
    private Date date;
    private static long startTime=-1;
    private static final int INTENTOS=3;




    public Bloqueado(String pass){
        password="tovilas";
        count=0;
        intentoPassword=pass;
        comprobante=false;
        date=new Date();


    }
    public boolean isComprobante() {
        return comprobante;
    }

    public void setComprobante(boolean comprobante) {
        this.comprobante = comprobante;
    }

    @Override
    public void handle() {
        int numSeconds;
        int segundosrestantes;
        // Comprueba si ya paso el tiempo para poder volver a ingresar la contrasena
        // esta parte es tambien del date
        if (count>=INTENTOS&&startTime!=-1){
            date= new Date();
            numSeconds = (int) ((date.getTime() - startTime) / 1000);
            segundosrestantes= MAX_SECONDS-numSeconds;
            if(segundosrestantes<=0){
                startTime=-1;
                count=0;
            }
        }
        // verifica la contrasena
        if(password.equals(intentoPassword)&&count<INTENTOS){
            System.out.println("Celular desbloqueado");
            count=0;
            comprobante=true;


        }
        // si falla la contrasena incrementa el count que es el que lleva la cuenta de intentos fallidos
        else if (count<INTENTOS){
            comprobante=false;
            count++;
            System.out.println("password incorrecta " +count);
        }
        // si los intentos exceden el limite se inicia el contador
        else{
            comprobante=false;
        /**
        * con Date
        * startTime tiene un valor dumb -1 que indica que aun no fue inicializado
        */
            if(startTime==-1) {
                date= new Date();
                startTime = date.getTime();

            }
            date= new Date();
            numSeconds = (int) ((date.getTime() - startTime) / 1000);
            segundosrestantes= MAX_SECONDS-numSeconds;
            System.out.println("Celular bloqueado espere " + segundosrestantes + " segundos");

        }
    }

    public String getIntentoPassword() {
        return intentoPassword;
    }

    public void setIntentoPassword(String intentoPassword) {
        this.intentoPassword = intentoPassword;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
