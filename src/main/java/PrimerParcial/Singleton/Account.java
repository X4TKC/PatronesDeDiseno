package PrimerParcial.Singleton;

import java.util.ArrayList;
import java.util.Date;

public class Account {

    private ArrayList<Student> tuition=new ArrayList<>();
    public ArrayList<Student> getTuition() {
        return tuition;
    }

    public void setTuition(ArrayList<Student> tuition) {
        this.tuition = tuition;
    }

    private static Account instance=null;

    public Account(){

    }
    public static synchronized Account getInstance(){
        if (instance==null){
            instance = new Account();

        }
        return instance;
    }
    public void payTuition(Student student){
        tuition.add(student);
    }
}
