package TercerParcialClase.Bridge.exercise.withPattern;

public class ArquitecturaX64 implements IArquitectura {
    private String name="x64";
    @Override
    public String getArquitectura() {
        return name;
    }
    @Override
    public void process(){
        System.out.println("Procesando con x64");
    }
}
