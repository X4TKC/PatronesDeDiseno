package Practica3.ejercicio2;

public class Boleto {
	private String nombrePelicula;
	private String cine;
	private String hora;
	private String funcion;
	private String categoria;
	private String recomendaciones;
	private String numeroDeAsiento;

	public Boleto() {
	}
	
	@Override
	public Object clone() {
		Boleto cloneObj = new Boleto();
		cloneObj.setNombrePelicula(this.nombrePelicula);
		cloneObj.setCine(this.cine);
		cloneObj.setHora(this.hora);
		cloneObj.setFuncion(this.funcion);
		cloneObj.setCategoria(this.categoria);
		cloneObj.setRecomendaciones(this.recomendaciones);
		cloneObj.setNumeroDeAsiento(this.numeroDeAsiento);
		return cloneObj;

	}

	public String getNombrePelicula() {
		return nombrePelicula;
	}

	public void setNombrePelicula(String nombrePelicula) {
		this.nombrePelicula = nombrePelicula;
	}

	public String getCine() {
		return cine;
	}

	public void setCine(String cine) {
		this.cine = cine;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getFuncion() {
		return funcion;
	}

	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getRecomendaciones() {
		return recomendaciones;
	}

	public void setRecomendaciones(String recomendaciones) {
		this.recomendaciones = recomendaciones;
	}

	public String getNumeroDeAsiento() {
		return numeroDeAsiento;
	}

	public void setNumeroDeAsiento(String numeroDeAsiento) {
		this.numeroDeAsiento = numeroDeAsiento;
	}

	

}
