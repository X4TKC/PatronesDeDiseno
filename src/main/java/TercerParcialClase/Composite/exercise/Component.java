package TercerParcialClase.Composite.exercise;

abstract class Component {
    private String name;
    private int estimacion;
    public Component(int estimacion, String name)    {
        this.estimacion=estimacion;
        this.name=name;
       // System.out.println("Constructor " +this.estimacion+" "+ this.name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEstimacion(int estimacion) {
        this.estimacion = estimacion;
    }

    public int getEstimacion(){
        return this.estimacion;
    }
    public String getName(){return this.name;}
    public abstract void print();
    public abstract void add(Component component);
    public abstract void remove (Component component);
    public abstract void getChild(int position);
}