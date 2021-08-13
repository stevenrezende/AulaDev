package cadastro.exemplo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class ConsultaAluno extends JFrame {

	private JPanel contentPane;
	private JTextField txtConsulta;
	private JTextField txtIdConsulta;
	private JTextField txtEmailConsulta;
	private JLabel lblNascimento;
	private JTextField txtNasc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaAluno frame = new ConsultaAluno();
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
	public ConsultaAluno() {
		setFont(new Font("Dialog", Font.BOLD, 16));
		setResizable(false);
		setTitle("Consulta do Aluno");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 609, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNomeAConsultar = new JLabel("Nome a Consultar");
		lblNomeAConsultar.setFont(new Font("Arial", Font.BOLD, 16));
		lblNomeAConsultar.setBounds(24, 51, 150, 14);
		contentPane.add(lblNomeAConsultar);
		
		txtConsulta = new JTextField();
		txtConsulta.setBounds(24, 76, 223, 33);
		contentPane.add(txtConsulta);
		txtConsulta.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Arial", Font.BOLD, 16));
		lblEmail.setBounds(24, 191, 150, 14);
		contentPane.add(lblEmail);
		
		JLabel lblNomeAConsultar_1_1 = new JLabel("ID");
		lblNomeAConsultar_1_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblNomeAConsultar_1_1.setBounds(24, 120, 191, 14);
		contentPane.add(lblNomeAConsultar_1_1);
		
		txtIdConsulta = new JTextField();
		txtIdConsulta.setFont(new Font("Dialog", Font.BOLD, 16));
		txtIdConsulta.setEnabled(false);
		txtIdConsulta.setColumns(10);
		txtIdConsulta.setBounds(24, 145, 223, 33);
		contentPane.add(txtIdConsulta);
		
		txtEmailConsulta = new JTextField();
		txtEmailConsulta.setFont(new Font("Dialog", Font.BOLD, 16));
		txtEmailConsulta.setEnabled(false);
		txtEmailConsulta.setColumns(10);
		txtEmailConsulta.setBounds(24, 217, 223, 33);
		contentPane.add(txtEmailConsulta);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//cria um objeto con com atributos e metodos da classe criada "ConexaoBd"
					Connection con = conexao.faz_conexao();
					//Query que será executada no banco
					String sql = "select codigo,email,DATE_FORMAT(dataNasc, \"%d/%m/%Y\" ) as dataNasc from alunos where nome like ?";
					PreparedStatement stmt  = con.prepareStatement(sql);
					stmt.setString(1, txtConsulta.getText());
					
					
					ResultSet rs = stmt.executeQuery();
					
					if(rs != null && rs.next()){
			           			            	
					   txtIdConsulta.setText(rs.getString("codigo"));
					   txtEmailConsulta.setText(rs.getString("email"));
					   txtNasc.setText(rs.getString("dataNasc"));
					
					  }else {
						  JOptionPane.showMessageDialog(btnConsultar, "Não encontrado","Aluno",0);					  
						    txtIdConsulta.setText("Não encontrado");
							txtEmailConsulta.setText("Não encontrado");  
					  }
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
		btnConsultar.setFont(new Font("Arial", Font.BOLD, 16));
		btnConsultar.setBounds(268, 51, 107, 58);
		contentPane.add(btnConsultar);
		
		lblNascimento = new JLabel("Nascimento");
		lblNascimento.setFont(new Font("Arial", Font.BOLD, 16));
		lblNascimento.setBounds(288, 191, 150, 14);
		contentPane.add(lblNascimento);
		
		txtNasc = new JTextField();
		txtNasc.setFont(new Font("Dialog", Font.BOLD, 16));
		txtNasc.setEnabled(false);
		txtNasc.setColumns(10);
		txtNasc.setBounds(288, 217, 223, 33);
		contentPane.add(txtNasc);
	}

}
