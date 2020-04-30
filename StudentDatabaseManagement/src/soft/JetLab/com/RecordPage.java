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
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Choice;
import java.awt.Font;
import java.awt.Toolkit;

public class RecordPage extends JFrame {

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
	private JLabel lblDate;
	private JTextField txtDateText;
	private JTextField txtYear;
	private Choice choice;
	private JButton btnInsart;
	private JLabel massegeLabel;
	private JButton btnClear;
	private Choice choiceMonth;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public RecordPage() {
		setTitle("Coaching Center Management - \"Record Page\"");
        setIconImage(Toolkit.getDefaultToolkit().getImage(RecordPage.class.getResource("/soft/JetLab/com/Student-3-icon.png")));

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
		recordButton.setBackground(new Color(0, 255, 0));
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
		label.setIcon(new ImageIcon(RecordPage.class.getResource("/soft/JetLab/com/jetlab full extra small.png")));
		label.setBounds(10, 11, 131, 38);
		contentPane.add(label);
		
		lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblDate.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDate.setBounds(210, 137, 100, 14);
		contentPane.add(lblDate);
		
		txtDateText = new JTextField();
		txtDateText.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtDateText.setBounds(337, 131, 179, 20);
		contentPane.add(txtDateText);
		txtDateText.setColumns(10);
		
		JLabel lblMonth = new JLabel("Month");
		lblMonth.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblMonth.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMonth.setBounds(210, 171, 100, 14);
		contentPane.add(lblMonth);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblYear.setHorizontalAlignment(SwingConstants.RIGHT);
		lblYear.setBounds(210, 205, 100, 14);
		contentPane.add(lblYear);
		
		txtYear = new JTextField();
		txtYear.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtYear.setBounds(337, 199, 179, 20);
		contentPane.add(txtYear);
		txtYear.setColumns(10);
		
		choice = new Choice();
		choice.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		choice.setBounds(337, 99, 179, 20);
		choiceList();
		contentPane.add(choice);
		
		JLabel lblStudent = new JLabel("Student");
		lblStudent.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblStudent.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStudent.setBounds(210, 103, 100, 14);
		contentPane.add(lblStudent);
		
		btnInsart = new JButton("Insart");
		btnInsart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string = choice.getSelectedItem();
				dataInsarted(string);
			}
		});
		btnInsart.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnInsart.setBounds(427, 262, 89, 23);
		contentPane.add(btnInsart);
		
		massegeLabel = new JLabel("");
		massegeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		massegeLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		massegeLabel.setBounds(210, 336, 306, 14);
		contentPane.add(massegeLabel);
		
		btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDateText.setText(null);
				txtYear.setText(null);
				massegeLabel.setText(null);
			}
		});
		btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnClear.setBounds(268, 264, 89, 23);
		contentPane.add(btnClear);
		
		choiceMonth = new Choice();
		choiceMonth.setBounds(337, 165, 179, 20);
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
	void dataInsarted(String string) {
		String filePathString = "C:\\Student_Database_JetLab\\"+string+"\\Class_Record.txt";
        File outputFile = new File(filePathString);
        
        try {
                FileWriter fileWriter = new FileWriter(outputFile, true);
                
                String dateString = txtDateText.getText();
                fileWriter.write(dateString+"\n");
                String monthString = choiceMonth.getSelectedItem();
                fileWriter.write(monthString+"\n");
                String yearString = txtYear.getText();
                fileWriter.write(yearString+"\n");
                
                fileWriter.close();
                JOptionPane.showMessageDialog(null, "Data Insarted Successfully.");
                
            } catch (IOException e) {
                System.out.println(e);
            }
	}
}
