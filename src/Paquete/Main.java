package Paquete;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String nombre  = JOptionPane.showInputDialog("Ingrese nombre");
		if (nombre.equals("Algo")) {
			JOptionPane.showMessageDialog(null, "Hola ! ");
		}

	}

}
