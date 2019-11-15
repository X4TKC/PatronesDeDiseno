package TercerParcialExamen.Visitor;

public class Sublime implements IElemento {
    private Documento doc;

    @Override
    public void crear(String text, String name) {
        doc=new Documento(text,name);
    }

    @Override
    public void editar(String newtext) {
        this.doc.setText(newtext);


    }

    @Override
    public void eliminar() {
        doc=null;
    }

    @Override
    public Documento getDocumento() {
        return doc;
    }

    @Override
    public void addPlugin(IVisitor plugin) {
        plugin.save(this);
    }



}
