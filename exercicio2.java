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
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class exercicio2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					exercicio2 frame = new exercicio2();
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
	public exercicio2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 195, 173);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel btA = new JLabel("A:");
		btA.setFont(new Font("Tahoma", Font.BOLD, 16));
		btA.setBounds(23, 24, 18, 14);
		contentPane.add(btA);
		
		JLabel btB = new JLabel("B:");
		btB.setFont(new Font("Tahoma", Font.BOLD, 16));
		btB.setBounds(23, 49, 18, 14);
		contentPane.add(btB);
		
		txtA = new JTextField();
		txtA.setBounds(62, 23, 86, 20);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setBounds(62, 48, 86, 20);
		contentPane.add(txtB);
		txtB.setColumns(10);
		
		btnNewButton = new JButton("Mostrar N\u00FAmeros");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String vl1 = txtA.getText();
				String vl2 = txtB.getText();
				
				int a = Integer.parseInt(vl1);
				int b = Integer.parseInt(vl2);
				
				String valor = "";
				
				for(int contagem = a; a <= b; contagem++){
                    if (contagem > a && contagem < b){
                        valor =  valor + "," +contagem ;}
				}
			
		JOptionPane.showMessageDialog(null, "Valores entre "+ a + " e " + b +":" + valor);}       	
}
				);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(10, 93, 159, 30);
		contentPane.add(btnNewButton);
		
	
}
}

