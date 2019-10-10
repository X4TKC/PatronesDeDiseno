package SegundoParcialClase.memento.exercise;

import java.util.Date;

public class SoftwareProyect implements ISoftwareProyect {
    private String message;
    private String code;
    private String author;
    private Date date;
    private int version;

    public SoftwareProyect(String message, String code, String author){
        this.message = message;
        this.code = code;
        this.author= author;
        this.date=new Date();
        this.version=1;
    }
    public SoftwareProyect(String message, String code, String author,int version){
        this.message = message;
        this.code = code;
        this.author= author;
        this.date=new Date();
        this.version=version+1;
    }

    public void show(){
        System.out.println("Current Values --> Message : "+message+" Code: "+ code+" Author: "+author+" Date: "+ date+" Version: commit"+ version);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public Object clone() {
        SoftwareProyect cloneObj = new SoftwareProyect(message,code,author,version);

        return cloneObj;
    }
}