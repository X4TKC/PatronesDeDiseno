package TercerParcialClase.Visitor.example;

public class PagarMatricula implements IVisitor {
    @Override
    public double visit(Estudiante estudiante) {
        return descuento(estudiante.getDinero());
    }

    @Override
    public double visit(Director director) {
        return descuento(director.getDinero());
    }

    public double descuento(double cantidad){
        return cantidad-(cantidad*0.13);
    }
}
