package TercerParcialClase.Visitor.example;

public class Graduacion implements IVisitor {
    @Override
    public double visit(Estudiante estudiante) {
        return 0;
    }

    @Override
    public double visit(Director director) {
        return 0;
    }
}
