package TercerParcialClase.Bridge.exercise.withPattern;

public class Windows implements IPlataforma {
    private IArquitectura arquitectura;
    public Windows(IArquitectura arquitectura){
        this.arquitectura = arquitectura;
    }
    @Override
    public void plataforma() {
        System.out.println("IPlataforma windows con arquitectura" + arquitectura.getArquitectura());
        arquitectura.process();
    }
}
