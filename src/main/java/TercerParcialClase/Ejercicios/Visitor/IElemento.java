package TercerParcialClase.Ejercicios.Visitor;

import java.util.Date;

public interface IElemento {
    public Date accept(IVisitor visitor);
    public void enfermedad1();
    public void enfermedad2();


}