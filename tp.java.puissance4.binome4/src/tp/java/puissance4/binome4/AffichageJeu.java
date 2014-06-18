package tp.java.puissance4.binome4;

import javax.swing.JSplitPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import java.awt.event.ActionListener;

public class AffichageJeu implements Runnable {
	
	public static boolean tourFini;
	public static int numeroColonne;

	@Override
	public void run() {
		JFrame fenetre = new JFrame();

		fenetre.setTitle("Puissance 4");
		fenetre.setSize(800, 600);
		fenetre.setResizable(false);

		JSplitPane puissance4 = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		puissance4.setDividerSize(0);
		puissance4.setResizeWeight(1.0);

		JPanel grilleDeCases = new JPanel();
		grilleDeCases.setLayout(new GridLayout(6, 7));

		for (int numeroDeBouton = 0; numeroDeBouton < 42; numeroDeBouton++) {
			JLabel cases = new JLabel();
			cases.setFocusable(false);
			grilleDeCases.add(cases);
		}

		JPanel bouttons = new JPanel();
		bouttons.setLayout(new GridLayout(1, 7));

		for (int numeroBouton = 0; numeroBouton < 7; numeroBouton++) {
			BoutonPion boutton = new BoutonPion(numeroBouton);
			boutton.setFocusable(true);
			bouttons.add(boutton);
			boutton.addActionListener((ActionListener) this);
		}

		puissance4.setTopComponent(bouttons);
		puissance4.setBottomComponent(grilleDeCases);
		fenetre.getContentPane().add(puissance4);
		fenetre.setVisible(true);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public int obtenirColonne() {
		System.out.println("obtenir colonne");
		tourFini = false;
		while (!tourFini)
			;
		System.out.println("fin obtenir colonne");
		return numeroColonne;
	}

	public void actionPerformed(ActionEvent event) {
		System.out.println("click");
		BoutonPion bouton = (BoutonPion) event.getSource();
		numeroColonne = bouton.obtenirNumeroDeColonne();
		tourFini = true;
		System.out.println("fin click");
	}

}
