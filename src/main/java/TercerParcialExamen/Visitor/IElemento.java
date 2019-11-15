package TercerParcialExamen.Visitor;



public interface IElemento {
     void crear(String text, String name);

     void editar(String newtext);
     void eliminar();
     Documento getDocumento();
     void addPlugin(IVisitor visitor);


}