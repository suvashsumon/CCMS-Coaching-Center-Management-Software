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
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Choice;
import java.awt.Button;

public class DeleteStudentPage extends JFrame {

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
	private JButton btnDelete;
	private JLabel lblMassege;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public DeleteStudentPage() {
		setTitle("Coaching Center Management - \"Delete Student\"");
        setIconImage(Toolkit.getDefaultToolkit().getImage(DeleteStudentPage.class.getResource("/soft/JetLab/com/Student-3-icon.png")));
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
		addStudentButton.setBounds(10, 264, 131, 23);
		contentPane.add(addStudentButton);
		
		deleteStudentButton = new JButton("Delete Student");
		deleteStudentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		deleteStudentButton.setBackground(new Color(0, 255, 0));
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
		label.setIcon(new ImageIcon(DeleteStudentPage.class.getResource("/soft/JetLab/com/jetlab full extra small.png")));
		label.setBounds(10, 11, 131, 38);
		contentPane.add(label);
		
		lblStudentId = new JLabel("Student Id");
		lblStudentId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStudentId.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblStudentId.setBounds(197, 132, 108, 19);
		contentPane.add(lblStudentId);
		
		choice = new Choice();
		choice.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		choice.setBounds(329, 131, 211, 20);
		contentPane.add(choice);
		choiceList();
		
		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String studentIdString = choice.getSelectedItem();
				int confirm = JOptionPane.showConfirmDialog(null, "Are you sure?");
				if(confirm == 0) {
					deleteStudentRecord(studentIdString);
				}
				
			}
		});
		btnDelete.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnDelete.setBounds(311, 196, 89, 23);
		contentPane.add(btnDelete);
		
		lblMassege = new JLabel("");
		lblMassege.setForeground(Color.RED);
		lblMassege.setHorizontalAlignment(SwingConstants.CENTER);
		lblMassege.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblMassege.setBounds(197, 312, 343, 23);
		contentPane.add(lblMassege);
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
	
	void deleteStudentRecord(String studentID) {
		File pathFile = new File("C:\\Student_Database_JetLab\\"+studentID);
		File infoFile = new File("C:\\Student_Database_JetLab\\"+studentID+".txt");
		String pathString = "C:\\Student_Database_JetLab\\Student_List.txt";
		String[]entries = pathFile.list();
		for(String s: entries){
		    File currentFile = new File(pathFile.getPath(),s);
		    currentFile.delete();
		}
		deleteFromList(studentID, pathString);
		pathFile.delete();
		infoFile.delete();
		
		lblMassege.setText("All Record of this Student has been deleted...");
	}
	void deleteFromList(String studentIdString, String file) {
		File pathFile = new File(file);
		String[] liStrings = new String[20];
		int i = 0;
		int lol = 0;
		try {
			FileReader fileReader = new FileReader(pathFile);
			try {
				FileWriter fileWriter = new FileWriter(pathFile,true);
				Scanner scanner = new Scanner(fileReader);
				while(scanner.hasNext()) {
					liStrings[i] = scanner.nextLine();
					i++;
					lol++;
					//System.out.println(lol);
					//System.out.println(i);
				}
				fileReader.close();
				FileWriter deleter = new FileWriter(pathFile);
				deleter.write("");
				deleter.close();
				//System.out.println(lol);
				for(int j=0; j<lol; j++) {
					if(!liStrings[j].equalsIgnoreCase(studentIdString))
					fileWriter.write(liStrings[j]+"\n");
				}
				fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
