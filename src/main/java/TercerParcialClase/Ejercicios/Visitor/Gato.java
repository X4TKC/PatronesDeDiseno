package TercerParcialClase.Ejercicios.Visitor;

import java.util.Date;

public class Gato implements IElemento {
    private enumEnfermedad enfermedad;
    public enumEnfermedad getEnfermedad() {
        return enfermedad;
    }



    @Override
    public Date accept(IVisitor visitor) {
        return visitor.curar(this);
    }

    @Override
    public void enfermedad1() {
        enfermedad= enumEnfermedad.enfermedad1;
    }

    @Override
    public void enfermedad2() {
        enfermedad= enumEnfermedad.enfermedad2;
    }


}