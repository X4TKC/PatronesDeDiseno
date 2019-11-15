package TercerParcialExamen.Composite;

abstract class Component {
    private String name;
    private String text;
    private int numWords;
    public Component(String text)    {
        this.text=text;
        this.name="Archivo";
        numWords=text.split("\\s+").length;
    }
    public Component(){}

    public void setName(String name) {
        this.name = name;
    }

    public void setText(String precio) {
        this.text = precio;
    }
    public void setNumWords(int numWords){this.numWords=numWords;}
    public int getNumWords(){
        return numWords;
    }
    public String getText(){
        return this.text;
    }
    public String getName(){return this.name;}
    public abstract void print();
    public abstract void add(Component component);
    public abstract void remove (Component component);
    public abstract void getChild(int position);
}