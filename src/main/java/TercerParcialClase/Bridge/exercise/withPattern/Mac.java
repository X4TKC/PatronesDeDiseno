package TercerParcialClase.Bridge.exercise.withPattern;



public class Mac implements IPlataforma {
    private IArquitectura arquitectura;
    public Mac(IArquitectura arquitectura){
        this.arquitectura = arquitectura;
    }
    @Override
    public void plataforma() {
        System.out.println("IPlataforma Mac con arquitectura" + arquitectura.getArquitectura());
        arquitectura.process();
    }
}
