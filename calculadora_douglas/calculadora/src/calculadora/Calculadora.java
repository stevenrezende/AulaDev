package calculadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btn8;
	private JButton btnNew9;
	private JButton btnDiv;
	private JButton btnMult;
	private JButton btnMenos;
	private JButton btnMais;
	private JButton btn6;
	private JButton btn3;
	private JButton btnIgual;
	private JButton btn5;
	private JButton btn2;
	private JButton btnVirg;
	private JButton btn4;
	private JButton btn1;
	private JButton btn0;
	private JButton btnCe;
	private double n1;
	private double n2;
	private String sinal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(42, 55, 200, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"7");
			}
		});
		btn7.setBounds(42, 104, 40, 23);
		contentPane.add(btn7);
		
		btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"8");
			}
		});
		btn8.setBounds(88, 104, 40, 23);
		contentPane.add(btn8);
		
		btnNew9 = new JButton("9");
		btnNew9.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnNew9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"9");
			}
		});
		btnNew9.setBounds(138, 104, 40, 23);
		contentPane.add(btnNew9);
		
		btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1 = Double.parseDouble(textField.getText());
				textField.setText("");
				sinal = "div";
			}
		});
		btnDiv.setBounds(188, 104, 54, 23);
		contentPane.add(btnDiv);
		
		btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1 = Double.parseDouble(textField.getText());
				textField.setText("");
				sinal = "mult";
			}
		});
		btnMult.setBounds(188, 138, 54, 23);
		contentPane.add(btnMult);
		
		btnMenos = new JButton("-");
		btnMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1 = Double.parseDouble(textField.getText());
				textField.setText("");
				sinal = "menos";
			}
		});
		btnMenos.setBounds(188, 172, 54, 23);
		contentPane.add(btnMenos);
		
		btnMais = new JButton("+");
		btnMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1 = Double.parseDouble(textField.getText());
				textField.setText("");
				sinal = "soma";
			}
		});
		btnMais.setBounds(188, 206, 54, 23);
		contentPane.add(btnMais);
		
		btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"6");
			}
		});
		btn6.setBounds(138, 138, 40, 23);
		contentPane.add(btn6);
		
		btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"3");
			}
		});
		btn3.setBounds(138, 172, 40, 23);
		contentPane.add(btn3);
		
		btnIgual = new JButton("=");
		btnIgual.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n2 = Double.parseDouble(textField.getText());
				if(sinal == "soma") {		
				textField.setText(String.valueOf(n1+n2));
				}
				if(sinal == "menos") {
				textField.setText(String.valueOf(n1-n2));
				}
				if(sinal == "mult") {
				textField.setText(String.valueOf(n1*n2));
				}
				if(sinal == "div") {
				textField.setText(String.valueOf(n1/n2));
				}
			}
		});
		btnIgual.setBounds(138, 206, 40, 23);
		contentPane.add(btnIgual);
		
		btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"5");
			}
		});
		btn5.setBounds(88, 138, 40, 23);
		contentPane.add(btn5);
		
		btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"2");
			}
		});
		btn2.setBounds(88, 172, 40, 23);
		contentPane.add(btn2);
		
		btnVirg = new JButton(".");
		btnVirg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+".");
			}
		});
		btnVirg.setBounds(88, 206, 40, 23);
		contentPane.add(btnVirg);
		
		btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"4");
			}
		});
		btn4.setBounds(42, 138, 40, 23);
		contentPane.add(btn4);
		
		btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"1");
			}
		});
		btn1.setBounds(42, 172, 40, 23);
		contentPane.add(btn1);
		
		btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"0");
			}
		});
		btn0.setBounds(42, 206, 40, 23);
		contentPane.add(btn0);
		
		btnCe = new JButton("ce");
		btnCe.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnCe.setBounds(188, 81, 54, 23);
		contentPane.add(btnCe);
		
		JLabel lblNewLabel = new JLabel("Calculadora");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(53, 11, 172, 20);
		contentPane.add(lblNewLabel);
		
		JButton btnC = new JButton("c");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tamanho = textField.getText().length();
				String valores = textField.getText();
				valores = valores.substring(0,tamanho -1);
				textField.setText(valores);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnC.setBounds(138, 81, 40, 23);
		contentPane.add(btnC);
	}
}
