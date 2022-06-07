package com.hangmanproject;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

public class HangMan extends JFrame {
	private JPanel panel = new JPanel();
	private boolean btnIsActive = true;// Suivant le mode difficulté, on active ou pas les lettres deja cliquer
	private int nbrFault = 0;// Compte le nombres de fautes, 6 maximum
	private String selectedWord = "";
	private String selectedDifficult = "";
	private JLabel lblNewImage = new JLabel("No Image");
	private JLabel lblNouveauMot = new JLabel("HangMan");
	private JLabel llblResultat = new JLabel("Commencez une partie");
	private JLabel lblFault = new JLabel("Vous avez fait 0 faute");
	private JComboBox cbxDifficult = new JComboBox();
	private JButton btnStartGame = new JButton("Commencer la partie");
	// Tableau de 19 mots suivant la difficulté
	// mots de 3 lettres
	String[] debutant = { "Ado", "Bis", "Cor", "Fac", "Fla", "Gaz", "Git", "Glu", "Gos", "Goy", "Hip", "Hop", "Jet",
			"Kru", "Mai", "Ski", "Sot", "Ton", "Tic" };
	// mots de 4 lettres
	String[] intermediaire = { "Ardu", "Atre", "Bits", "Buna", "Case", "Cire", "Clip", "Corse", "Dock", "Fado", "Four",
			"Gang", "Kaki", "Regs", "Rhum", "Taie", "Taux", "Thym", "Topa" };
	// mots de 5 letttres
	String[] avancer = { "Ancre", "Alfas", "Banjo", "Escot", "Guipa", "Honni", "Houez", "Igloo", "Iodas", "Moult",
			"Mucha", "Muscs", "Nicol", "Seaux", "Seuil", "Smalt", "Toqua", "Tyran", "Volve" };
	// mots de 6 lettres
	String[] expert = { "Acajou", "Azimut", "Burine", "Caiman", "Cornes", "Faucon", "Gospel", "Guenon", "Hormis",
			"Menthe", "Notais", "Nouais", "Pagine", "Pontil", "Sabord", "Seisme", "Whisky", "Yankee", "Zipper" };

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HangMan frame = new HangMan();
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
	public HangMan() {

		setTitle("Jeu du pendu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 638, 448);
		setResizable(false);
		getContentPane().setLayout(null);
		panel.setBounds(0, 0, 622, 409);

		getContentPane().add(panel);

		JButton btnA = new JButton("A");
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selectedWord != "") {
					addChar('A');
					// On recupere la dificulté
					if (cbxDifficult.getSelectedItem() == "Débutant"
							|| cbxDifficult.getSelectedItem() == "Intermediaire") {
						btnA.setEnabled(false);
					}
				}
			}
		});

		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selectedWord != "") {
					addChar('B');
					// On recupere la dificulté
					if (cbxDifficult.getSelectedItem() == "Débutant"
							|| cbxDifficult.getSelectedItem() == "Intermediaire") {
						btnB.setEnabled(false);
					}
				}
			}
		});

		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selectedWord != "") {
					addChar('C');
					// On recupere la dificulté
					if (cbxDifficult.getSelectedItem() == "Débutant"
							|| cbxDifficult.getSelectedItem() == "Intermediaire") {
						btnC.setEnabled(false);
					}
				}
			}
		});

		JButton btnD = new JButton("D");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selectedWord != "") {
					addChar('D');
					// On recupere la dificulté
					if (cbxDifficult.getSelectedItem() == "Débutant"
							|| cbxDifficult.getSelectedItem() == "Intermediaire") {
						btnD.setEnabled(false);
					}
				}
			}
		});

		JButton btnE = new JButton("E");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selectedWord != "") {
					addChar('E');
					// On recupere la dificulté
					if (cbxDifficult.getSelectedItem() == "Débutant"
							|| cbxDifficult.getSelectedItem() == "Intermediaire") {
						btnE.setEnabled(false);
					}
				}
			}
		});

		JButton btnF = new JButton("F");
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selectedWord != "") {
					addChar('F');
					// On recupere la dificulté
					if (cbxDifficult.getSelectedItem() == "Débutant"
							|| cbxDifficult.getSelectedItem() == "Intermediaire") {
						btnF.setEnabled(false);
					}
				}
			}
		});

		JButton btnG = new JButton("G");
		btnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selectedWord != "") {
					addChar('G');
					// On recupere la dificulté
					if (cbxDifficult.getSelectedItem() == "Débutant"
							|| cbxDifficult.getSelectedItem() == "Intermediaire") {
						btnG.setEnabled(false);
					}
				}
			}
		});

		JButton btnH = new JButton("H");
		btnH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selectedWord != "") {
					addChar('H');
					// On recupere la dificulté
					if (cbxDifficult.getSelectedItem() == "Débutant"
							|| cbxDifficult.getSelectedItem() == "Intermediaire") {
						btnH.setEnabled(false);
					}
				}
			}
		});

		JButton btnI = new JButton("I");
		btnI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selectedWord != "") {
					addChar('I');
					// On recupere la dificulté
					if (cbxDifficult.getSelectedItem() == "Débutant"
							|| cbxDifficult.getSelectedItem() == "Intermediaire") {
						btnI.setEnabled(false);
					}
				}
			}
		});

		JButton btnJ = new JButton("J");
		btnJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selectedWord != "") {
					addChar('J');
					// On recupere la dificulté
					if (cbxDifficult.getSelectedItem() == "Débutant"
							|| cbxDifficult.getSelectedItem() == "Intermediaire") {
						btnJ.setEnabled(false);
					}
				}
			}
		});

		JButton btnK = new JButton("K");
		btnK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selectedWord != "") {
					addChar('K');
					// On recupere la dificulté
					if (cbxDifficult.getSelectedItem() == "Débutant"
							|| cbxDifficult.getSelectedItem() == "Intermediaire") {
						btnK.setEnabled(false);
					}
				}
			}
		});

		JButton btnL = new JButton("L");
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selectedWord != "") {
					addChar('L');
					// On recupere la dificulté
					if (cbxDifficult.getSelectedItem() == "Débutant"
							|| cbxDifficult.getSelectedItem() == "Intermediaire") {
						btnL.setEnabled(false);
					}
				}
			}
		});

		JButton btnM = new JButton("M");
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selectedWord != "") {
					addChar('M');
					// On recupere la dificulté
					if (cbxDifficult.getSelectedItem() == "Débutant"
							|| cbxDifficult.getSelectedItem() == "Intermediaire") {
						btnM.setEnabled(false);
					}
				}
			}
		});

		JButton btnN = new JButton("N");
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selectedWord != "") {
					addChar('N');
					// On recupere la dificulté
					if (cbxDifficult.getSelectedItem() == "Débutant"
							|| cbxDifficult.getSelectedItem() == "Intermediaire") {
						btnN.setEnabled(false);
					}
				}
			}
		});

		JButton btnO = new JButton("O");
		btnO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selectedWord != "") {
					addChar('O');
					// On recupere la dificulté
					if (cbxDifficult.getSelectedItem() == "Débutant"
							|| cbxDifficult.getSelectedItem() == "Intermediaire") {
						btnO.setEnabled(false);
					}
				}
			}
		});

		JButton btnP = new JButton("P");
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selectedWord != "") {
					addChar('P');
					// On recupere la dificulté
					if (cbxDifficult.getSelectedItem() == "Débutant"
							|| cbxDifficult.getSelectedItem() == "Intermediaire") {
						btnP.setEnabled(false);
					}
				}
			}
		});

		JButton btnQ = new JButton("Q");
		btnQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selectedWord != "") {
					addChar('Q');
					// On recupere la dificulté
					if (cbxDifficult.getSelectedItem() == "Débutant"
							|| cbxDifficult.getSelectedItem() == "Intermediaire") {
						btnQ.setEnabled(false);
					}
				}
			}
		});

		JButton btnR = new JButton("R");
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selectedWord != "") {
					addChar('R');
					// On recupere la dificulté
					if (cbxDifficult.getSelectedItem() == "Débutant"
							|| cbxDifficult.getSelectedItem() == "Intermediaire") {
						btnR.setEnabled(false);
					}
				}
			}
		});

		JButton btnS = new JButton("S");
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selectedWord != "") {
					addChar('S');
					// On recupere la dificulté
					if (cbxDifficult.getSelectedItem() == "Débutant"
							|| cbxDifficult.getSelectedItem() == "Intermediaire") {
						btnS.setEnabled(false);
					}
				}
			}
		});

		JButton btnT = new JButton("T");
		btnT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selectedWord != "") {
					addChar('T');
					// On recupere la dificulté
					if (cbxDifficult.getSelectedItem() == "Débutant"
							|| cbxDifficult.getSelectedItem() == "Intermediaire") {
						btnT.setEnabled(false);
					}
				}
			}
		});

		JButton btnU = new JButton("U");
		btnU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selectedWord != "") {
					addChar('U');
					// On recupere la dificulté
					if (cbxDifficult.getSelectedItem() == "Débutant"
							|| cbxDifficult.getSelectedItem() == "Intermediaire") {
						btnU.setEnabled(false);
					}
				}
			}
		});

		JButton btnV = new JButton("V");
		btnV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selectedWord != "") {
					addChar('V');
					// On recupere la dificulté
					if (cbxDifficult.getSelectedItem() == "Débutant"
							|| cbxDifficult.getSelectedItem() == "Intermediaire") {
						btnV.setEnabled(false);
					}
				}
			}
		});

		JButton btnW = new JButton("W");
		btnW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selectedWord != "") {
					addChar('W');
					// On recupere la dificulté
					if (cbxDifficult.getSelectedItem() == "Débutant"
							|| cbxDifficult.getSelectedItem() == "Intermediaire") {
						btnW.setEnabled(false);
					}
				}
			}
		});

		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selectedWord != "") {
					addChar('X');
					// On recupere la dificulté
					if (cbxDifficult.getSelectedItem() == "Débutant"
							|| cbxDifficult.getSelectedItem() == "Intermediaire") {
						btnX.setEnabled(false);
					}
				}
			}
		});

		JButton btnY = new JButton("Y");
		btnY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selectedWord != "") {
					addChar('Y');
					// On recupere la dificulté
					if (cbxDifficult.getSelectedItem() == "Débutant"
							|| cbxDifficult.getSelectedItem() == "Intermediaire") {
						btnY.setEnabled(false);
					}
				}
			}
		});

		JButton btnZ = new JButton("Z");
		btnZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selectedWord != "") {
					addChar('Z');
					// On recupere la dificulté
					if (cbxDifficult.getSelectedItem() == "Débutant"
							|| cbxDifficult.getSelectedItem() == "Intermediaire") {
						btnZ.setEnabled(false);
					}
				}
			}
		});

		lblNewImage.setHorizontalAlignment(SwingConstants.CENTER);

		lblFault.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblFault.setBackground(Color.WHITE);
		lblFault.setForeground(Color.RED);
		cbxDifficult.setToolTipText(
				"Le mode débutant et intermediaire on une aide clavier, les touches utilisées se désactivent.");

		cbxDifficult.setFont(new Font("SansSerif", Font.PLAIN, 14));
		cbxDifficult
				.setModel(new DefaultComboBoxModel(new String[] { "Débutant", "Intermediaire", "Avancé", "Expert" }));
		cbxDifficult.setSelectedIndex(0);

		JLabel lblNewGame = new JLabel("Choisissez le niveau de diffilculté");
		lblNewGame.setBackground(new Color(0, 128, 0));
		lblNewGame.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblNewGame.setForeground(new Color(0, 100, 0));

		btnStartGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// on réactive tout les boutons
				if (btnStartGame.getText() == "Rejouer" && selectedWord == "") {
					btnA.setEnabled(true);
					btnB.setEnabled(true);
					btnC.setEnabled(true);
					btnD.setEnabled(true);
					btnE.setEnabled(true);
					btnF.setEnabled(true);
					btnG.setEnabled(true);
					btnH.setEnabled(true);
					btnI.setEnabled(true);
					btnJ.setEnabled(true);
					btnK.setEnabled(true);
					btnL.setEnabled(true);
					btnM.setEnabled(true);
					btnN.setEnabled(true);
					btnO.setEnabled(true);
					btnP.setEnabled(true);
					btnQ.setEnabled(true);
					btnR.setEnabled(true);
					btnS.setEnabled(true);
					btnT.setEnabled(true);
					btnU.setEnabled(true);
					btnV.setEnabled(true);
					btnW.setEnabled(true);
					btnX.setEnabled(true);
					btnY.setEnabled(true);
					btnZ.setEnabled(true);

				}
				// reinitialise le nombre de fautes
				nbrFault = 0;
				getImage();
				llblResultat.setText("Rejouez");
				lblFault.setText("Vous avez fait 0 faute");

				// On recupere la dificulté
				if (cbxDifficult.getSelectedItem() == "Avancé" || cbxDifficult.getSelectedItem() == "Expert") {

					btnIsActive = false;
				}
				// On désactive le bouton Commencer la partie
				btnStartGame.setEnabled(false);
				selectedDifficult = (String) cbxDifficult.getSelectedItem();

				generatWord();
			}
		});

		llblResultat.setFont(new Font("SansSerif", Font.PLAIN, 14));
		llblResultat.setForeground(new Color(0, 100, 0));

		lblNouveauMot.setFont(new Font("Arial Black", Font.BOLD, 20));

		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup().addGap(35).addGroup(gl_panel
										.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
												.createSequentialGroup().addComponent(btnK, GroupLayout.PREFERRED_SIZE,
														50, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(
														btnL, GroupLayout.PREFERRED_SIZE, 50,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_panel.createSequentialGroup()
																.addComponent(btnU, GroupLayout.PREFERRED_SIZE, 50,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(btnV, GroupLayout.PREFERRED_SIZE, 50,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(btnW, GroupLayout.PREFERRED_SIZE, 50,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(btnX, GroupLayout.PREFERRED_SIZE, 50,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(btnY, GroupLayout.PREFERRED_SIZE, 50,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(btnZ, GroupLayout.PREFERRED_SIZE, 50,
																		GroupLayout.PREFERRED_SIZE))
														.addGroup(gl_panel.createSequentialGroup()
																.addComponent(btnM, GroupLayout.PREFERRED_SIZE, 50,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(btnN, GroupLayout.PREFERRED_SIZE, 50,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(btnO, GroupLayout.PREFERRED_SIZE, 50,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(btnP, GroupLayout.PREFERRED_SIZE, 50,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(btnQ, GroupLayout.PREFERRED_SIZE, 50,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(btnR, GroupLayout.PREFERRED_SIZE, 50,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(btnS, GroupLayout.PREFERRED_SIZE, 50,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(
																		btnT, GroupLayout.PREFERRED_SIZE, 50,
																		GroupLayout.PREFERRED_SIZE))))
										.addGroup(gl_panel.createSequentialGroup()
												.addComponent(btnA, GroupLayout.PREFERRED_SIZE, 50,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(btnB, GroupLayout.PREFERRED_SIZE, 50,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(btnC, GroupLayout.PREFERRED_SIZE, 50,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(btnD, GroupLayout.PREFERRED_SIZE, 50,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(btnE, GroupLayout.PREFERRED_SIZE, 50,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_panel.createSequentialGroup()
																.addComponent(btnF, GroupLayout.PREFERRED_SIZE, 50,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(btnG, GroupLayout.PREFERRED_SIZE, 50,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(btnH, GroupLayout.PREFERRED_SIZE, 50,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(btnI, GroupLayout.PREFERRED_SIZE, 50,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(btnJ, GroupLayout.PREFERRED_SIZE, 50,
																		GroupLayout.PREFERRED_SIZE))
														.addComponent(lblNewGame, GroupLayout.DEFAULT_SIZE, 274,
																Short.MAX_VALUE)
														.addComponent(btnStartGame, GroupLayout.DEFAULT_SIZE, 274,
																Short.MAX_VALUE)
														.addComponent(cbxDifficult, 0, 274, Short.MAX_VALUE)
														.addComponent(llblResultat, GroupLayout.DEFAULT_SIZE, 274,
																Short.MAX_VALUE)
														.addComponent(lblNouveauMot, GroupLayout.DEFAULT_SIZE, 274,
																Short.MAX_VALUE)))))
								.addGroup(gl_panel.createSequentialGroup().addContainerGap()
										.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(lblFault, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lblNewImage, Alignment.LEADING,
														GroupLayout.PREFERRED_SIZE, 200, Short.MAX_VALUE))))
						.addGap(54)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup().addGap(15)
								.addComponent(lblNewImage, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(lblFault).addGap(33))
						.addGroup(gl_panel.createSequentialGroup().addGap(31).addComponent(lblNewGame)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(cbxDifficult, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addGap(18).addComponent(btnStartGame)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(llblResultat).addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(lblNouveauMot, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)))
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnA, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnB, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnC, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnD, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnE, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnF, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnG, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnH, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnI, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnJ, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnK, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnL, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnM, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnN, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnO, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnP, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnQ, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnR, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnS, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnT, GroupLayout.PREFERRED_SIZE, 35,
												GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnU, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnV, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnW, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnX, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnY, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnZ, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		panel.setLayout(gl_panel);

		getImage();

		/**
		 * une boucle dans l'alphabet for (char c = 'a'; c <= 'z'; c++) {
		 * System.out.println(c); }
		 */
	}

	public void getImage() {
		// récupere l'image resource, pas besoin de faire compliquer
		ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource(nbrFault + ".png"));
		lblNewImage.setIcon(imageIcon);
	}

	public void generatWord() {
		String[] thisTableau = new String[19];
		switch (selectedDifficult) {
		case "Débutant":
			thisTableau = debutant;
			break;
		case "Intermediaire":
			thisTableau = intermediaire;
			break;
		case "Avancé":
			thisTableau = avancer;
			break;
		case "Expert":
			thisTableau = expert;
			break;
		}
		Random obj = new Random();
		int Ran_num = obj.nextInt(19);

		// takes input of the word
		String word = (thisTableau[Ran_num]);
		word = word.toUpperCase();
		selectedWord = word;

		// Montrer le mot avec des underscore
		lblNouveauMot.setText(word.replaceAll("[A-Z]", "*"));
		llblResultat.setText("Un mot a été choisi, jouez !!");
	}

	public void addChar(char newChar) {
		String thisWord = lblNouveauMot.getText();
		StringBuilder newString = new StringBuilder(thisWord);

		if (nbrFault < 6 && thisWord.contains("*")) {
			// on verifie que la lettre n'a pas déjà été choisie
			int index1 = thisWord.indexOf(newChar);
			if (index1 > -1) {
				// on rajoute une faute en mode avancé et intermediaire
				nbrFault++;
				lblFault.setText("Vous avez fait  " + nbrFault + " faute(s)");
				llblResultat.setText("Vous avez déjà selectionner la lettre " + newChar);
				getImage();// on change d'image
				return;
			}

			// Avant d'aller plus loin on verifie que la lettre existe
			int index = selectedWord.indexOf(newChar);
			if (index == -1) {
				nbrFault++;
				lblFault.setText("Vous avez fait  " + nbrFault + " faute(s)");
				getImage();// on change d'image
				if (nbrFault == 6) {
					// partie perdue
					loosing();
					return;
				}
			} else {
				// On rajoute la lettre
				int i = 0;
				while (i < selectedWord.length()) {
					char charAt = selectedWord.charAt(i);

					if (charAt == newChar) {
						newString.setCharAt(i, newChar);
					}
					i++;
				}
				// on affiche le nouveau mot
				String endString = newString.toString();
				lblNouveauMot.setText(endString);
				thisWord = endString;
				System.out.println(selectedWord + "::" + thisWord);

			}
			if (nbrFault == 6) {
				// la partie est perdu
				loosing();
				return;
			}
		} else {
			// la partie est perdu
			loosing();
			return;
		}
		// On verifie si c'est gagné
		if (selectedWord.equals(thisWord)) {
			llblResultat.setText("Vous avez gagner !!");
			lblNouveauMot.setText(selectedWord);
			btnStartGame.setEnabled(true);
			btnStartGame.setText("Rejouer");
			selectedWord = "";
			return;
		}
	}

	public void loosing() {
		llblResultat.setText("Vous avez perdu !!");
		lblNouveauMot.setText(selectedWord);
		btnStartGame.setEnabled(true);
		btnStartGame.setText("Rejouer");
		selectedWord = "";
	}
}
