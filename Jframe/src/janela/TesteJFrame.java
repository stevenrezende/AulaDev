package janela;


import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;


public class TesteJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TesteJFrame frame = new TesteJFrame();
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
	public TesteJFrame() {
		setTitle("Nome do Professor mais legal do Mundo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnMostrar = new JButton("OK");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Seu nome é: "+ txtNome.getText());
				
				
				
			}
		});
		btnMostrar.setBounds(168, 134, 89, 23);
		contentPane.add(btnMostrar);
		
		txtNome = new JTextField();
		txtNome.setBounds(83, 92, 261, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblEntreComSeu = new JLabel("Entre com seu nome");
		lblEntreComSeu.setBounds(83, 67, 127, 14);
		contentPane.add(lblEntreComSeu);
	}
}
