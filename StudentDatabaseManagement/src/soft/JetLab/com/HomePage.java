package soft.JetLab.com;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.border.SoftBevelBorder;



import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JScrollPane;
import javax.swing.JTable;

public class HomePage extends JFrame {

	private JPanel contentPane;
	private JButton homeButton;
	private JButton studentInformation;
	private JButton recordButton;
	private JButton viewRecordButton;
	private JButton paymentHistoryButton;
	private JButton makePaymentButton;
	private JButton addStudentButton;
	private JButton deleteStudentButton;
	private JButton developerButton;
	private JButton closeButton;
	private JLabel lblTotalStudent;
	private JLabel label_1;
	private JLabel labelCounter;
	private JScrollPane scrollPane;
	private JTable table;
	String[] cols = {"Sl No","Student Name"};
	String[][] rows = new String [30][2];

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public HomePage() {
		setTitle("Coaching Center Management - \"Home\"");
        setIconImage(Toolkit.getDefaultToolkit().getImage(HomePage.class.getResource("/soft/JetLab/com/Student-3-icon.png")));
		//setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 100, 599, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		homeButton = new JButton("Home");
		homeButton.setBackground(new Color(0, 255, 0));
		homeButton.setBounds(10, 60, 131, 23);
		contentPane.add(homeButton);
		
		studentInformation = new JButton("Student Information");
		studentInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentInformationPage studentInformationPage = new StudentInformationPage();
				
				studentInformationPage.setVisible(true);
				studentInformationPage.setLocationRelativeTo(contentPane);
				dispose();
			}
		});
		studentInformation.setBounds(10, 94, 131, 23);
		contentPane.add(studentInformation);
		
		recordButton = new JButton("Record");
		recordButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RecordPage recordPage = new RecordPage();
				recordPage.setVisible(true);
				recordPage.setLocationRelativeTo(contentPane);
				dispose();
			}
		});
		recordButton.setBounds(10, 128, 131, 23);
		contentPane.add(recordButton);
		
		viewRecordButton = new JButton("View Record");
		viewRecordButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewRecordPage viewRecordPage = new ViewRecordPage();
				viewRecordPage.setVisible(true);
				dispose();
			}
		});
		viewRecordButton.setBounds(10, 162, 131, 23);
		contentPane.add(viewRecordButton);
		
		makePaymentButton = new JButton("Make Paymants");
		makePaymentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MakePaymentPage makePaymentPage = new MakePaymentPage();
				makePaymentPage.setVisible(true);
				makePaymentPage.setLocationRelativeTo(contentPane);
				dispose();
			}
		});
		makePaymentButton.setBounds(10, 196, 131, 23);
		contentPane.add(makePaymentButton);
		
		paymentHistoryButton = new JButton("Payment History");
		paymentHistoryButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PaymentHistoryPage paymentHistoryPage = new PaymentHistoryPage();
				paymentHistoryPage.setVisible(true);
				paymentHistoryPage.setLocationRelativeTo(contentPane);
				dispose();
			}
		});
		paymentHistoryButton.setBounds(10, 230, 131, 23);
		contentPane.add(paymentHistoryButton);
		
		addStudentButton = new JButton("Add Student");
		addStudentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddStudentPAge addStudentPAge = new AddStudentPAge();
				addStudentPAge.setVisible(true);
				addStudentPAge.setLocationRelativeTo(contentPane);
				dispose();
			}
		});
		addStudentButton.setBounds(10, 264, 131, 23);
		contentPane.add(addStudentButton);
		
		deleteStudentButton = new JButton("Delete Student");
		deleteStudentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteStudentPage deleteStudentPage = new DeleteStudentPage();
				deleteStudentPage.setVisible(true);
				deleteStudentPage.setLocationRelativeTo(contentPane);
				dispose();
			}
		});
		deleteStudentButton.setBounds(10, 298, 131, 23);
		contentPane.add(deleteStudentButton);
		
		closeButton = new JButton("Close");
		closeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		closeButton.setForeground(Color.WHITE);
		closeButton.setBackground(Color.RED);
		closeButton.setBounds(10, 366, 131, 23);
		contentPane.add(closeButton);
		
		developerButton = new JButton("Developer");
		developerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeveloperPage developerPage = new DeveloperPage();
				developerPage.setVisible(true);
				developerPage.setLocationRelativeTo(contentPane);
				dispose();
			}
		});
		developerButton.setBounds(10, 332, 131, 23);
		contentPane.add(developerButton);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(HomePage.class.getResource("/soft/JetLab/com/jetlab full extra small.png")));
		label.setBounds(10, 11, 131, 38);
		contentPane.add(label);
		
		lblTotalStudent = new JLabel("Total Student : ");
		lblTotalStudent.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotalStudent.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblTotalStudent.setBounds(255, 98, 167, 28);
		contentPane.add(lblTotalStudent);
		
		label_1 = new JLabel("");
		label_1.setBounds(374, 128, 48, 14);
		contentPane.add(label_1);
		
		labelCounter = new JLabel("0000");
		labelCounter.setFont(new Font("Times New Roman", Font.BOLD, 25));
		labelCounter.setBounds(421, 96, 118, 32);
		contentPane.add(labelCounter);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(192, 161, 351, 213);
		contentPane.add(scrollPane);
		addDataToTable();
		
		
	}
	
	void addDataToTable() {
		File pathFile = new File("C:\\Student_Database_JetLab\\Student_List.txt");
		int count = 0;
		try {
			int i = 0;
			
			FileReader reader = new FileReader(pathFile);
			Scanner scanner = new Scanner(reader);
			while(scanner.hasNext()) {
				rows[i][0] = ""+(i+1);
				rows[i][1] = scanner.nextLine();
				i++;
				count++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		labelCounter.setText(""+count);
		table = new JTable(rows,cols);
		table.setEnabled(false);
		scrollPane.setViewportView(table);
		
	}
}
