package SegundoParcialClase.memento.example;

public class Main {

	public static void main(String[] args) {
	CareTaker careTaker = new CareTaker();
	Originator originator  = new Originator(); //creador de mementos
	DataBase dataBase;
	DataBase b2;
	DataBase b3;
	DataBase b4;
	
	
	dataBase = new DataBase("BD","State1","Users");
	originator.crearBackup(dataBase);
	
	b2 = (DataBase) dataBase.clone();
	dataBase.setRegistro("State2");
	originator.crearBackup(b2);
	careTaker.addMemento("reg2", originator.createMemento());//creamos memento[0] --> State2
	
	b3 = (DataBase) dataBase.clone();
	dataBase.setRegistro("State3");
	originator.crearBackup(b3);
	careTaker.addMemento("reg3",originator.createMemento());//creamos memento[0] --> State3
	
	b4 = (DataBase) dataBase.clone();
	dataBase.setRegistro("State4");
	originator.crearBackup(b4);
	
	originator.restoreFromBD(careTaker.getMemento("reg3"));

	}

}
