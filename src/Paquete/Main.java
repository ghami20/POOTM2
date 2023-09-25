package Paquete;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
	
		Cuenta personal = new Cuenta("Gamaliel",200);
		Cuenta Exterior = new Cuenta("Gamaliel",2000);
		
		Cajero BancoProvincia = new Cajero("Avenida corrientes 2037",200);
		String []Opciones = {
				"Retiro","Deposito","Ver cuenta","Salir"
		};
		
		int monto=0;
		int opcion=0;
		do {
			
			opcion= JOptionPane.showOptionDialog(null, "Bienveido al cajero:", null, 0, 0, null, Opciones, Opciones[0]);
		
			switch (opcion) {
			case 0:
				monto = Integer.parseInt(JOptionPane.showInputDialog( "Ingrese monto a reitrar"));
				Exterior.RealizarRetiro(monto, BancoProvincia);
				break;
			case 1:
				monto = Integer.parseInt(JOptionPane.showInputDialog( "Ingrese monto a depositar"));
				Exterior.RealizarDeposito(monto, BancoProvincia);
				break;
			case 2:
				JOptionPane.showMessageDialog(null, Exterior);
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Salir");
				break;
			default:
				break;
			}
		
		} while (opcion!=3);
	}

}
