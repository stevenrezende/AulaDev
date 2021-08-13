package view;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Rectangle;
import java.awt.Dimension;
import java.awt.CardLayout;
import java.awt.Button;
import java.awt.TextField;
import javax.swing.JMenuBar;

public class CalcTeste extends JFrame {
	public CalcTeste() {
		setBounds(new Rectangle(500, 500, 500, 500));
		setLocationByPlatform(true);
		
		Button btnOK = new Button("New button");
		btnOK.setBounds(0, 277, 488, 22);
		btnOK.setActionCommand("Clique para ver a Mensagem");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
			
			}
		});
		getContentPane().setLayout(null);
		getContentPane().add(btnOK);
		
		TextField txtTexto = new TextField();
		txtTexto.setBounds(0, 0, 488, 22);
		getContentPane().add(txtTexto);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("Teste");
		menuBar.setBounds(43, 28, 177, 29);
		getContentPane().add(menuBar);
	}

	private JPanel contentPane;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcTeste frame = new CalcTeste();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
