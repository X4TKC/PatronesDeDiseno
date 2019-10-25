package TercerParcialClase.Adapter.example;

public class AdapterDocente implements IPersona{
    private Docente docente=new Docente();
    private int edad;

    public AdapterDocente(Docente docente){
        this.docente=docente;
    }

    @Override
    public int getEdad() {
        edad=this.docente.calcularEdad();
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        edad=docente.calcularEdad();
    }
}
