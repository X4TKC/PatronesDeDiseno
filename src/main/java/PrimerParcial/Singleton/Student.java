package PrimerParcial.Singleton;

import java.util.Date;

public class Student {
    private String nombre;
    private Date date;
    private int amount;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }





    public Student(String nombre){
        this.nombre= nombre;
    }

    public void payTuition(int amount){
        date= new Date();
        this.amount=amount;

        Account.getInstance().payTuition(this);
    }
}
