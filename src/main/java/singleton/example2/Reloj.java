package singleton.example2;
import java.util.Date;
public class Reloj {

    private static Reloj instance=null;
    private String lugar = " TIME ";
    private Date date;

    public Reloj(){
        date = new Date();
    }
    public static Reloj getInstance(){
        if (instance==null){
            instance = new Reloj();

        }
        return instance;
    }

    public String getTime(){
        return  lugar +" : "+date.toString();
    }
}
