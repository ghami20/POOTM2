package Paquete;

public class Cajero {

	private String direccion;
	private double saldo;
	public Cajero(String direccion, double saldo) {
		super();
		this.direccion = direccion;
		this.saldo = saldo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Cajero [direccion=" + direccion + ", saldo=" + saldo + "]";
	}
	
	
	
}
