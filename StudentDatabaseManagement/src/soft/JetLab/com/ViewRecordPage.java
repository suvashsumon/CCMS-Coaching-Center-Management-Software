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
import java.awt.Button;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTextField;

public class ViewRecordPage extends JFrame {

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
	private JLabel lblMonth;
	private Choice choiceStudentId;
	private Choice choiceMonth;
	private JTable table;
	String[] cols = {"SL","Month", "Year", "Date"};
	String[][] rows = new String [31][4];
	private JScrollPane scrollPane;
	private JTextField txtYear;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public ViewRecordPage() {
		setTitle("Caching Center Management - \"View Record\"");
        setIconImage(Toolkit.getDefaultToolkit().getImage(ViewRecordPage.class.getResource("/soft/JetLab/com/Student-3-icon.png")));

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
		viewRecordButton.setBackground(new Color(0, 255, 0));
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
				dispose();
			}
		});
		developerButton.setBounds(10, 332, 131, 23);
		contentPane.add(developerButton);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(ViewRecordPage.class.getResource("/soft/JetLab/com/jetlab full extra small.png")));
		label.setBounds(10, 11, 131, 38);
		contentPane.add(label);
		
		lblStudentId = new JLabel("Student Id");
		lblStudentId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStudentId.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblStudentId.setBounds(183, 64, 89, 14);
		contentPane.add(lblStudentId);
		
		lblMonth = new JLabel("Month");
		lblMonth.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMonth.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblMonth.setBounds(183, 98, 89, 14);
		contentPane.add(lblMonth);
		
		choiceStudentId = new Choice();
		choiceStudentId.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		choiceStudentId.setBounds(303, 63, 181, 20);
		contentPane.add(choiceStudentId);
		choiceList();
		
		choiceMonth = new Choice();
		choiceMonth.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		choiceMonth.setBounds(303, 94, 181, 20);
		contentPane.add(choiceMonth);
		choiceMonth.add("January");
		choiceMonth.add("February");
		choiceMonth.add("March");
		choiceMonth.add("April");
		choiceMonth.add("May");
		choiceMonth.add("Jun");
		choiceMonth.add("July");
		choiceMonth.add("August");
		choiceMonth.add("September");
		choiceMonth.add("October");
		choiceMonth.add("November");
		choiceMonth.add("December");
		
		JButton btnView = new JButton("View");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeArrey();
				String nameString = choiceStudentId.getSelectedItem();
				String monthString = choiceMonth.getSelectedItem();
				String yearString = txtYear.getText();
				addDataToTable(nameString, monthString, yearString);
			}
		});
		btnView.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnView.setBounds(395, 160, 89, 23);
		contentPane.add(btnView);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(184, 200, 369, 189);
		contentPane.add(scrollPane);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setHorizontalAlignment(SwingConstants.RIGHT);
		lblYear.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblYear.setBounds(193, 132, 79, 14);
		contentPane.add(lblYear);
		
		txtYear = new JTextField();
		txtYear.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtYear.setBounds(303, 129, 181, 23);
		contentPane.add(txtYear);
		txtYear.setColumns(10);
		
		
	}
	
	void choiceList() {
		File inputFile = new File("C:\\Student_Database_JetLab\\Student_List.txt");
        try {
            FileReader fileReader = new FileReader(inputFile);
            try {
                Scanner scan = new Scanner(fileReader);
                while(scan.hasNext()){
                    String t = scan.nextLine();
                    choiceStudentId.add(t);
                }
                fileReader.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
	}
	void addDataToTable(String name, String month, String year) {
		File pathFile = new File("C:\\Student_Database_JetLab\\"+name+"\\Class_Record.txt");
		int i = 0;
		try {
			
			FileReader fileReader = new FileReader(pathFile);
			Scanner scanner = new Scanner(fileReader);
			while(scanner.hasNext()) {
				String dateString = scanner.nextLine();
				String monthString = scanner.nextLine();
				String yearString = scanner.nextLine();
				if(monthString.equalsIgnoreCase(month) && year.equals(yearString)) {
					rows[i][0] = ""+(i+1);
					rows[i][1] = monthString;
					rows[i][2] = yearString;
					rows[i][3] = dateString;
					
					i = i + 1;
				}
				
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
			for(int j=0; j<4; j++) {
				rows[i][j] = "";
			}
		}
	}
}
