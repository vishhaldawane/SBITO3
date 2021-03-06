import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.sbi.exceptions.ApplicantNotFoundException;

class MyFrame extends JFrame implements ActionListener
{
	JLabel l = new JLabel("Enter applicant id");
	JTextField t = new JTextField(20);
	JButton b = new JButton("Search");
	
	JTextField t1 = new JTextField(20);
	JTextField t2 = new JTextField(20);
	JTextField t3 = new JTextField(20);
	
	
	MyFrame() {
		add(l);
		add(t);
		add(b);
		add(t1);
		add(t2);
		add(t3);
		setLayout(new FlowLayout());
		setSize(300,300);
		setLocation(100,100);
		setVisible(true);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		try
		{
		int value = Integer.parseInt(t.getText());
		System.out.println("Button is clicked...."+value);
		
		DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
		System.out.println("Driver loaded.../registered....");
	
		Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
		System.out.println("Connected to the db....");
		
		Statement st = conn.createStatement();
		System.out.println("statement is created..."+st);
		
		int appId = value ;
		
		ResultSet rs = st.executeQuery("SELECT * FROM BANK_APPLICANT where APPLICANT_ID="+appId);
		System.out.println("query fired...got the results....");
		
		if(rs.next()) {
			System.out.println("APPLICANT ID     : "+rs.getInt(1));
			System.out.println("APPLICANT NAME   : "+rs.getString(2));
			t1.setText(rs.getString(2));
			
			System.out.println("APPLICANT EMAIL  : "+rs.getString(3));
			t2.setText(rs.getString(3));
			
			System.out.println("APPLICANT ADDRESS: "+rs.getString(4));
			t3.setText(rs.getString(4));
			
			System.out.println("APPLICANT Mobile : "+rs.getString(5));
			System.out.println("APPLICANT DOB    : "+rs.getDate(6));
			System.out.println("-----------------------------");
		}
		else {
			throw new ApplicantNotFoundException("The applicant with this id is not found : "+appId);
			
		}
		
		rs.close();
		st.close();
		conn.close();
		}
		catch(SQLException e) {
			System.out.println("Some problem1 : "+e);
		}
		catch(ApplicantNotFoundException e) {
			//System.out.println("Some problem2 : "+e);
			JOptionPane.showMessageDialog(this, e.getMessage());
			t1.setText("");
			t2.setText("");
			t3.setText("");
			
		}
		System.out.println("DisConnected from the db....");
		
	}
	
}

public class SelectWhereClause {

	public static void main(String[] args)  
	{
		MyFrame m = new MyFrame();
		m.setVisible(true);
		
	}

}
