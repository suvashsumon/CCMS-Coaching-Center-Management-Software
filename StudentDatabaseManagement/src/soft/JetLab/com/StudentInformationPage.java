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
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JList;
import java.awt.Choice;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Insets;

public class StudentInformationPage extends JFrame {

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
	private JLabel lblNameAtikur;
	private JButton btnOk;
	private JLabel lblClass;
	private JLabel lblSubjectPhysicsmath;
	private JLabel lblPhoneNo;
	private JLabel lblAddressDurgapur;
	private JLabel lblTeachingPlace;
	private JLabel lblStartDate;
	private Choice choice;
	private JLabel lblDealAmount;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public StudentInformationPage() {
		setTitle("Coaching Center Management - \"Student Information\"");
        setIconImage(Toolkit.getDefaultToolkit().getImage(StudentInformationPage.class.getResource("/soft/JetLab/com/Student-3-icon.png")));

		//setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 100, 599, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		homeButton = new JButton("Home");
		homeButton.setMargin(new Insets(0, 0, 0, 0));
		homeButton.setAlignmentY(0.0f);
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
		studentInformation.setMargin(new Insets(0, 0, 0, 0));
		studentInformation.setAlignmentY(0.0f);
		studentInformation.setBackground(new Color(0, 255, 0));
		studentInformation.setBounds(10, 94, 131, 23);
		contentPane.add(studentInformation);
		
		recordButton = new JButton("Record");
		recordButton.setMargin(new Insets(0, 0, 0, 0));
		recordButton.setAlignmentY(0.0f);
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
		viewRecordButton.setMargin(new Insets(0, 0, 0, 0));
		viewRecordButton.setAlignmentY(0.0f);
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
		makePaymentButton.setMargin(new Insets(0, 0, 0, 0));
		makePaymentButton.setAlignmentY(0.0f);
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
		paymentHistoryButton.setMargin(new Insets(0, 0, 0, 0));
		paymentHistoryButton.setAlignmentY(0.0f);
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
		addStudentButton.setMargin(new Insets(0, 0, 0, 0));
		addStudentButton.setAlignmentY(0.0f);
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
		deleteStudentButton.setMargin(new Insets(0, 0, 0, 0));
		deleteStudentButton.setAlignmentY(0.0f);
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
		closeButton.setMargin(new Insets(0, 0, 0, 0));
		closeButton.setAlignmentY(0.0f);
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
		developerButton.setMargin(new Insets(0, 0, 0, 0));
		developerButton.setAlignmentY(0.0f);
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
		label.setIcon(new ImageIcon(StudentInformationPage.class.getResource("/soft/JetLab/com/jetlab full extra small.png")));
		label.setBounds(10, 11, 131, 38);
		contentPane.add(label);
		
		lblNameAtikur = new JLabel("");
		lblNameAtikur.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblNameAtikur.setBounds(325, 112, 219, 23);
		contentPane.add(lblNameAtikur);
		
		choice = new Choice();
		choice.setFont(new Font("Lucida Fax", Font.PLAIN, 15));
		choice.setBounds(217, 49, 180, 20);
		choiceList();
		contentPane.add(choice);
		
		btnOk = new JButton("OK");
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string = choice.getSelectedItem();
				showDeta(string);
			}
		});
		btnOk.setBounds(471, 49, 89, 23);
		contentPane.add(btnOk);
		
		lblClass = new JLabel("");
		lblClass.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblClass.setBounds(325, 146, 219, 23);
		contentPane.add(lblClass);
		
		lblSubjectPhysicsmath = new JLabel("");
		lblSubjectPhysicsmath.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblSubjectPhysicsmath.setBounds(325, 173, 219, 23);
		contentPane.add(lblSubjectPhysicsmath);
		
		lblPhoneNo = new JLabel("");
		lblPhoneNo.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblPhoneNo.setBounds(325, 205, 219, 14);
		contentPane.add(lblPhoneNo);
		
		lblAddressDurgapur = new JLabel("");
		lblAddressDurgapur.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblAddressDurgapur.setBounds(325, 232, 219, 21);
		contentPane.add(lblAddressDurgapur);
		
		lblTeachingPlace = new JLabel("");
		lblTeachingPlace.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblTeachingPlace.setBounds(325, 266, 219, 21);
		contentPane.add(lblTeachingPlace);
		
		lblStartDate = new JLabel("");
		lblStartDate.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblStartDate.setBounds(325, 300, 219, 21);
		contentPane.add(lblStartDate);
		
		lblDealAmount = new JLabel("");
		lblDealAmount.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblDealAmount.setBounds(325, 331, 219, 20);
		contentPane.add(lblDealAmount);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblName.setBounds(165, 112, 136, 23);
		contentPane.add(lblName);
		
		JLabel lblClass_2 = new JLabel("Class :");
		lblClass_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblClass_2.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblClass_2.setBounds(165, 146, 136, 23);
		contentPane.add(lblClass_2);
		
		JLabel lblSubject = new JLabel("Subject :");
		lblSubject.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSubject.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblSubject.setBounds(165, 173, 136, 23);
		contentPane.add(lblSubject);
		
		JLabel lblPhoneNo_1 = new JLabel("Phone No :");
		lblPhoneNo_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPhoneNo_1.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblPhoneNo_1.setBounds(165, 205, 136, 14);
		contentPane.add(lblPhoneNo_1);
		
		JLabel lblAddress = new JLabel("Address :");
		lblAddress.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAddress.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblAddress.setBounds(165, 232, 136, 21);
		contentPane.add(lblAddress);
		
		JLabel lblTeachingPlace_1 = new JLabel("Teaching Place :");
		lblTeachingPlace_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTeachingPlace_1.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblTeachingPlace_1.setBounds(165, 266, 136, 21);
		contentPane.add(lblTeachingPlace_1);
		
		JLabel lblStartDate_1 = new JLabel("Start Date :");
		lblStartDate_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStartDate_1.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblStartDate_1.setBounds(165, 300, 136, 21);
		contentPane.add(lblStartDate_1);
		
		JLabel lblDealAmount_1 = new JLabel("Deal Amount :");
		lblDealAmount_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDealAmount_1.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblDealAmount_1.setBounds(165, 331, 136, 20);
		contentPane.add(lblDealAmount_1);
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
	
	void showDeta(String studentName) {
		String pathString = "C:\\Student_Database_JetLab\\"+studentName+".txt";
		File inputFile = new File(pathString);
        try {
            FileReader fileReader = new FileReader(inputFile);
            try {
                Scanner scan = new Scanner(fileReader);
                while(scan.hasNext()){
                    String nameString = scan.nextLine();
                    String classString = scan.nextLine();
                    String subjectString = scan.nextLine();
                    String phoneString = scan.nextLine();
                    String addressString = scan.nextLine();
                    String techPlaceString = scan.nextLine();
                    String startDateString = scan.nextLine();
                    String dealAmountString = scan.nextLine();
                    lblNameAtikur.setText(""+nameString);
                    lblClass.setText(""+classString);
                    lblSubjectPhysicsmath.setText(""+subjectString);
                    lblPhoneNo.setText(""+phoneString);
                    lblAddressDurgapur.setText(""+addressString);
                    lblTeachingPlace.setText(""+techPlaceString);
                    lblStartDate.setText(""+startDateString);
                    lblDealAmount.setText(""+dealAmountString);
                }
                fileReader.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
	}
}
