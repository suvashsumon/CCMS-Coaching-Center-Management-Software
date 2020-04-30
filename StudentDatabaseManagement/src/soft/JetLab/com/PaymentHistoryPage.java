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
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Choice;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class PaymentHistoryPage extends JFrame {

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
	private JLabel lblStudentId;
	private Choice choice;
	private JButton btnView;
	private JScrollPane scrollPane;
	private JTable table;
	String[] cols = {"Month", "Pay Date", "Amount"};
	String[][] rows = new String [60][3];

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public PaymentHistoryPage() {
		setTitle("Coaching Center Management - \"Payment History\"");
        setIconImage(Toolkit.getDefaultToolkit().getImage(PaymentHistoryPage.class.getResource("/soft/JetLab/com/Student-3-icon.png")));

		//setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 100, 599, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		homeButton = new JButton("Home");
		homeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage homePage = new HomePage();
				homePage.setVisible(true);
				homePage.setLocationRelativeTo(contentPane);
				dispose();
			}
		});
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
				viewRecordPage.setLocationRelativeTo(contentPane);
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
		paymentHistoryButton.setBackground(new Color(0, 255, 0));
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
		label.setIcon(new ImageIcon(PaymentHistoryPage.class.getResource("/soft/JetLab/com/jetlab full extra small.png")));
		label.setBounds(10, 11, 131, 38);
		contentPane.add(label);
		
		lblStudentId = new JLabel("Student Id");
		lblStudentId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStudentId.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblStudentId.setBounds(189, 94, 88, 18);
		contentPane.add(lblStudentId);
		
		choice = new Choice();
		choice.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		choice.setBounds(297, 94, 194, 20);
		contentPane.add(choice);
		choiceList();
		
		btnView = new JButton("View");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeArrey();
				String nameString = choice.getSelectedItem();
				addDataToTable(nameString);
			}
		});
		btnView.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnView.setBounds(349, 139, 89, 23);
		contentPane.add(btnView);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(189, 196, 341, 178);
		contentPane.add(scrollPane);
		
		
	}
	
	void choiceList() {
		File inputFile = new File("C:\\Student_Database_JetLab\\Student_List.txt");
        try {
            FileReader fileReader = new FileReader(inputFile);
            try {
                Scanner scan = new Scanner(fileReader);
                while(scan.hasNext()){
                    String t = scan.nextLine();
                    choice.add(t);
                }
                fileReader.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
	}
	
	void addDataToTable(String name) {
		File pathFile = new File("C:\\Student_Database_JetLab\\"+name+"\\Payment_Record.txt");
		int i = 0;
		try {
			
			FileReader fileReader = new FileReader(pathFile);
			Scanner scanner = new Scanner(fileReader);
			while(scanner.hasNext()) {
				String dateString = scanner.nextLine();
				String monthString = scanner.nextLine();
				String amountString = scanner.nextLine();
				
				rows[i][0] = monthString;
				rows[i][1] = dateString;
				rows[i][2] = amountString;
					
				i = i + 1;
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		table = new JTable(rows,cols);

		scrollPane.setViewportView(table);
		table.setEnabled(false);
		
	}
	void removeArrey() {
		for(int i = 0; i<31; i++) {
			for(int j=0; j<3; j++) {
				rows[i][j] = "";
			}
		}
	}
}
