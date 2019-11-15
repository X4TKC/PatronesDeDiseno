package TercerParcialClase.Facade.exercise;

public class Bancos {
    private enumBancos banco;
    public Bancos(enumBancos banco){
        this.banco=banco;

    }
    public void doBankStuff(){
        System.out.println("Doing bank stuff "+this.banco);
    }
}
