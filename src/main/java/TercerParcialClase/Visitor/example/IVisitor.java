package TercerParcialClase.Visitor.example;

public interface IVisitor {
     double visit(Estudiante estudiante);
     double visit(Director director);

}