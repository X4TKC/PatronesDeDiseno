package iterator.example;



public class BancoAList implements IList{
    private Cliente[] clientes;

    private int position;

    public BancoAList(){
        position=0;
        clientes= new Cliente[4];
    }
    public void add(Cliente value){
        clientes[position]=value;
        position++;
    }

    @Override
    public IteratorBancoAList iterator() {
        return new IteratorBancoAList(this.clientes);
    }
}
