package Paquete;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
	
		Cuenta personal = new Cuenta("Gamaliel",200);
		Cuenta Exterior = new Cuenta("Gamaliel",20);
		
		Cajero BancoProvincia = new Cajero("Avenida corrientes 2037",200);
		Exterior.RealizarRetiro(100);
		Exterior.RealizarDeposito(10 , BancoProvincia);
		Exterior.RealizarDeposito(30 , BancoProvincia);
		Exterior.RealizarRetiro(50);
		Exterior.RealizarDeposito(30 , BancoProvincia);
		JOptionPane.showMessageDialog(null, BancoProvincia);
	}

}
