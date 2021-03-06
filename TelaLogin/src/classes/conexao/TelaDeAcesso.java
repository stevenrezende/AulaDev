package classes.conexao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import javax.swing.JComboBox;

public class TelaDeAcesso extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField passSenha;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDeAcesso frame = new TelaDeAcesso();
					frame.setVisible(true);
					//CODIGO INSERIDO
				    frame.setLocationRelativeTo(null);
				    
					
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
		setResizable(false);
		setTitle("Tela de Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 306, 329);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("USUARIO");
		lblUsuario.setFont(new Font("Arial", Font.BOLD, 16));
		lblUsuario.setBounds(67, 27, 82, 34);
		contentPane.add(lblUsuario);
		
		JLabel lblSenha = new JLabel("SENHA");
		lblSenha.setFont(new Font("Arial", Font.BOLD, 16));
		lblSenha.setBounds(67, 115, 65, 48);
		contentPane.add(lblSenha);
		
		txtUsuario = new JTextField();
		txtUsuario.setFont(new Font("Arial", Font.BOLD, 16));
		txtUsuario.setBounds(62, 72, 172, 34);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		passSenha = new JPasswordField();
		passSenha.setFont(new Font("Arial", Font.BOLD, 11));
		passSenha.setBounds(66, 159, 168, 34);
		contentPane.add(passSenha);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//cria objecto con trazendo parametros da classe conexao
					//txtUsuario.setEnabled(false);
					txtUsuario.setEditable(false);
					txtUsuario.setForeground(Color.GRAY);
					//txtUsuario.setBackground(Color.BLACK);
					
					Connection con = conexao.faz_conexao();
					//Query que ser? executada no banco
					//String sql = "select * from dados_Senhas where usuario=? and senha=?";
					String sql2 = "select * from dados_senhas ";
					
					/*Objeto stmt que manipular? valores retornados da query executada
					 no banco de dados*/
					PreparedStatement stmt  = con.prepareStatement(sql2);
					
					//Parametros passados dentro de stmt quando necess?rio
					//stmt.setString(1, txtUsuario.getText());
					//stmt.setString(2, new String(passSenha.getPassword()));
																			
					// vari?vel rs que receber? o resultado retornado de stmt
					ResultSet rs = stmt.executeQuery();
					
														
					if(rs.next()){
						String id = rs.getString("id");
						String usuario = rs.getString("usuario");
						String senha = rs.getString("senha");

						//System.out.println("-------------------------------------------------\n");
						JOptionPane.showMessageDialog(null,"Codigo: " + id + "\nNome:" +
								" "+ "abobrinha"+ "  \nEndere?o: " + senha + "" );
						
					textField.setText("a");
						
					 
					}
					 
					if (rs.next()) {
						JOptionPane.showMessageDialog(null,"Usuario " + txtUsuario.getText() +" encontrado");
					}else {
						JOptionPane.showMessageDialog(null,"Usuario " + txtUsuario.getText() +" nao existe ou a Senha est? incorreta","LOGIN",JOptionPane.ERROR_MESSAGE);
					}
					stmt.close();
					con.close();
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		btnEntrar.setFont(new Font("Arial", Font.BOLD, 16));
		btnEntrar.setBounds(103, 204, 89, 33);
		contentPane.add(btnEntrar);
		
		JButton btnCadastrar = new JButton("cadastrar");
		btnCadastrar.setFont(new Font("Arial", Font.BOLD, 16));
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				//cria objeto "con" trazendo parametros da classe conexao
				Connection con = conexao.faz_conexao();
				//Query que ser? executada no banco
				String sql = "insert into dados_senhas(usuario,senha)VALUES(?,?)";
								
				/*Objeto stmt que manipular? valores retornados da query executada
				 no banco de dados*/
				PreparedStatement stmt  = con.prepareStatement(sql);
				//Parametros passados dentro de stmt quando necess?rio
				stmt.setString(1, txtUsuario.getText());
				stmt.setString(2, new String(passSenha.getPassword()));
				JOptionPane.showMessageDialog(null,"Usuario " + txtUsuario.getText() +" Cadastrado");
				stmt.execute();
				
				stmt.close();
				con.close();
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			}
		});
		btnCadastrar.setBounds(91, 248, 117, 34);
		contentPane.add(btnCadastrar);
		
		textField = new JTextField();
		textField.setBounds(181, 115, 86, 33);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
