package soft.JetLab.com;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.channels.NonReadableChannelException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class LogInPage extends JFrame {

	private JPanel contentPane;
	private JTextField textUserName;
	private JPasswordField passwordField;
	JLabel lblCreateAccount = new JLabel("Create account?");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@SuppressWarnings("unused")
			public void run() {
				File filePathFile = new File("C:\\Student_Database_JetLab");
				File listPathFile = new File("C:\\Student_Database_JetLab\\Student_List.txt");
				if(!filePathFile.exists()) {
					filePathFile.mkdir();
				}
				if(!listPathFile.exists()) {
					try {
						listPathFile.createNewFile();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				try {
					LogInPage frame = new LogInPage();
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
	public LogInPage() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(LogInPage.class.getResource("/soft/JetLab/com/Student-3-icon.png")));
		setTitle("Log In or Create Account");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 100, 599, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		JLabel lblUserNAme = new JLabel("Username");
		lblUserNAme.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUserNAme.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblUserNAme.setBounds(267, 182, 123, 14);
		contentPane.add(lblUserNAme);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblPassword.setBounds(267, 238, 123, 14);
		contentPane.add(lblPassword);
		
		textUserName = new JTextField();
		textUserName.setHorizontalAlignment(SwingConstants.CENTER);
		textUserName.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		textUserName.setBounds(400, 176, 173, 30);
		contentPane.add(textUserName);
		textUserName.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		passwordField.setBounds(400, 232, 173, 30);
		contentPane.add(passwordField);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = null, pass = null;
				File file = new File("C:\\Student_Database_JetLab\\password.txt");
				if(file.exists()) {
						
						try {
							FileReader fileReader = new FileReader("C:\\Student_Database_JetLab\\password.txt");
					        Scanner scan = new Scanner(fileReader);
					        while(scan.hasNext()){
					            id = scan.nextLine();
					            pass = scan.nextLine();
					            
					        }
					        fileReader.close();
					        String idString = textUserName.getText();
							String passString = new String(passwordField.getPassword());
							if(idString.equals(id) && passString.equals(pass)) {
								HomePage homePage = new HomePage();
								homePage.setLocationRelativeTo(contentPane);
								homePage.setVisible(true);
								dispose();
							}else {
								JOptionPane.showMessageDialog(contentPane, "Wrong ID or Password.");
							}
					    } catch (IOException ee) {
					        System.out.println(ee);
					    }
					}else {
						textUserName.setText(null);
						passwordField.setText(null);
						JOptionPane.showMessageDialog(contentPane, "Please, create an account.");
					}
				}
		});
		btnLogIn.setBackground(new Color(0, 128, 0));
		btnLogIn.setForeground(Color.WHITE);
		btnLogIn.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		btnLogIn.setBounds(267, 284, 306, 33);
		contentPane.add(btnLogIn);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBackground(Color.RED);
		btnClose.setForeground(Color.WHITE);
		btnClose.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		btnClose.setBounds(267, 334, 306, 33);
		contentPane.add(btnClose);
		
		
		lblCreateAccount.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				String id = null, pass = null;
				File file = new File("C:\\Student_Database_JetLab\\password.txt");
				
				if(file.exists()) {
					JOptionPane.showMessageDialog(contentPane, "Multiple account doesn't support.");
				}else {
					CreateAccountPage createAccountPage = new CreateAccountPage();
					createAccountPage.setLocationRelativeTo(contentPane);
					createAccountPage.setVisible(true);
				}
			}
		});
		lblCreateAccount.setFont(new Font("Trebuchet MS", Font.ITALIC, 15));
		lblCreateAccount.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCreateAccount.setBounds(420, 378, 152, 14);
		contentPane.add(lblCreateAccount);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 258, 403);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(LogInPage.class.getResource("/soft/JetLab/com/bigstock-Portrait-Of-Asian-Teacher-In-F-273747487.jpg")));
		label.setBounds(0, 0, 258, 403);
		panel.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setIcon(new ImageIcon(LogInPage.class.getResource("/soft/JetLab/com/jetlab full small.png")));
		label_1.setBounds(281, 11, 292, 111);
		contentPane.add(label_1);
	}
}
