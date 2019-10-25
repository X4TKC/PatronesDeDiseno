package TercerParcialClase.Adapter.example;

public class AdapterSeguridad implements IPersona {
    private Seguridad seguridad;

    private int edad;

    public AdapterSeguridad(Seguridad seguridad){
        this.seguridad=seguridad;
    }
    @Override
    public int getEdad() {
        edad=seguridad.calcularEdad();
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        edad=seguridad.calcularEdad();
    }
}
