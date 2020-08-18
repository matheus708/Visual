import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

public class exercicio1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtLogin;
	private JTextField textSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					exercicio1 frame = new exercicio1();
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
	public exercicio1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 233);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
				
				if ("admin".equals(txtLogin.getText()) && "swordfish".equals(textSenha.getText()))
					{JOptionPane.showMessageDialog(null, "As informações preenchidas estão corretas");}
				
				else
					{JOptionPane.showMessageDialog(null, "As informações preenchidas estão incorretas");}
					
			}
			
		});
		btnNewButton.setBounds(82, 139, 105, 44);
		contentPane.add(btnNewButton);
		
		JLabel btLogin = new JLabel("Login:");
		btLogin.setFont(new Font("Tahoma", Font.BOLD, 16));
		btLogin.setBounds(34, 24, 62, 30);
		contentPane.add(btLogin);
		
		JLabel btSenha = new JLabel("Senha:");
		btSenha.setFont(new Font("Tahoma", Font.BOLD, 16));
		btSenha.setBounds(34, 76, 62, 30);
		contentPane.add(btSenha);
		
		
		
		txtLogin = new JTextField();
		txtLogin.setBounds(101, 31, 146, 20);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);
		
		textSenha = new JTextField();
		textSenha.setBounds(101, 83, 146, 20);
		contentPane.add(textSenha);
		textSenha.setColumns(10);
	}
}
