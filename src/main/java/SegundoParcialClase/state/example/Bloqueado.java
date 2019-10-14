package SegundoParcialClase.state.example;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Bloqueado implements IState {

    private String password;
    private Timer timer;
    private static int count;
    private static int seconds=0;
    private final int MAX_SECONDS=15;
    private String intentoPassword;
    private boolean comprobante;
    private Date date;
    private static long startTime=-1;
    //private static long unlockTime=0;
    private static final int INTENTOS=3;




    public Bloqueado(String pass){
     //   timer=new Timer();
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
              //  unlockTime=0;
                count=0;
            }
        }
        //////////////////
        // verifica la contrasena
        if(password.equals(intentoPassword)&&count<INTENTOS){
            System.out.println("Celular desbloqueado");
            count=0;
            comprobante=true;
           // timer.cancel();

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
               // unlockTime = (startTime + 15000);
            }
            date= new Date();
            numSeconds = (int) ((date.getTime() - startTime) / 1000);
            segundosrestantes= MAX_SECONDS-numSeconds;
            if(segundosrestantes>=0) {
                System.out.println("Celular bloqueado espere " + segundosrestantes + " segundos");
            }
            else {
                startTime=-1;
              //  unlockTime=0;
                count=0;
            }
///////////////////////////////////////////////

            /**
            * con Timer
            */
//            System.out.println("Celular bloqueado espere "+ seconds + " segundos");
//            timer.schedule(new TimerTask() {
//                @Override
//                public void run() {
//
//                    if (seconds < MAX_SECONDS) {
//
//                        seconds++;
//                    } else {
//                        // stop the timer
//                        count=0;
//                        cancel();
//
//                    }
//                }
//            },0,1000);
            //////////////////////////////////
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
