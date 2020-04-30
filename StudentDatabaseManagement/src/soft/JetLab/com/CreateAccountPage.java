package soft.JetLab.com;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;

public class CreateAccountPage extends JFrame {

	private JPanel contentPane;
	private JTextField textUserName;
	private JTextField textPass;
	private JTextField textConPass;
	private JButton btnCancel;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public CreateAccountPage() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CreateAccountPage.class.getResource("/soft/JetLab/com/Student-3-icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setBounds(100, 100, 287, 362);
		//setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(154, 205, 50));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("Enter Username");
		lblId.setForeground(new Color(255, 255, 255));
		lblId.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblId.setBounds(10, 28, 267, 14);
		contentPane.add(lblId);
		
		JLabel lblEnterAPassword = new JLabel("Enter a Password");
		lblEnterAPassword.setForeground(new Color(255, 255, 255));
		lblEnterAPassword.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblEnterAPassword.setBounds(10, 106, 267, 14);
		contentPane.add(lblEnterAPassword);
		
		textUserName = new JTextField();
		textUserName.setBackground(new Color(255, 255, 255));
		textUserName.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		textUserName.setBounds(10, 53, 267, 31);
		contentPane.add(textUserName);
		textUserName.setColumns(10);
		
		textPass = new JTextField();
		textPass.setBackground(new Color(255, 255, 255));
		textPass.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		textPass.setBounds(10, 131, 267, 31);
		contentPane.add(textPass);
		textPass.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Confirm Password");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblNewLabel.setBounds(10, 184, 267, 14);
		contentPane.add(lblNewLabel);
		
		textConPass = new JTextField();
		textConPass.setBackground(new Color(255, 255, 255));
		textConPass.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		textConPass.setBounds(10, 209, 267, 31);
		contentPane.add(textConPass);
		textConPass.setColumns(10);
		
		JButton btnCreateAccount = new JButton("Create Account");
		btnCreateAccount.setForeground(new Color(255, 255, 255));
		btnCreateAccount.setBackground(new Color(0, 128, 0));
		btnCreateAccount.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		btnCreateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File passFile = new File("c:\\Student_Database_JetLab\\password.txt");
				String nameString = textUserName.getText();
				String passString = textPass.getText();
				String conPassString = textConPass.getText();
				if(passString.equals(conPassString)) {
					try {
						passFile.createNewFile();
						FileWriter fileWriter = new FileWriter(passFile, true);
						fileWriter.write(nameString+"\n");
						fileWriter.write(passString);
						fileWriter.close();
						dispose();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else {
					JOptionPane.showMessageDialog(contentPane, "Password doesn't match!");
				}
				
			}
		});
		btnCreateAccount.setBounds(11, 251, 266, 31);
		contentPane.add(btnCreateAccount);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setForeground(new Color(255, 255, 255));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setBackground(Color.RED);
		btnCancel.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		btnCancel.setBounds(11, 295, 266, 31);
		contentPane.add(btnCancel);
	}
}
