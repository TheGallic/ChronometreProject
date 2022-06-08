package com.cronometreproject.main;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.EmptyBorder;

public class Chronometre extends JFrame {

	private JPanel contentPane = new JPanel();
	private JProgressBar pbSecondes = new JProgressBar();
	private JProgressBar pbMinutes = new JProgressBar();
	private JButton btnChrono = new JButton("Lancer le chronometre");
	private JButton btnStopChrono = new JButton("Arreter le chronometre");
	private int countSecondes = 0;
	private boolean stopChrono = false;
	private boolean reinitChrono = false;
	private JProgressBar pbHeures = new JProgressBar();
	private JButton btnReinitialiser = new JButton("Réinitialiser le chronometre");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chronometre frame = new Chronometre();
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Chronometre() {
		setTitle("Chronomètre");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setResizable(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		// On prepare les progressBar
		pbHeures.setForeground(new Color(255, 0, 0));
		pbHeures.setFont(new Font("Tahoma", Font.PLAIN, 14));
		pbHeures.setStringPainted(true);
		pbHeures.setBounds(5, 105, 419, 36);

		pbMinutes.setBounds(5, 58, 419, 36);
		pbMinutes.setForeground(Color.BLUE);
		pbMinutes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		pbMinutes.setStringPainted(true);
		pbMinutes.setValue(0);
		pbMinutes.setMaximum(60);

		pbSecondes.setBounds(5, 11, 419, 36);
		pbSecondes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		pbSecondes.setForeground(Color.BLACK);
		pbSecondes.setMaximum(60);
		pbSecondes.setValue(0);
		pbSecondes.setStringPainted(true);
		// on prepare les boutons
		btnStopChrono.setBounds(106, 186, 201, 23);
		btnStopChrono.setEnabled(false);
		btnReinitialiser.setBounds(106, 220, 201, 23);
		btnReinitialiser.setEnabled(false);
		btnChrono.setBounds(106, 152, 201, 23);

		// On ajoute le tout au content panel
		contentPane.add(pbSecondes);
		contentPane.add(pbMinutes);
		contentPane.add(pbHeures);
		contentPane.add(btnStopChrono);
		contentPane.add(btnChrono);
		contentPane.add(btnReinitialiser);
		// le bouton reinitialiseer change la valeur de la variable reinitChrono
		btnReinitialiser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reinitChrono = true;
			}
		});
		// le bouton stopChrono change la valeur de la variable stopChrono
		btnStopChrono.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stopChrono = true;
			}
		});
		// le bouton chrono lance la methode mon chronometre
		btnChrono.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				monChronometre();
			}
		});
	}

	public void monChronometre() {
		// on creer un thread pour rafraichir les elements
		new Thread(new Runnable() {
			public void run() {

				int countMinutes = 0;
				int countHours = 0;
				// on active ou desactive les boutons
				btnStopChrono.setEnabled(true);
				btnChrono.setEnabled(false);
				btnReinitialiser.setEnabled(true);
				// on creer la boucle de traitement d'une seconde
				while (countSecondes <= 60) {
					// on met a jour les valeurs
					// on affiche les informations sur les progressBar
					pbSecondes.setValue(countSecondes);
					pbSecondes.setString("Temps écoulé en secondes :" + countSecondes);

					pbMinutes.setValue(countMinutes);
					pbMinutes.setString("Temps écoulé en minutes :" + countMinutes);

					pbHeures.setValue(countHours);
					pbHeures.setString("Temps écoulé en heures :" + countHours);

					try {
						// on fait une pause d'une seconde
						Thread.sleep(1000);
						// on teste la valeur de stop chrono
						// la valeur change si on click sur le bouton btnStopChrono
						if (stopChrono == true) {
							btnStopChrono.setEnabled(false);
							btnChrono.setEnabled(true);
							btnChrono.setText("Relancer le chronometre");
							stopChrono = false;
							break;
						}
						// on teste la valeur de reinitChrono
						// la valeur change lorsque on click sur le bouton btnReinitChrono
						if (reinitChrono == true) {
							btnStopChrono.setEnabled(true);
							btnChrono.setEnabled(false);
							btnReinitialiser.setEnabled(true);
							reinitChrono = false;
							countSecondes = 0;
							countMinutes = 0;
							countHours = 0;
						}
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
					// on verifie si on a 60 secondes et si c'est le cas on ajoute 1 minute
					if (countSecondes == 60) {
						countSecondes = 0;
						countMinutes++;
					}
					// on verifie si on a 60 minutes et si c'est le cas on ajoute 1 heure
					if (countMinutes == 60) {
						countMinutes = 0;
						countHours++;
					}
					// on verifie si on a 24 heures et 60 minutes et 60 secondes
					// et si c'est le cas on reinitialise le chronometre
					if (countHours == 24 && countMinutes == 60 && countSecondes == 60) {
						countSecondes = 0;
						countMinutes = 0;
						countHours = 0;
					}
					// on ajoute 1 seconde
					countSecondes++;
				}
			}
			// on lance le thread
		}).start();

	}
}
