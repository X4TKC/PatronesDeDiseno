package SegundoParcialClase.memento.example;


public class DataBase implements IDataBase {
	private String name;
	private String table;
	private String registro;

	public DataBase(String name, String state, String table) {
		this.name = name;
		this.table = table;
		this.registro = state;
	}

	public void show() {
		System.out.println("Current values --> Name: " + name + " Estado: " + registro);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return registro;
	}

	public void setState(String state) {
		this.registro = state;
	}
	
	
	
	public String getTable() {
		return table;
	}

	public void setTable(String table) {
		this.table = table;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	@Override
	public Object clone() {
		DataBase cloneObj = new DataBase(name,registro,table);

		return cloneObj;
	}
}