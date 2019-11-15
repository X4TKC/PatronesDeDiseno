package TercerParcialClase.Facade.exercise;

public class Cooperativas {
    private enumCooperativas cooperativas;
    public Cooperativas(enumCooperativas cooperativas){
        this.cooperativas=cooperativas;

    }
    public void doCooperativeStuff(){
        System.out.println("Doing Cooperative stuff "+this.cooperativas);
    }
}
