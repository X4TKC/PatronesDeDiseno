package TercerParcialClase.Bridge.exercise.withoutPattern;

public class Windows implements IPlataforma {
    @Override
    public void plataforma() {
        System.out.println("IPlataforma windows");
        process();
    }

    @Override
    public void process() {
        System.out.println("procesando");
    }

}
