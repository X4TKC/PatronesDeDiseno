package SegundoParcialClase.memento.basic;

public class ConcreteObject {
    private String name;
    private String state;

    public ConcreteObject(String name, String estate){
        this.name = name;
        this.state = estate;
    }

    public void show(){
        System.out.println("Current Values --> Name : "+name+" Estado: "+ state);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}