package SegundoParcialClase.Ejercicio5.Memento1;



public class Memento {
	private Tesis state;

	public Memento(Tesis stateTosave) {
		this.state = stateTosave;
	}

	public Tesis getSavedState() {
		return state;
	}
}
