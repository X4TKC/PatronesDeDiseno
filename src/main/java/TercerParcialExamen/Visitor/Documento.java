package TercerParcialExamen.Visitor;

public class Documento {
    private String text;
    private String name;
    private String formato;
    private int numChar;
    public Documento (String text, String name){
        this.text=text;
        this.name=name;
    }

    public int getNumChar() {
        return numChar;
    }

    public void setNumChar(int numChar) {
        this.numChar = numChar;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

}
