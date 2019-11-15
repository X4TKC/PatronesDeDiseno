package TercerParcialClase.Facade.exercise;

public class Client2 {
    public static void main(String[] args){
        String disponibilidad="disponibilidad";
        Abogados abogados= new Abogados(disponibilidad);
        Arquitectos arquitectos = new Arquitectos(disponibilidad);
        Bancos bancos = new Bancos(enumBancos.BancoSol);
        Cooperativas cooperativas= new Cooperativas(enumCooperativas.Cop2);
        FondoFinanciero fondoFinanciero = new FondoFinanciero(disponibilidad);
        Notarios notarios= new Notarios(disponibilidad);

        abogados.doLegalStuff();
        arquitectos.doArquitectStuff();
        bancos.doBankStuff();
        cooperativas.doCooperativeStuff();
        fondoFinanciero.doFinancierStuff();
        notarios.doNotaryStuff();

    }
}
