package SegundoParcialClase.memento.example;

public class Originator {
	private DataBase state;

	public void crearBackup(DataBase state) {
		System.out.println("Originator: Setting state to " + state.getState());
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
		System.out.println("Originator: State after restoring from Memento: " + state.getState());
		state.show();
	}
}
