package TercerParcialClase.Composite.example;

abstract class Component {
    private String name;
    public Component(String name)    {
        this.name=name;
        System.out.println("Constructor " +this.name);
    }
    public String getAttribute(){
        return this.name;
    }
    public abstract void print();
    public abstract void add(Component component);
    public abstract void remove (Component component);
    public abstract void getChild(int position);
}