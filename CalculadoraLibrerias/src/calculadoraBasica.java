import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JOptionPane;
	import javax.swing.JTextField;
	import java.awt.Font;
	import javax.swing.JButton;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;

	public class calculadoraBasica extends JFrame {

		/**
		 * 
		 */
		private static final long serialVersionUID = 7932876915009079418L;
		private JPanel contentPane;
		private JTextField textPantalla;
		private String memoria;
		private String memoria2;

		

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						calculadoraBasica frame = new calculadoraBasica();
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
		public calculadoraBasica() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 455, 640);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			textPantalla = new JTextField();
			textPantalla.setFont(new Font("Tahoma", Font.PLAIN, 16));
			textPantalla.setBounds(80, 10, 289, 53);
			contentPane.add(textPantalla);
			textPantalla.setColumns(10);
			
			JButton btnNum1 = new JButton("1");
			btnNum1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textPantalla.setText(textPantalla.getText()+"1");
						
				}
			});
			btnNum1.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnNum1.setBounds(43, 444, 49, 53);
			contentPane.add(btnNum1);
			
			JButton btnNum2 = new JButton("2");
			btnNum2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textPantalla.setText(textPantalla.getText()+"2");
				
				}
			});
			btnNum2.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnNum2.setBounds(155, 444, 49, 53);
			contentPane.add(btnNum2);
			
			JButton btnNum3 = new JButton("3");
			btnNum3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textPantalla.setText(textPantalla.getText()+"3");
			
				}
			});
			btnNum3.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnNum3.setBounds(266, 444, 49, 53);
			contentPane.add(btnNum3);
			
			JButton btnSuma = new JButton("+");
			btnSuma.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				if(textPantalla.getText().equals("")==false) { 
				memoria=textPantalla.getText();
				textPantalla.setText("");
				} else
					JOptionPane.showMessageDialog(btnSuma,"Porfavor ingresa un numero valido");
				}
			});
			btnSuma.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnSuma.setBounds(368, 444, 49, 53);
			contentPane.add(btnSuma);
			
			JButton btnIgual = new JButton("=");
			btnIgual.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				String resultado;
				memoria2=textPantalla.getText();
				if(memoria2.equals("")==false) {
					int res=Integer.parseInt(memoria)+Integer.parseInt(memoria2);
					resultado = String.valueOf(res);
					textPantalla.setText(resultado);
				} else
					JOptionPane.showMessageDialog(btnIgual,"Porfavor ingresa un numero valido");
				}
			});
			btnIgual.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnIgual.setBounds(368, 522, 49, 53);
			contentPane.add(btnIgual);
			
			JButton btnReset = new JButton("CE");
			btnReset.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textPantalla.setText("");
				}
			});
			btnReset.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnReset.setBounds(43, 206, 67, 53);
			contentPane.add(btnReset);
			
			JButton btnNewButton = new JButton("Masa");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton.setBounds(137, 208, 67, 53);
			contentPane.add(btnNewButton);
			
			JButton btnNum4 = new JButton("4");
			btnNum4.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnNum4.setBounds(43, 366, 49, 53);
			contentPane.add(btnNum4);
			
			JButton btnNum5 = new JButton("5");
			btnNum5.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnNum5.setBounds(155, 366, 49, 53);
			contentPane.add(btnNum5);
			
			JButton btnNum6 = new JButton("6");
			btnNum6.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnNum6.setBounds(266, 366, 49, 53);
			contentPane.add(btnNum6);
			
			JButton btnNum7 = new JButton("7");
			btnNum7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNum7.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnNum7.setBounds(43, 286, 49, 53);
			contentPane.add(btnNum7);
			
			JButton btnNum8 = new JButton("8");
			btnNum8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNum8.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnNum8.setBounds(155, 286, 49, 53);
			contentPane.add(btnNum8);
			
			JButton btnNum9 = new JButton("9");
			btnNum9.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnNum9.setBounds(266, 286, 49, 53);
			contentPane.add(btnNum9);
			
			JButton btnNum0 = new JButton("0");
			btnNum0.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnNum0.setBounds(155, 522, 49, 53);
			contentPane.add(btnNum0);
			
			JButton btnMulti = new JButton("X");
			btnMulti.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnMulti.setBounds(368, 286, 49, 53);
			contentPane.add(btnMulti);
			
			JButton btnDivi = new JButton("/");
			btnDivi.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnDivi.setBounds(368, 206, 49, 53);
			contentPane.add(btnDivi);
			
			JButton btnResta = new JButton("-");
			btnResta.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnResta.setBounds(368, 366, 49, 53);
			contentPane.add(btnResta);
			
			JButton btnTemperatura = new JButton("Temperatura");
			btnTemperatura.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnTemperatura.setBounds(261, 206, 67, 53);
			contentPane.add(btnTemperatura);
		}
	}
