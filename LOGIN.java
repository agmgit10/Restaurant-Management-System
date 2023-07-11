import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LOGIN {

	private JFrame login_frame;
	private JTextField textField;
	private JPasswordField textPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOGIN window = new LOGIN();
					window.login_frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LOGIN() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		login_frame = new JFrame();
		login_frame.setBounds(200, 200, 638, 442);
		login_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		login_frame.getContentPane().setLayout(null);
		
		JLabel lblLogn = new JLabel("LOGIN");
		lblLogn.setBounds(272, 38, 86, 37);
		login_frame.getContentPane().add(lblLogn);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(115, 110, 98, 20);
		login_frame.getContentPane().add(lblNewLabel);
		
		JLabel Password = new JLabel("Password");
		Password.setBounds(115, 172, 69, 20);
		login_frame.getContentPane().add(Password);
		
		textField = new JTextField();
		textField.setBounds(246, 107, 170, 26);
		login_frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textPassword = new JPasswordField();
		textPassword.setBounds(246, 164, 170, 37);
		login_frame.getContentPane().add(textPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String password = textPassword.getText();
				String username = textField.getText();

				if(password.contains("ezgi")&& username.contains("ezgi"))
				{
					textField.setText(null);
					textPassword.setText(null);
				}
				
				else
				{
					JOptionPane.showMessageDialog(null,"Error","Wrong Login Information",JOptionPane.ERROR_MESSAGE);
					textField.setText(null);
					textPassword.setText(null);
				}
			}
		});
		btnLogin.setBounds(44, 256, 140, 44);
		login_frame.getContentPane().add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
				textPassword.setText(null);
			}
		});
		btnReset.setBounds(216, 256, 129, 44);
		login_frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				login_frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(login_frame, "Sure about exitting","LOGIN",JOptionPane.YES_NO_OPTION) ==JOptionPane.YES_NO_OPTION )
				{
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(388, 253, 140, 47);
		login_frame.getContentPane().add(btnExit);
	}
}
