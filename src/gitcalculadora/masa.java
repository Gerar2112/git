package gitcalculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import libUnidadesPeso.libUnidadesPeso;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class masa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textLibra;
	private JTextField textResLi;
	private JTextField textOnza;
	private JTextField textResOz;
	private JTextField textKilo;
	private JTextField textResKg;
	private JTextField textGramo;
	private JTextField textResGr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					masa frame = new masa();
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
	public masa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textLibra = new JTextField();
		textLibra.setBounds(10, 36, 96, 21);
		contentPane.add(textLibra);
		textLibra.setColumns(10);
		
		JButton btnLibra = new JButton("Libra a Gramo");
		btnLibra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try {
	                	libUnidadesPeso conversion = new libUnidadesPeso();

	                    float libra = Float.parseFloat(textLibra.getText());
	                    float gramo = conversion.libratoGr(libra);
	                    textResLi.setText(String.valueOf(gramo));
	                } catch (NumberFormatException ex) {
	                    JOptionPane.showMessageDialog(null, "Ingrese un valor válido");
	                }
			}
		});
		btnLibra.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnLibra.setBounds(138, 36, 144, 21);
		contentPane.add(btnLibra);
		
		textResLi = new JTextField();
		textResLi.setColumns(10);
		textResLi.setBounds(312, 36, 96, 21);
		contentPane.add(textResLi);
		
		textOnza = new JTextField();
		textOnza.setColumns(10);
		textOnza.setBounds(10, 84, 96, 21);
		contentPane.add(textOnza);
		
		JButton btnOnza = new JButton("Onza a Gramo");
		btnOnza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				libUnidadesPeso conversion = new libUnidadesPeso();

                float onza = Float.parseFloat(textOnza.getText());
                float gramos = conversion.onzatoGr(onza);
                textResOz.setText(String.valueOf(gramos));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Ingrese un valor válido");
            }
			}
		});
		btnOnza.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnOnza.setBounds(138, 84, 144, 21);
		contentPane.add(btnOnza);
		
		textResOz = new JTextField();
		textResOz.setColumns(10);
		textResOz.setBounds(312, 85, 96, 21);
		contentPane.add(textResOz);
		
		textKilo = new JTextField();
		textKilo.setColumns(10);
		textKilo.setBounds(10, 138, 96, 21);
		contentPane.add(textKilo);
		
		JButton btnKilo = new JButton("Kilo a Gramo");
		btnKilo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					libUnidadesPeso conversion = new libUnidadesPeso();

	                float kilo = Float.parseFloat(textKilo.getText());
	                float gramos = conversion.kgtoGr(kilo);
	                textResKg.setText(String.valueOf(gramos));
	            } catch (NumberFormatException ex) {
	                JOptionPane.showMessageDialog(null, "Ingrese un valor válido");
	            }
			}
		});
		btnKilo.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnKilo.setBounds(138, 138, 144, 21);
		contentPane.add(btnKilo);
		
		textResKg = new JTextField();
		textResKg.setColumns(10);
		textResKg.setBounds(312, 139, 96, 21);
		contentPane.add(textResKg);
		
		textGramo = new JTextField();
		textGramo.setColumns(10);
		textGramo.setBounds(10, 186, 96, 21);
		contentPane.add(textGramo);
		
		JButton btnGramo = new JButton("Gramo a Kilo");
		btnGramo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					libUnidadesPeso conversion = new libUnidadesPeso();

	                float gramos = Float.parseFloat(textGramo.getText());
	                float kilo = conversion.grtoKg(gramos);
	                textResGr.setText(String.valueOf(kilo));
	            } catch (NumberFormatException ex) {
	                JOptionPane.showMessageDialog(null, "Ingrese un valor válido");
	            }	
			}
		});
		btnGramo.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGramo.setBounds(138, 186, 144, 21);
		contentPane.add(btnGramo);
		
		textResGr = new JTextField();
		textResGr.setColumns(10);
		textResGr.setBounds(312, 187, 96, 21);
		contentPane.add(textResGr);
		
		JButton btnRegresar = new JButton("< Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnRegresar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnRegresar.setBounds(10, 255, 152, 37);
		contentPane.add(btnRegresar);
	}
}
