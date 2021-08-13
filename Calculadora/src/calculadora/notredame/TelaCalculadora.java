package calculadora.notredame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class TelaCalculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	 double n1, n2;
	 String sinal;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCalculadora frame = new TelaCalculadora();
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
	public TelaCalculadora() {
		setResizable(false);
		
		
		
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 263, 371);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Obrigado Por utilizar a calculadora","Calculadora",1);
				System.exit(0);
				//TelaCalculadora.main(null);
				
				
			}
		});
		mnArquivo.add(mntmSair);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(24, 35, 196, 49);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnC.setFont(new Font("Arial", Font.BOLD, 12));
		btnC.setBounds(74, 85, 50, 39);
		contentPane.add(btnC);
		
		JButton btnCE = new JButton("CE");
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
							}
		});
		btnCE.setFont(new Font("Arial", Font.BOLD, 11));
		btnCE.setBounds(24, 85, 50, 39);
		contentPane.add(btnCE);
		
		JButton button_1 = new JButton("%");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1 = Double.parseDouble(textField.getText());
				textField.setText("");
				sinal="porcentagem";
			}
		});
		button_1.setFont(new Font("Arial", Font.BOLD, 17));
		button_1.setBounds(124, 85, 50, 39);
		contentPane.add(button_1);
		
		JButton btnX = new JButton("x");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1 = Double.parseDouble(textField.getText());
				textField.setText("");
				sinal="mult";
			}
		});
		btnX.setFont(new Font("Arial", Font.BOLD, 17));
		btnX.setBounds(174, 85, 50, 39);
		contentPane.add(btnX);
		
		JButton button_3 = new JButton("7");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"7");
			}
		});
		button_3.setFont(new Font("Arial", Font.BOLD, 17));
		button_3.setBounds(24, 121, 50, 39);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("8");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"9");
			}
		});
		button_4.setFont(new Font("Arial", Font.BOLD, 17));
		button_4.setBounds(74, 121, 50, 39);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("9");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"9");
			}
		});
		button_5.setFont(new Font("Arial", Font.BOLD, 17));
		button_5.setBounds(124, 121, 50, 39);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("\u00F7");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1 = Double.parseDouble(textField.getText());
				textField.setText("");
				sinal="div";
			}
		});
		button_6.setFont(new Font("Arial", Font.BOLD, 17));
		button_6.setBounds(174, 121, 50, 39);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("4");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"4");
			}
		});
		button_7.setFont(new Font("Arial", Font.BOLD, 17));
		button_7.setBounds(24, 156, 50, 39);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("5");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"5");
			}
		});
		button_8.setFont(new Font("Arial", Font.BOLD, 17));
		button_8.setBounds(74, 156, 50, 39);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("6");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"6");
			}
		});
		button_9.setFont(new Font("Arial", Font.BOLD, 17));
		button_9.setBounds(124, 156, 50, 39);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("-");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1 = Double.parseDouble(textField.getText());
				textField.setText("");
				sinal="sub";
			}
		});
		button_10.setFont(new Font("Arial", Font.BOLD, 17));
		button_10.setBounds(174, 156, 50, 39);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("1");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"1");
		
			}
		});
		button_11.setFont(new Font("Arial", Font.BOLD, 17));
		button_11.setBounds(24, 193, 50, 39);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("2");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"2");
				
			}
		});
		button_12.setFont(new Font("Arial", Font.BOLD, 17));
		button_12.setBounds(74, 193, 50, 39);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("3");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"3");
			}
		});
		button_13.setFont(new Font("Arial", Font.BOLD, 17));
		button_13.setBounds(124, 193, 50, 39);
		contentPane.add(button_13);
		
		JButton button_14 = new JButton("+");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				n1 = Double.parseDouble(textField.getText());
				textField.setText("");
				sinal="soma";
			}
		});
		button_14.setFont(new Font("Arial", Font.BOLD, 17));
		button_14.setBounds(174, 193, 50, 39);
		contentPane.add(button_14);
		
		JButton button_15 = new JButton("\u00B1");
		button_15.setFont(new Font("Arial", Font.BOLD, 17));
		button_15.setBounds(24, 230, 50, 39);
		contentPane.add(button_15);
		
		JButton button_16 = new JButton("0");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"0");
			}
		});
		button_16.setFont(new Font("Arial", Font.BOLD, 17));
		button_16.setBounds(74, 230, 50, 39);
		contentPane.add(button_16);
		
		JButton button_17 = new JButton(".");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+".");
			}
		});
		button_17.setFont(new Font("Arial", Font.BOLD, 17));
		button_17.setBounds(124, 230, 50, 39);
		contentPane.add(button_17);
		
		JButton button_18 = new JButton("=");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n2 = Double.parseDouble(textField.getText());
				if (sinal == "soma") {
					textField.setText(String.valueOf(n1+n2));
				}
				if (sinal == "sub") {
					textField.setText(String.valueOf(n1-n2));
				}
				if (sinal == "div") {
					textField.setText(String.valueOf(n1/n2));
				}
				if (sinal == "mult") {
					textField.setText(String.valueOf(n1*n2));
				}
			}
		});
		button_18.setFont(new Font("Arial", Font.BOLD, 17));
		button_18.setBounds(174, 230, 50, 39);
		contentPane.add(button_18);
	}
}
