package SegundoParcialClase.memento.example;

public class Memento {
	private DataBase state;

	public Memento(DataBase stateTosave) {
		this.state = stateTosave;
	}

	public DataBase getSavedState() {
		return state;
	}
}
