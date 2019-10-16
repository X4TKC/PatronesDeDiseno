package SegundoParcialClase.memento.example;

import java.util.HashMap;

public class CareTaker {
	private HashMap<String,Memento> savedStates = new HashMap<>();

	public void addMemento(String key,Memento m) {
		savedStates.put(key, m);
	}

	public Memento getMemento(String key) {
		return savedStates.get(key);
	}
}
