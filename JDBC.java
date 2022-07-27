package JDBC;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.List;
import javax.swing.JMenu;
import javax.swing.JLayeredPane;



public class DB2 extends JFrame implements ActionListener {
	Connection con;
	private JPanel contentPane;
	private JMenu mnNewMenu;
	private JFrame frame;
	/**
	 * @wbp.nonvisual location=791,419
	 */
	


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DB2 frame = new DB2();
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
	public DB2() {
		int  CountCourse = 0;
		int CountDepartment = 0;
		int CountFaculty = 0;
		int CountSection = 0;
		int CountStudent = 0;
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPane);
		JButton Course = new JButton("Course");
		JButton Department = new JButton("Department");
		JButton Faculty = new JButton("Faculty");
		JButton Section = new JButton("Section");
		JButton Student = new JButton("Student");
		
		frame = new JFrame("University Databse");
		frame.setSize(450, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(750, 350);
		frame.setVisible(true);
		frame.getContentPane().add(contentPane);
		
		
		
		
		Course.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){

				JFrame frame = new JFrame("Course operation");
				frame.setSize(450, 450);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLocation(750, 350);
				frame.setVisible(true);
				
				JPanel panel = new JPanel();
				
				
				JButton CourseNumber = new JButton("Course Number: ");
				JButton CourseName = new JButton("Course Name: ");
				JButton CourseInfo = new JButton("Course Info: ");
				JButton CourseLevel = new JButton("Course Level: ");
				
				

				
				
				frame.getContentPane().add(panel);
				panel.add(CourseNumber);
				panel.add(CourseName);
				panel.add(CourseInfo);
				panel.add(CourseLevel);
				
				panel.setLayout(new GridLayout(0, 1, 0, 0));

				
				
				
				
				
			}
			
		});
		
		
		Department.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				JFrame frame = new JFrame("Course operation");
				frame.setSize(450, 450);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLocation(750, 350);
				frame.setVisible(true);


				
				JPanel panel = new JPanel();
				
				
				JButton First = new JButton("Department Code: ");
				JButton Second = new JButton("Department Name: ");
				JButton third = new JButton("College: ");
				JButton fourth = new JButton("Department Email: ");
				
				

				
				
				frame.getContentPane().add(panel);
				panel.add(First);
				panel.add(Second);
				panel.add(third);
				panel.add(fourth);
				
				panel.setLayout(new GridLayout(0, 1, 0, 0));

				
			}
			
		});
		
		Faculty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				JFrame frame = new JFrame("Course operation");
				frame.setSize(450, 450);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLocation(750, 350);
				frame.setVisible(true);
				
				JPanel panel = new JPanel();
				
				
				JButton First = new JButton("Chairman ID: ");
				JButton Second = new JButton("Chairman National ID: ");
				JButton third = new JButton("Chairman name: ");
				JButton fourth = new JButton("Chairman Phone Numer: ");
				
				

				
				
				frame.getContentPane().add(panel);
				panel.add(First);
				panel.add(Second);
				panel.add(third);
				panel.add(fourth);
				
				panel.setLayout(new GridLayout(0, 1, 0, 0));
				
				
			}
			
		});
		
		Section.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				JFrame frame = new JFrame("Course operation");
				frame.setSize(450, 450);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLocation(750, 350);
				frame.setVisible(true);
				
				JPanel panel = new JPanel();
				
				
				JButton First = new JButton("Section Number: ");
				JButton Second = new JButton("Course Number: ");
				JButton third = new JButton("Semester Year: ");
				JButton fourth = new JButton("Year: ");
				
				

				
				
				frame.getContentPane().add(panel);
				panel.add(First);
				panel.add(Second);
				panel.add(third);
				panel.add(fourth);
				
				panel.setLayout(new GridLayout(0, 1, 0, 0));
				
				
			}
			
		});
		
		Student.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				JFrame frame = new JFrame("Course operation");
				frame.setSize(450, 450);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLocation(750, 350);
				frame.setVisible(true);
				
				JPanel panel = new JPanel();
				
				
				JButton First = new JButton("Student ID: ");
				JButton Second = new JButton("Student National ID: ");
				JButton third = new JButton("Student Name: ");
				JButton fourth = new JButton("Student Phone: ");
				JButton fifth = new JButton("Student Class: ");
				JButton sixth = new JButton("Student Major: ");
				JButton seventh = new JButton("Student Degeree: ");
				

				
				
				frame.getContentPane().add(panel);
				panel.add(First);
				panel.add(Second);
				panel.add(third);
				panel.add(fourth);
				panel.add(fifth);
				panel.add(sixth);
				panel.add(seventh);
				
				panel.setLayout(new GridLayout(0, 1, 0, 0));
				
				
			}
			
		});
		
		
		
		
		
		
		
		
		contentPane.add(Course);
		contentPane.add(Department);
		contentPane.add(Faculty);
		contentPane.add(Section);
		contentPane.add(Student);
		
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		createConnection();
		
		
		
	}

	void createConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");

		} catch (ClassNotFoundException ex) {
			Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
		} catch (SQLException ex) {
			Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	
	public void actionPerformed(ActionEvent e) {
		
		
	}

}





//CourseButton.addActionListener(new ActionListener() {
//public void actionPerformed(ActionEvent e) {
//	int StudentId = Integer.parseInt(input.getText());
//	int StudentNationalID = Integer.parseInt(input.getText());
//	String Studentname = input.getText();
//	String StudentPhone = input.getText();
//	String StudentClass = input.getText();
//	String StudentMajor = input.getText();
//	String StudentDegree = input.getText();

//	try {
//		PreparedStatement stmt = con.prepareStatement("INSERT INTO STUDENT VALUES(?)");


//		String dbop = "INSERT INTO student (col1, col2, col3,col4,col5,col6,col7) VALUES (?, ?, ?,?,?, ?,?)";
//		stmt.setInt(1, StudentId);
//		stmt.setInt(2, StudentNationalID);
//		stmt.setString(3, Studentname);
//		stmt.setString(4, StudentPhone);
//		stmt.setString(5, StudentClass);
//		stmt.setString(6, StudentMajor);
//		stmt.setString(7, StudentDegree);
//		stmt.execute();
//		System.out.println("INSERTION Completed");
//		stmt.close();
//	} catch (SQLException e1) {

//		e1.printStackTrace();
//	}
//}
//});
 

