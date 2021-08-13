package classes.conexao;

import 	javax.swing.JOptionPane;
import java.sql.*;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JProgressBar;

public class TelaDeAcesso extends JFrame {

	private JPanel contentPane;
	private JTextField textUsuario;
	private JPasswordField senhafield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDeAcesso frame = new TelaDeAcesso();
					frame.setVisible(true);
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
		setTitle("Tela de Login ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 310, 340);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsurio = new JLabel("USU\u00C1RIO:");
		lblUsurio.setForeground(Color.BLACK);
		lblUsurio.setBounds(66, 45, 57, 14);
		contentPane.add(lblUsurio);
		
		JLabel lblSenha = new JLabel("SENHA:");
		lblSenha.setForeground(Color.BLACK);
		lblSenha.setBounds(66, 136, 78, 14);
		contentPane.add(lblSenha);
		
		textUsuario = new JTextField();
		textUsuario.setBackground(Color.YELLOW);
		textUsuario.setForeground(Color.GRAY);
		textUsuario.setColumns(10);
		textUsuario.setBounds(66, 70, 149, 33);
		contentPane.add(textUsuario);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBackground(Color.GRAY);
		btnEntrar.setForeground(Color.BLACK);
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					//cria objecto con trazendo parametros da classe conexao
					
					Connection con = Conexao.faz_conexao();
					//Query que será executada no banco
					String sql = "select * from dados_Senhas where usuario=? and senha=?";
					String sql2 = "select * from dados_senhas";
					
					/*Objeto stmt que manipulará valores retornados da query executada
					 no banco de dados*/
					PreparedStatement stmt  = con.prepareStatement(sql);
					
					//Parametros passados dentro de stmt quando necessário
					stmt.setString(1, textUsuario.getText());
					stmt.setString(2, new String(senhafield.getPassword()));
																			
					// variável rs que receberá o resultado retornado de stmt
					ResultSet rs = stmt.executeQuery();
					
					/*									
					while(rs.next()){
						String id = rs.getString("id");
						String usuario = rs.getString("usuario");
						String senha = rs.getString("senha");

						//System.out.println("-------------------------------------------------\n");
						JOptionPane.showMessageDialog(null,"Codigo: " + id + "\nNome:" +
								" "+usuario+ "  \nEndereço: " + senha + "" );
					 
					}
					  */
					if (rs.next()) {
						JOptionPane.showMessageDialog(null,"Usuario " + textUsuario.getText() +" encontrado");
						TelaDeCadastro.main(null);
					}else {
						JOptionPane.showMessageDialog(null,"Usuario " + textUsuario.getText() +" nao existe ou a Senha está incorreta","LOGIN",JOptionPane.ERROR_MESSAGE);
					}
					stmt.close();
					con.close();
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			
			}
		});
		btnEntrar.setBounds(103, 216, 89, 23);
		contentPane.add(btnEntrar);
		
		senhafield = new JPasswordField();
		senhafield.setBackground(Color.YELLOW);
		senhafield.setBounds(66, 161, 149, 32);
		contentPane.add(senhafield);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				try {
					//cria objecto con trazendo parametros da classe conexao
					
					Connection con = Conexao.faz_conexao();
					//Query que será executada no banco
					String sql = "insert into dados_senhas(usuario,senha)VALUES(?,?)";
					String sql2 = "select * from dados_senhas";
					
					/*Objeto stmt que manipulará valores retornados da query executada
					 no banco de dados*/
					PreparedStatement stmt  = con.prepareStatement(sql);
					
					//Parametros passados dentro de stmt quando necessário
					stmt.setString(1, textUsuario.getText());
					stmt.setString(2, new String(senhafield.getPassword()));
																			
								
						JOptionPane.showMessageDialog(null,"Usuario " + textUsuario.getText() +" Cadastrado");
					stmt.execute();
					
					stmt.close();
					con.close();
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			
			}
		});
		btnCadastrar.setBackground(Color.GRAY);
		btnCadastrar.setBounds(90, 250, 114, 23);
		contentPane.add(btnCadastrar);
	}
}
