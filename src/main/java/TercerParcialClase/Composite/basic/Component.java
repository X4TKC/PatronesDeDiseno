package TercerParcialClase.Composite.basic;

abstract class Component {
    private String attribute;
    public Component(String attribute)    {
        this.attribute=attribute;
        System.out.println("Constructor " +attribute);
    }
    public String getAttribute(){
        return this.attribute;
    }
    public abstract void operation();
    public abstract void add(Component component);
    public abstract void remove (Component component);
    public abstract void getChild(int position);
}