package jframe.janela;

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
import java.awt.Font;

public class TelaJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaJFrame frame = new TelaJFrame();
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
	public TelaJFrame() {
		setResizable(false);
		setTitle("Testando JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Meu nome é "+ txtNome.getText());
				
			}
		});
		btnNewButton.setBounds(161, 153, 89, 23);
		contentPane.add(btnNewButton);
		
		txtNome = new JTextField();
		txtNome.setBounds(67, 84, 260, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblEntreComO = new JLabel("Entre com o Nome");
		lblEntreComO.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblEntreComO.setBounds(67, 50, 230, 23);
		contentPane.add(lblEntreComO);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 424, 249);
		contentPane.add(panel);
	}
}
