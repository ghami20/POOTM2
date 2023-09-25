package Paquete;

import javax.swing.JOptionPane;

public class Cuenta {
	
	private String nombre;
	private double saldo;
	private String transacciones;
	private int nroTransacion=0;
	public Cuenta(String nombre, double saldo) {
		super();
		this.nombre = nombre;
		this.saldo = saldo;
		this.transacciones = "Transacciones:";
	}

	@Override
	public String toString() {
		return "Cuenta [nombre=" + nombre + ", saldo=" + saldo + ", transacciones=" + transacciones + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTransacciones() {
		return transacciones;
	}

	public void setTransacciones(String transacciones) {
		this.transacciones = transacciones;
	}
	
	public int getNroTransacion() {
		return nroTransacion;
	}

	public void setNroTransacion(int nroTransacion) {
		this.nroTransacion = nroTransacion;
	}

	public void RealizarDeposito(double deposita , Cajero cajero) {
		
		this.setSaldo(this.getSaldo()+ deposita);
		
		this.setNroTransacion(this.getNroTransacion()+1);
		
		this.setTransacciones(this.getTransacciones()+
				"\n Nuevo deposito, operacion nro:"
				+ this.nroTransacion 
				+" El monto fue"+ deposita);
		
		cajero.setSaldo(cajero.getSaldo()+ deposita);
		
		
	}
	
	public void RealizarRetiro(double retiro ,  Cajero cajero) {
		if (this.getSaldo()>=retiro && cajero.getSaldo()>retiro) {
			
			this.setSaldo(this.getSaldo()- retiro);
		
		this.setNroTransacion(this.getNroTransacion()+1);
		
		this.setTransacciones(this.getTransacciones()+
				"\n Nuevo retiro, operacion nro:"
				+ this.nroTransacion 
				+" El monto fue"+ retiro);
		cajero.setSaldo(cajero.getSaldo() - retiro);
		}else {
			JOptionPane.showMessageDialog(null, "No se pudo retirar");
		}
		
	}
	

}
