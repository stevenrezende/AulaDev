package classes.conexao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class TelaDeCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField RA;
	private JTextField NOME;
	private JTextField EMAIL;
	private JTextField SEXO;
	private JTextField DDDCEL;
	private JLabel lblCelular;
	private JTextField CELULAR;
	private JLabel lblDddfone;
	private JTextField DDDFONE;
	private JLabel lblTelefone;
	private JTextField FONE;
	private JLabel lblCurso;
	private JTextField CURSO;
	private JLabel lblTurma;
	private JTextField TURMA;
	private JLabel lblPeriodo;
	private JTextField PERIODO;
	private JLabel lblVlrmens;
	private JTextField MENS;
	private JLabel lblDtnasc;
	private JTextField NASC;
	private JLabel lblDtmatr;
	private JTextField MATR;
	private JButton btnDeletar;

	/**
	 * Launch the application.
	 */
	//m?todo para limpar/deletar dados. Esse m?todo serve para limpar todos os campos quando algum bot?o ? executado 
	//e joga dados nos campos.
	public void limpaDados(){
		
		RA.setText("");
		RA.setBackground(Color.WHITE);
		RA.setEditable(true);
		NOME.setText("");
		NOME.setBackground(Color.WHITE);
		NOME.setEditable(true);
		EMAIL.setText("");
		EMAIL.setBackground(Color.WHITE);
		EMAIL.setEditable(true);
		SEXO.setText("");
		SEXO.setBackground(Color.WHITE);
		SEXO.setEditable(true);
		DDDCEL.setText("");
		DDDCEL.setBackground(Color.WHITE);
		DDDCEL.setEditable(true);
		CELULAR.setText("");
		CELULAR.setBackground(Color.WHITE);
		CELULAR.setEditable(true);
		DDDFONE.setText("");
		DDDFONE.setBackground(Color.WHITE);
		DDDFONE.setEditable(true);
		FONE.setText("");
		FONE.setBackground(Color.WHITE);
		FONE.setEditable(true);
		CURSO.setText("");
		CURSO.setBackground(Color.WHITE);
		CURSO.setEditable(true);
		TURMA.setText("");
		TURMA.setBackground(Color.WHITE);
		TURMA.setEditable(true);
		PERIODO.setText("");
		PERIODO.setBackground(Color.WHITE);
		PERIODO.setEditable(true);
		MENS.setText("");
		MENS.setBackground(Color.WHITE);
		MENS.setEditable(true);
		NASC.setText("");
		NASC.setBackground(Color.WHITE);
		NASC.setEditable(true);
		MATR.setText("");
		MATR.setBackground(Color.WHITE);
		MATR.setEditable(true);
		
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				// Comando para tratar exe??es caso o o tela login n?o consiga chamar a tela cadastro//
				try {
					TelaDeCadastro frame = new TelaDeCadastro();
					frame.setVisible(true);
				//Comando que centraliza as janelas Window Builder //
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
	public TelaDeCadastro() {
		setTitle("Tela de cadastro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 466, 353);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRg = new JLabel("RA:");
		lblRg.setBounds(20, 29, 26, 14);
		contentPane.add(lblRg);
		
		RA = new JTextField();
		RA.setBounds(68, 26, 103, 20);
		contentPane.add(RA);
		RA.setColumns(10);
		
		
		JLabel lblNome = new JLabel("NOME:");
		lblNome.setBounds(259, 29, 39, 14);
		contentPane.add(lblNome);
		
		NOME = new JTextField();
		NOME.setBounds(296, 26, 144, 20);
		contentPane.add(NOME);
		NOME.setColumns(10);
		
		JLabel lblEmail = new JLabel("EMAIL:");
		lblEmail.setBounds(10, 54, 48, 14);
		contentPane.add(lblEmail);
		
		EMAIL = new JTextField();
		EMAIL.setColumns(10);
		EMAIL.setBounds(68, 51, 181, 20);
		contentPane.add(EMAIL);
		
		JLabel lblSexo = new JLabel("SEXO:");
		lblSexo.setBounds(259, 54, 39, 14);
		contentPane.add(lblSexo);
		
		SEXO = new JTextField();
		SEXO.setColumns(10);
		SEXO.setBounds(296, 51, 144, 20);
		contentPane.add(SEXO);
		
		JLabel lblDddcel = new JLabel("DDDCEL:");
		lblDddcel.setBounds(10, 85, 60, 14);
		contentPane.add(lblDddcel);
		
		DDDCEL = new JTextField();
		DDDCEL.setColumns(10);
		DDDCEL.setBounds(68, 82, 46, 20);
		contentPane.add(DDDCEL);
		
		lblCelular = new JLabel("CELULAR:");
		lblCelular.setBounds(238, 85, 56, 14);
		contentPane.add(lblCelular);
		
		CELULAR = new JTextField();
		CELULAR.setColumns(10);
		CELULAR.setBounds(296, 82, 144, 20);
		contentPane.add(CELULAR);
		
		lblDddfone = new JLabel("DDDFONE:");
		lblDddfone.setBounds(10, 113, 60, 17);
		contentPane.add(lblDddfone);
		
		DDDFONE = new JTextField();
		DDDFONE.setColumns(10);
		DDDFONE.setBounds(68, 110, 46, 20);
		contentPane.add(DDDFONE);
		
		lblTelefone = new JLabel("FONE:");
		lblTelefone.setBounds(262, 114, 36, 14);
		contentPane.add(lblTelefone);
		
		FONE = new JTextField();
		FONE.setColumns(10);
		FONE.setBounds(296, 110, 144, 20);
		contentPane.add(FONE);
		
		lblCurso = new JLabel("CURSO:");
		lblCurso.setBounds(10, 144, 46, 14);
		contentPane.add(lblCurso);
		
		CURSO = new JTextField();
		CURSO.setColumns(10);
		CURSO.setBounds(68, 141, 144, 20);
		contentPane.add(CURSO);
		
		lblTurma = new JLabel("TURMA:");
		lblTurma.setBounds(252, 144, 46, 14);
		contentPane.add(lblTurma);
		
		TURMA = new JTextField();
		TURMA.setColumns(10);
		TURMA.setBounds(296, 141, 144, 20);
		contentPane.add(TURMA);
		
		lblPeriodo = new JLabel("PERIODO:");
		lblPeriodo.setBounds(10, 174, 60, 17);
		contentPane.add(lblPeriodo);
		
		PERIODO = new JTextField();
		PERIODO.setColumns(10);
		PERIODO.setBounds(68, 172, 144, 20);
		contentPane.add(PERIODO);
		
		lblVlrmens = new JLabel("VLR_MENS:");
		lblVlrmens.setBounds(222, 175, 72, 14);
		contentPane.add(lblVlrmens);
		
		MENS = new JTextField();
		MENS.setColumns(10);
		MENS.setBounds(296, 172, 144, 20);
		contentPane.add(MENS);
		
		lblDtnasc = new JLabel("DTNASC:");
		lblDtnasc.setBounds(10, 202, 56, 14);
		contentPane.add(lblDtnasc);
		
		NASC = new JTextField();
		NASC.setColumns(10);
		NASC.setBounds(68, 199, 144, 20);
		contentPane.add(NASC);
		
		lblDtmatr = new JLabel("DTMATR:");
		lblDtmatr.setBounds(232, 202, 62, 14);
		contentPane.add(lblDtmatr);
		
		MATR = new JTextField();
		MATR.setColumns(10);
		MATR.setBounds(296, 199, 144, 20);
		contentPane.add(MATR);
		// Bot?o consultar que chama os dados do banco usando a query SELECT//
		JButton btnInserir = new JButton("CONSULTAR");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				try {
					//cria objecto con trazendo parametros da classe conexao
					
					Connection con = Conexao.faz_conexao();
					//Query que ser? executada no banco
					String sql = "select * from dados where RA=?";
					
					
					/*Objeto stmt que manipular? valores retornados da query executada
					 no banco de dados*/
					PreparedStatement stmt  = con.prepareStatement(sql);
					
					//Parametros passados dentro de stmt quando necess?rio
					stmt.setString(1, RA.getText());
					
					// vari?vel rs que receber? o resultado retornado de stmt
					ResultSet rs = stmt.executeQuery();
					
					/*									
					while(rs.next()){
						String id = rs.getString("id");
						String usuario = rs.getString("usuario");
						String senha = rs.getString("senha");

						//System.out.println("-------------------------------------------------\n");
						JOptionPane.showMessageDialog(null,"Codigo: " + id + "\nNome:" +
								" "+usuario+ "  \nEndere?o: " + senha + "" );
					 
					}
					  */
					
					// Comando if para jogar os dados presentes no banco respectivamente eu seu devido campo criado 
					// no window builder//
					if (rs.next()) {
						
						RA.setText(rs.getString("RA"));
						RA.setBackground(Color.GREEN);
						RA.setEditable(false);
						NOME.setText(rs.getString("NOME"));
						NOME.setBackground(Color.GREEN);
						NOME.setEditable(false);
						EMAIL.setText(rs.getString("EMAIL"));
						EMAIL.setBackground(Color.GREEN);
						EMAIL.setEditable(false);
						SEXO.setText(rs.getString("SEXO"));
						SEXO.setBackground(Color.GREEN);
						SEXO.setEditable(false);
						DDDCEL.setText(rs.getString("DDDCEL"));
						DDDCEL.setBackground(Color.GREEN);
						DDDCEL.setEditable(false);
						CELULAR.setText(rs.getString("CELULAR"));
						CELULAR.setBackground(Color.GREEN);
						CELULAR.setEditable(false);
						DDDFONE.setText(rs.getString("DDDFONE"));
						DDDFONE.setBackground(Color.GREEN);
						DDDFONE.setEditable(false);
						FONE.setText(rs.getString("FONE"));
						FONE.setBackground(Color.GREEN);
						FONE.setEditable(false);
						CURSO.setText(rs.getString("CURSO"));
						CURSO.setBackground(Color.GREEN);
						CURSO.setEditable(false);
						TURMA.setText(rs.getString("TURMA"));
						TURMA.setBackground(Color.GREEN);
						TURMA.setEditable(false);
						PERIODO.setText(rs.getString("PERIODO"));
						PERIODO.setBackground(Color.GREEN);
						PERIODO.setEditable(false);
						MENS.setText(rs.getString("VLR_MENS"));
						MENS.setBackground(Color.GREEN);
						MENS.setEditable(false);
						NASC.setText(rs.getString("DTNASC"));
						NASC.setBackground(Color.GREEN);
						NASC.setEditable(false);
						MATR.setText(rs.getString("DTMATR"));
						MATR.setBackground(Color.GREEN);
						MATR.setEditable(false);
						
					}else {
						JOptionPane.showMessageDialog(null,"Usuario " + RA.getText() +" nao existe ou a Senha est? incorreta","LOGIN",JOptionPane.ERROR_MESSAGE);
					}
					stmt.close();
					con.close();
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			
			}
		});
		btnInserir.setBounds(320, 255, 120, 23);
		contentPane.add(btnInserir);
		// bot?o cadastrar que insera dados dentro do banco usando a query de INSERT//
		JButton btnok = new JButton("CADASTRAR");
		btnok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				try {
					//cria objecto con trazendo parametros da classe conexao
					
					Connection con = Conexao.faz_conexao();
					//Query que ser? executada no banco
					String sql = "insert into dados(RA,Nome,email,sexo,dddcel,celular,dddfone,fone,curso,turma,periodo,vlr_mens,dtnasc,dtmatr)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
					
					
					/*Objeto stmt que manipular? valores retornados da query executada
					 no banco de dados*/
					PreparedStatement stmt  = con.prepareStatement(sql);
					
					//Parametros passados dentro de stmt quando necess?rio
					stmt.setString(1, RA.getText());
					stmt.setString(2, NOME.getText());
					stmt.setString(3, EMAIL.getText());
					stmt.setString(4, SEXO.getText());
					stmt.setString(5, DDDCEL.getText());
					stmt.setString(6, CELULAR.getText());
					stmt.setString(7, DDDFONE.getText());
					stmt.setString(8, FONE.getText());
					stmt.setString(9, CURSO.getText());
					stmt.setString(10, TURMA.getText());
					stmt.setString(11, PERIODO.getText());
					stmt.setString(12, MENS.getText());
					stmt.setString(13, NASC.getText());
					stmt.setString(14, MATR.getText());
				
																			
								
						JOptionPane.showMessageDialog(null,"Usuario " + NOME.getText() +" Cadastrado");
					stmt.execute();
					
					stmt.close();
					con.close();
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			
			
			
			
			
			
			
			
			}
		});
		
		
		btnok.setBounds(10, 255, 121, 23);
		contentPane.add(btnok);
		// Bot?o que limpa os dados buscados anteriormente para realizar uma nova consulta com o Bot?o CONSULTA//
		JButton btnOk = new JButton("NOVA CONSULTA");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				RA.setText("");
				RA.setEditable(true);
				RA.setBackground(Color.WHITE);
				NOME.setText("");
				NOME.setEditable(false);
				NOME.setBackground(Color.WHITE);
				EMAIL.setText("");
				EMAIL.setEditable(false);
				EMAIL.setBackground(Color.WHITE);
				SEXO.setText("");
				SEXO.setEditable(false);
				SEXO.setBackground(Color.WHITE);
				DDDCEL.setText("");
				DDDCEL.setEditable(false);
				DDDCEL.setBackground(Color.WHITE);
				CELULAR.setText("");
				CELULAR.setEditable(false);
				CELULAR.setBackground(Color.WHITE);
				DDDFONE.setText("");
				DDDFONE.setEditable(false);
				DDDFONE.setBackground(Color.WHITE);
				FONE.setText("");
				FONE.setEditable(false);
				FONE.setBackground(Color.WHITE);
				CURSO.setText("");
				CURSO.setEditable(false);
				CURSO.setBackground(Color.WHITE);
				TURMA.setText("");
				TURMA.setEditable(false);
				TURMA.setBackground(Color.WHITE);
				PERIODO.setText("");
				PERIODO.setEditable(false);
				PERIODO.setBackground(Color.WHITE);
				MENS.setText("");
				MENS.setEditable(false);
				MENS.setBackground(Color.WHITE);
				NASC.setText("");
				NASC.setEditable(false);
				NASC.setBackground(Color.WHITE);
				MATR.setText("");
				MATR.setEditable(false);
				MATR.setBackground(Color.WHITE);
			
			
			
			
			
			}
		});
		
		
		btnOk.setBounds(151, 255, 159, 23);
		contentPane.add(btnOk);
		
		btnDeletar = new JButton("DELETAR");
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
				try {
					//cria objecto con trazendo parametros da classe conexao
					
					Connection con = Conexao.faz_conexao();
					//Query que ser? executada no banco
					String sql = "delete from dados where RA=?";
					
					PreparedStatement stmt  = con.prepareStatement(sql);
					stmt.setString(1, RA.getText());
					RA.setEditable(true);
					RA.setBackground(Color.WHITE);
			
					JOptionPane.showMessageDialog(null,"Usuario " + NOME.getText() +" Deletado");
					stmt.execute();
					limpaDados();
					
					
					stmt.close();
					con.close();
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			
			
			}
		
		
		
		});
		
		btnDeletar.setBounds(192, 289, 89, 23);
		contentPane.add(btnDeletar);
	}
}
