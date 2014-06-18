package tp.java.puissance4.binome4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class BoutonPion extends JButton {

	private final int numeroDeColonne;
	private boolean estOccupee;

	public BoutonPion(int numeroDeColonne) {
		super("" + numeroDeColonne);
		this.numeroDeColonne = numeroDeColonne;
		this.estOccupee = false;
	}

	public int obtenirNumeroDeColonne() {
		return numeroDeColonne;
	}

	public boolean obtenirOccupation() {
		return this.estOccupee;
	}

}
