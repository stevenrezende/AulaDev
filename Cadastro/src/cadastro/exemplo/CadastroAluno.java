package cadastro.exemplo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class CadastroAluno extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtDataNasc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroAluno frame = new CadastroAluno();
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
	public CadastroAluno() {
		setAlwaysOnTop(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\frezende\\Pictures\\3910_Wallpaper_janeiro-2021-1920x1080px.jpg"));
		setTitle("Cadastro de Alunos");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 637, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Arial", Font.BOLD, 16));
		txtNome.setBounds(72, 103, 309, 35);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Arial", Font.BOLD, 16));
		txtEmail.setColumns(10);
		txtEmail.setBounds(72, 192, 309, 35);
		contentPane.add(txtEmail);
		
		JLabel lblNome = new JLabel("NOME");
		lblNome.setFont(new Font("Arial", Font.BOLD, 16));
		lblNome.setBounds(72, 72, 59, 35);
		contentPane.add(lblNome);
		
		JLabel lblEmail = new JLabel("EMAIL");
		lblEmail.setFont(new Font("Arial", Font.BOLD, 16));
		lblEmail.setBounds(72, 161, 59, 35);
		contentPane.add(lblEmail);
		
		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//trata a data recebida
				String data=txtDataNasc.getText();
				String dataFormat[] = data.split("/");
				data=dataFormat[2]+"-"+dataFormat[1]+"-"+dataFormat[0];
				
				try {
					//cria um objeto con com atributos e metodos da classe criada "ConexaoBd"
					Connection con = conexao.faz_conexao();
					//Query que será executada no banco
					String sql = "insert into alunos (nome,email,dataNasc) values (?,?,?)";
					
					// objeto statement  que  manipulará ações com a querie "sql" declarada acima
					PreparedStatement stmt  = con.prepareStatement(sql);
					
					// vai inserir no primeiro parametro da querie o valor o txtNome da nossa tela
					stmt.setString(1, txtNome.getText());
					//vai inserir no segundo parametro da querie o valor Email da nossa tela
					stmt.setString(2, txtEmail.getText());
					stmt.setString(3, data);
							
					JOptionPane.showMessageDialog(null,"Usuario " + txtNome.getText()+ "Cadastrado cmsucesso" );
					
					//executara o que foi preparado anteriormente
					stmt.execute();
					
															
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
		btnOK.setFont(new Font("Arial", Font.BOLD, 16));
		btnOK.setBounds(436, 133, 106, 23);
		contentPane.add(btnOK);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				setVisible(false);
			}
		});
		btnCancelar.setFont(new Font("Arial", Font.BOLD, 16));
		btnCancelar.setBounds(436, 173, 106, 23);
		contentPane.add(btnCancelar);
		
		JLabel lblDataNasc = new JLabel("Data Nascimento");
		lblDataNasc.setFont(new Font("Arial", Font.BOLD, 16));
		lblDataNasc.setBounds(72, 235, 158, 35);
		contentPane.add(lblDataNasc);
		
		txtDataNasc = new JTextField();
		txtDataNasc.setText("00/00/0000");
		txtDataNasc.setFont(new Font("Arial", Font.BOLD, 16));
		txtDataNasc.setColumns(10);
		txtDataNasc.setBounds(72, 266, 309, 35);
		contentPane.add(txtDataNasc);
	}
}
