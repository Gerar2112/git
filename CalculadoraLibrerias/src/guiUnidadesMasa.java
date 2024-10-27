import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class guiUnidadesMasa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtLibra;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					guiUnidadesMasa frame = new guiUnidadesMasa();
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
	public guiUnidadesMasa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 605);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtLibra = new JTextField();
		txtLibra.setToolTipText("");
		txtLibra.setBounds(19, 47, 96, 19);
		contentPane.add(txtLibra);
		txtLibra.setColumns(10);
		
		JButton btnNewButton = new JButton("Libra a Gramo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(149, 46, 133, 21);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(311, 47, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
