package pe.edu.pupeu.soap.ws.entity;

public class Cliente {
	private String nombres;
	private String apellidos;
	private String nomprod;
	private int cantidad;
	private double precio;
	public Cliente() {
	}
	public Cliente(String nombres, String apellidos, String nomprod, int cantidad, double precio) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.nomprod = nomprod;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNomprod() {
		return nomprod;
	}
	public void setNomprod(String nomprod) {
		this.nomprod = nomprod;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
}