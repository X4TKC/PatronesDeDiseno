package TercerParcialClase.Visitor.example;

public class Matriculacion implements IVisitor {

    @Override
    public double visit(Estudiante estudiante) {
        estudiante.setDescuento(90);
        return   estudiante.getDescuento();
    }

    @Override
    public double visit(Director director) {
        director.setDescuento(0);
        return director.getDescuento();
    }
}