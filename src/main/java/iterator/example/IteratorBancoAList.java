package iterator.example;

public class IteratorBancoAList implements Iterator {
    private int position;
    private Cliente[] clientes;
    public IteratorBancoAList(Cliente[] nombres){
        this.clientes=nombres;
    }
    @Override
    public Object next() {
        return clientes[position++];
    }

    @Override
    public boolean hasNext() {
        return clientes.length != 0 && position<clientes.length;
    }
}
