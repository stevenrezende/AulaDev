package tela.jframe;


import javax.swing.JRadioButtonMenuItem;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.Window.Type;
import java.awt.Toolkit;
import javax.swing.JProgressBar;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import javax.swing.JMenu;
import javax.swing.JPasswordField;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaJframe extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtNum1;
	private JMenuBar menuBar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaJframe frame = new TelaJframe();
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
	public TelaJframe() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\frezende\\Pictures\\Rivo.jpg"));
		setAlwaysOnTop(true);
		
		setBackground(new Color(0, 128, 128));
		setType(Type.UTILITY);
		setTitle("Professor Fera demais!!!!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1, 100, 442, 278);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 99, 71));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBackground(Color.WHITE);
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"O Nome é: " + textField.getText());
			    TesteJFrame.main(null);
			   			}
		});
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnOk.setBounds(166, 147, 89, 38);
		contentPane.add(btnOk);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setBounds(64, 98, 293, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEntreComO = new JLabel("Entre Com o nome do Professor");
		lblEntreComO.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		lblEntreComO.setOpaque(true);
		lblEntreComO.setForeground(new Color(0, 0, 205));
		lblEntreComO.setBackground( new Color(238, 232, 170));
		lblEntreComO.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEntreComO.setBounds(64, 72, 293, 23);
		contentPane.add(lblEntreComO);
		
		txtNum1 = new JTextField();
		txtNum1.setBounds(299, 177, 86, 20);
		contentPane.add(txtNum1);
		txtNum1.setColumns(10);
		  // Cria uma barra de menu para o JFrame
        JMenuBar menuBar = new JMenuBar();
         
        // Adiciona a barra de menu ao  frame
        setJMenuBar(menuBar);
         
        // Define e adiciona dois menus drop down na barra de menus
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
         
        // Cria e adiciona um item simples para o menu
        JMenuItem newAction = new JMenuItem("New");
        JMenuItem openAction = new JMenuItem("Open");
        JMenuItem exitAction = new JMenuItem("Exit");
        JMenuItem cutAction = new JMenuItem("Cut");
        JMenuItem copyAction = new JMenuItem("Copy");
        JMenuItem pasteAction = new JMenuItem("Paste");
         
        // Cria e aiciona um CheckButton como um item de menu
        JCheckBoxMenuItem checkAction = new JCheckBoxMenuItem("Check Action");
        // Cria e aiciona um RadioButton como um item de menu
        JRadioButtonMenuItem radioAction1 = new JRadioButtonMenuItem(
                "Radio Button1");
        JRadioButtonMenuItem radioAction2 = new JRadioButtonMenuItem(
                "Radio Button2");
        // Cria um ButtonGroup e adiciona os dois radio Button
        ButtonGroup bg = new ButtonGroup();
        bg.add(radioAction1);
        bg.add(radioAction2);
        fileMenu.add(newAction);
        fileMenu.add(openAction);
        fileMenu.add(checkAction);
        fileMenu.addSeparator();
        fileMenu.add(exitAction);
        editMenu.add(cutAction);
        editMenu.add(copyAction);
        editMenu.add(pasteAction);	
	
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
