package TercerParcialClase.Bridge.exercise.withPattern;

public class Linux implements IPlataforma {
    private IArquitectura arquitectura;
    public Linux(IArquitectura arquitectura){
        this.arquitectura = arquitectura;
    }
    @Override
    public void plataforma() {
        System.out.println("IPlataforma Linux con Arquitectura" + arquitectura.getArquitectura());

    }
}
