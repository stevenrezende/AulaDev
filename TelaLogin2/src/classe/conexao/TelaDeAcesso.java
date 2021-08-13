package classe.conexao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import java.awt.event.ActionEvent;

public class TelaDeAcesso extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField pwdSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDeAcesso frame = new TelaDeAcesso();
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
	public TelaDeAcesso() {
		setTitle("Usu\u00E1rio e Senha");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 535, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(114, 93, 71, 40);
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblUsuario);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(97, 144, 102, 32);
		lblSenha.setHorizontalAlignment(SwingConstants.CENTER);
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblSenha);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(195, 105, 86, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		pwdSenha = new JPasswordField();
		pwdSenha.setBounds(195, 152, 86, 20);
		contentPane.add(pwdSenha);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con =  Conexao.faz_conexao();
					String sql = "select * from dados_Senhas where usuario=? and senha=?";
					
					PreparedStatement stmt  = con.prepareStatement(sql);
					
					stmt.setString(1, txtUsuario.getText());
					stmt.setString(2, new String(pwdSenha.getPassword()));
					
					ResultSet rs = stmt.executeQuery();
					if (rs.next()) {
						JOptionPane.showMessageDialog(null,"Usuario " + txtUsuario.getText()+" encontrado");
					}else {
						JOptionPane.showMessageDialog(null,"Usuario " + txtUsuario.getText() +" nao existe ou a Senha está incorreta","LOGIN",JOptionPane.ERROR_MESSAGE);
					}
					stmt.close();
					con.close();
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				

			}
		});
		btnEntrar.setBounds(307, 105, 89, 60);
		contentPane.add(btnEntrar);
	}
}
