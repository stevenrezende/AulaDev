package cadastro.exemplo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField passSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setAlwaysOnTop(true);
		setTitle("Tela de Login");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 477, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con = conexao.faz_conexao();
					String sql = "select * from dados_Senhas where usuario=? and senha=?";
					
					PreparedStatement stmt  = con.prepareStatement(sql);
					stmt.setString(1, txtUsuario.getText());
					stmt.setString(2, new String(passSenha.getPassword()));
					
					ResultSet rs = stmt.executeQuery();
					if (rs.next()) {
						JOptionPane.showMessageDialog(null,"Usuario '" + txtUsuario.getText() +"' encontrado");
						Cadastro.main(null);
						
					}else {
						JOptionPane.showMessageDialog(null,"Usuario '" + txtUsuario.getText() +"' nao existe ou a Senha está incorreta","LOGIN",JOptionPane.ERROR_MESSAGE);
					}
					stmt.close();
					con.close();
					//setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
					setVisible(false);
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnEntrar.setForeground(Color.WHITE);
		btnEntrar.setBackground(Color.DARK_GRAY);
		btnEntrar.setFont(new Font("Stencil", Font.BOLD, 18));
		btnEntrar.setBounds(299, 112, 133, 66);
		contentPane.add(btnEntrar);
		
		
		JLabel lblUsuario = new JLabel("Usu\u00E1rio");
		lblUsuario.setFont(new Font("Stencil", Font.BOLD, 18));
		lblUsuario.setBounds(50, 66, 97, 66);
		contentPane.add(lblUsuario);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Stencil", Font.BOLD, 18));
		lblSenha.setBounds(50, 159, 97, 66);
		contentPane.add(lblSenha);
		
		txtUsuario = new JTextField();
		txtUsuario.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtUsuario.setBounds(50, 112, 223, 36);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		passSenha = new JPasswordField();
		passSenha.setFont(new Font("Stencil", Font.BOLD, 18));
		passSenha.setBounds(50, 218, 223, 36);
		contentPane.add(passSenha);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//cria um objeto con com atributos e metodos da classe criada "ConexaoBd"
					Connection con = conexao.faz_conexao();
					//Query que será executada no banco
					String sql = "insert into dados_senhas (usuario,senha) values (?,?)";
					
					// objeto statement  que  manipulará ações com a querie "sql" declarada acima
					PreparedStatement stmt  = con.prepareStatement(sql);
					
					// vai inserir no primeiro parametro da querie o valor o txtUsuario da nossa tela
					stmt.setString(1, txtUsuario.getText());
					//vai inserir no segundo parametro da querie o valor passSenha da nossa tela
					stmt.setString(2, new String(passSenha.getPassword()));
					
					//executara o que foi preparado anteriormente
					stmt.execute();
					JOptionPane.showMessageDialog(null,"Usuario '" + txtUsuario.getText() +"'Inserido");
															
					//libera dados do stament em memória
					stmt.close();
					// fecha conexão com banco de dados
					con.close();
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnCadastrar.setForeground(Color.WHITE);
		btnCadastrar.setFont(new Font("Stencil", Font.BOLD, 18));
		btnCadastrar.setBackground(Color.DARK_GRAY);
		btnCadastrar.setBounds(291, 189, 149, 66);
		contentPane.add(btnCadastrar);
	}
}
