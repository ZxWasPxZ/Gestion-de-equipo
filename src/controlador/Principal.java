package controlador;

import java.awt.EventQueue;

import vista.VentPrincipal;

public class Principal {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentPrincipal frame = new VentPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
