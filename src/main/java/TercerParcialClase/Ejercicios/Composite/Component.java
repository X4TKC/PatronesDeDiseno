package TercerParcialClase.Ejercicios.Composite;

abstract class Component {
    private String name;
    private int precio;
    public Component(int precio)    {
        this.precio=precio;
        this.name="Archivo";
    }
    public Component(){
        this.precio=0;
        this.name="Archivo";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPrecio(){
        return this.precio;
    }
    public String getName(){return this.name;}
    public abstract void print();
    public abstract void add(Component component);
    public abstract void remove (Component component);
    public abstract void getChild(int position);
}