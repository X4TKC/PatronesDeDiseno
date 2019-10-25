package TercerParcialClase.Bridge.exercise.withoutPattern;

public class Linux implements IPlataforma {
    @Override
    public void plataforma() {
        System.out.println("IPlataforma linux");
        process();
    }

    @Override
    public void process() {
        System.out.println("procesando");
    }


}
