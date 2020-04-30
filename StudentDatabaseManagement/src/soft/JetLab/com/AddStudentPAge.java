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
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Toolkit;

public class AddStudentPAge extends JFrame {

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
	private JLabel lblStudentName;
	private JLabel lblClass;
	private JLabel lblPhoneNo;
	private JLabel lblAddress;
	private JLabel lblSubject;
	private JLabel lblTeachingPlace;
	private JLabel lblStartDate;
	private JLabel lblDealAmount;
	private JTextField txtStudentId;
	private JTextField txtStudentName;
	private JTextField txtClass;
	private JTextField txtPhoneNo;
	private JTextField txtAddress;
	private JTextField txtSubject;
	private JTextField txtTeachingPlace;
	private JTextField txtStartDate;
	private JTextField txtDealAmount;
	private JButton btnAdd;
	private JButton btnClear;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public AddStudentPAge() {
		setTitle("Coaching Center Management - \"Add Student\"");
		setBackground(Color.BLUE);
        setIconImage(Toolkit.getDefaultToolkit().getImage(AddStudentPAge.class.getResource("/soft/JetLab/com/Student-3-icon.png")));
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
		addStudentButton.setBackground(new Color(0, 255, 0));
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
		label.setIcon(new ImageIcon(AddStudentPAge.class.getResource("/soft/JetLab/com/jetlab full extra small.png")));
		label.setBounds(10, 11, 131, 38);
		contentPane.add(label);
		
		lblStudentId = new JLabel("Student Id");
		lblStudentId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStudentId.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblStudentId.setBounds(214, 64, 95, 14);
		contentPane.add(lblStudentId);
		
		lblStudentName = new JLabel("Student Name");
		lblStudentName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStudentName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblStudentName.setBounds(214, 98, 95, 14);
		contentPane.add(lblStudentName);
		
		lblClass = new JLabel("Class");
		lblClass.setHorizontalAlignment(SwingConstants.RIGHT);
		lblClass.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblClass.setBounds(214, 132, 95, 14);
		contentPane.add(lblClass);
		
		lblPhoneNo = new JLabel("Phone No");
		lblPhoneNo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPhoneNo.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblPhoneNo.setBounds(214, 166, 95, 14);
		contentPane.add(lblPhoneNo);
		
		lblAddress = new JLabel("Address");
		lblAddress.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAddress.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblAddress.setBounds(214, 196, 95, 23);
		contentPane.add(lblAddress);
		
		lblSubject = new JLabel("Subject");
		lblSubject.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSubject.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblSubject.setBounds(214, 230, 95, 23);
		contentPane.add(lblSubject);
		
		lblTeachingPlace = new JLabel("Teaching Place");
		lblTeachingPlace.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTeachingPlace.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblTeachingPlace.setBounds(214, 268, 95, 14);
		contentPane.add(lblTeachingPlace);
		
		lblStartDate = new JLabel("Start Date");
		lblStartDate.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStartDate.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblStartDate.setBounds(214, 302, 95, 14);
		contentPane.add(lblStartDate);
		
		lblDealAmount = new JLabel("Deal Amount");
		lblDealAmount.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDealAmount.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblDealAmount.setBounds(214, 336, 95, 14);
		contentPane.add(lblDealAmount);
		
		txtStudentId = new JTextField();
		txtStudentId.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtStudentId.setBounds(335, 63, 211, 20);
		contentPane.add(txtStudentId);
		txtStudentId.setColumns(10);
		
		txtStudentName = new JTextField();
		txtStudentName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtStudentName.setBounds(335, 95, 211, 20);
		contentPane.add(txtStudentName);
		txtStudentName.setColumns(10);
		
		txtClass = new JTextField();
		txtClass.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtClass.setBounds(335, 129, 211, 20);
		contentPane.add(txtClass);
		txtClass.setColumns(10);
		
		txtPhoneNo = new JTextField();
		txtPhoneNo.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtPhoneNo.setBounds(335, 163, 211, 20);
		contentPane.add(txtPhoneNo);
		txtPhoneNo.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtAddress.setBounds(335, 197, 211, 20);
		contentPane.add(txtAddress);
		txtAddress.setColumns(10);
		
		txtSubject = new JTextField();
		txtSubject.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtSubject.setBounds(335, 231, 211, 20);
		contentPane.add(txtSubject);
		txtSubject.setColumns(10);
		
		txtTeachingPlace = new JTextField();
		txtTeachingPlace.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtTeachingPlace.setBounds(335, 265, 211, 20);
		contentPane.add(txtTeachingPlace);
		txtTeachingPlace.setColumns(10);
		
		txtStartDate = new JTextField();
		txtStartDate.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtStartDate.setBounds(335, 299, 211, 20);
		contentPane.add(txtStartDate);
		txtStartDate.setColumns(10);
		
		txtDealAmount = new JTextField();
		txtDealAmount.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtDealAmount.setBounds(335, 333, 211, 20);
		contentPane.add(txtDealAmount);
		txtDealAmount.setColumns(10);
		
		btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String studentIdString = txtStudentId.getText();
				String studentNameString = txtStudentName.getText();
				String classString = txtClass.getText();
				String phoneNoString = txtPhoneNo.getText();
				String addressString = txtAddress.getText();
				String subjectString = txtSubject.getText();
				String techPlaceString = txtTeachingPlace.getText();
				String startDateString = txtStartDate.getText();
				String dealAmountString = txtDealAmount.getText();
				File folder = new File("C:\\Student_Database_JetLab\\"+studentIdString);
				folder.mkdir();
				File classRecordFile = new File("C:\\Student_Database_JetLab\\"+studentIdString+"\\Class_Record.txt");
				File paymentFile = new File("C:\\Student_Database_JetLab\\"+studentIdString+"\\Payment_Record.txt");
				File detailFile = new File("C:\\Student_Database_JetLab\\"+studentIdString+".txt");
				try {
					classRecordFile.createNewFile();
					paymentFile.createNewFile();
					detailFile.createNewFile();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try {
	                FileWriter fileWriter = new FileWriter("C:\\Student_Database_JetLab\\"+studentIdString+".txt", true);
	                FileWriter nameUpWriter = new FileWriter("C:\\Student_Database_JetLab\\Student_List.txt", true);
	                //FileWriter paymentWriter = new FileWriter("C:\\Users\\USER\\Desktop\\Student_Database_File\\Payment_file.txt", true);
	                
	                fileWriter.write(studentNameString+"\n");
	                fileWriter.write(classString+"\n");
	                fileWriter.write(subjectString+"\n");
	                fileWriter.write(phoneNoString+"\n");
	                fileWriter.write(addressString+"\n");
	                fileWriter.write(techPlaceString+"\n");
	                fileWriter.write(startDateString+"\n");
	                fileWriter.write(dealAmountString+"\n");
	                fileWriter.close();
	                nameUpWriter.write(studentIdString+"\n");
	                //paymentWriter.write(dealAmountString+"\n");
	                nameUpWriter.close();
	                //paymentWriter.close();
	                JOptionPane.showMessageDialog(null, "Student Added Successfully.");
	            } catch (IOException em) {
	                System.out.println(em);
	            }
				
			}
		});
		btnAdd.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnAdd.setBounds(457, 366, 89, 23);
		contentPane.add(btnAdd);
		
		btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtAddress.setText(null);
				txtClass.setText(null);
				txtDealAmount.setText(null);
				txtPhoneNo.setText(null);
				txtStartDate.setText(null);
				txtStudentId.setText(null);
				txtStudentName.setText(null);
				txtSubject.setText(null);
				txtTeachingPlace.setText(null);
			}
		});
		btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnClear.setBounds(335, 366, 89, 23);
		contentPane.add(btnClear);
	}
}
