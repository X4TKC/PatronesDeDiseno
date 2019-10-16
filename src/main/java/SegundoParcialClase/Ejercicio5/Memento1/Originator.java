package SegundoParcialClase.Ejercicio5.Memento1;

public class Originator {
    private Tesis state;

    public void crearBackup(Tesis state) {
        System.out.println("Originator: Setting state to " + state.getVersion());
        state.show();
        this.state = state;
    }

    public Memento createMemento() {
        System.out.println("Originator: Create Memento.");
        state.show();
        return new Memento(state);
    }

    public void restoreFromBD(Memento m) {
        state = m.getSavedState();
        System.out.println("Originator: State after restoring from Version: " + state.getVersion());
        state.show();
    }
}
