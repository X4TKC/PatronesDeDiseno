package TercerParcialClase.Facade.exercise;

public class SolicitudDePrestamosVivienda {
    Abogados abogados;
    Arquitectos arquitectos;
    Bancos bancos;
    Cooperativas cooperativas;
    FondoFinanciero fondoFinanciero;
    Notarios notarios;
    public SolicitudDePrestamosVivienda(String disponibilidad, enumCooperativas cooperativas, enumBancos banco){
        this.abogados= new Abogados(disponibilidad);
        this.arquitectos = new Arquitectos(disponibilidad);
        this.bancos = new Bancos(banco);
        this.cooperativas= new Cooperativas(cooperativas);
        this.fondoFinanciero = new FondoFinanciero(disponibilidad);
        this.notarios= new Notarios(disponibilidad);
    }
    public void process(){
        abogados.doLegalStuff();
        arquitectos.doArquitectStuff();
        bancos.doBankStuff();
        cooperativas.doCooperativeStuff();
        fondoFinanciero.doFinancierStuff();
        notarios.doNotaryStuff();
    }
}
