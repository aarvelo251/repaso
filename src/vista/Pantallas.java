package vista;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Pantallas {
	
	public String IngresarValor (String titulo){
		
		JFrame frame = new JFrame();
	
		String ValorIngresado = JOptionPane.showInputDialog(frame,titulo,"");
		
		return ValorIngresado;
	}

	public void mostrarMensaje( String mensaje){
	
		JFrame frame = new JFrame();
		
		JOptionPane.showMessageDialog(frame, mensaje);
	}

}
