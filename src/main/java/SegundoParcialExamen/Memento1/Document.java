package SegundoParcialExamen.Memento1;

public class Document implements IDocument {
    private String name;
    private int version;

    public Document(String name, int version){
        this.name=name;
        this.version=version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public void show(){
        System.out.println("Current Values --> Name : "+name+" Version: "+ version);
    }

    @Override
    public Object clone() {
        Document cloneObj = new Document(name,version);

        return cloneObj;
    }
}