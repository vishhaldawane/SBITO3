package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
/*BankApplicantDAO x = new BankApplicantDAOImpl();
BankApplicant y = new BankApplicant ();
x.saveBankApplicant(y); legal

Flight f = new Flight();
x.saveBankApplicant(f); illegal*/
//C:\app\PC-2\product\18.0.0\dbhomeXE\jdbc\lib\ojdbc8.jar
public class BankApplicantDAOImpl implements BankApplicantDAO {
	Connection conn;
	public BankApplicantDAOImpl() {
		System.out.println("BankApplicantDAOImpl() ctor");
		
		try {
			//DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			System.out.println("Driver loaded.../registered....");

			//conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "sysgitc");
			System.out.println("Connected to the db...."+conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void saveBankApplicant(BankApplicant ba) {
		//INSERT QUERY
		try {
			PreparedStatement pst = conn.prepareStatement("INSERT INTO BANK_APPLICANT2 VALUES (?,?,?,?,?,?,?,?) ");
			pst.setInt(1, ba.getApplicantNumber());
			pst.setString(2, ba.getApplicantName());
			pst.setString(3, ba.getEmailAddress());
			pst.setString(4, ba.getMobile());
			pst.setString(5, ba.getAppliedFor());
			pst.setString(6, ba.getApplicationStatus());
			pst.setString(7, ba.getAddress());
			pst.setDate(8, ba.getBirthdate());
			System.out.println("prepared statement is created..."+pst);
			int row = pst.executeUpdate();
			System.out.println("row inserted..."+row);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public BankApplicant findBankApplicantById(int aid) {
		//SELECT
		BankApplicant ba = null;
		try {
			Statement st = conn.createStatement();
			System.out.println("statement is created..."+st);
			
			ResultSet rs = st.executeQuery("SELECT * FROM bank_applicant2 where applicant_id="+aid);
			System.out.println("query fired...got the results....");
			
			
			if(rs.next()) {
				
				ba = new BankApplicant();
				
				ba.setApplicantNumber(rs.getInt(1));
				ba.setApplicantName(rs.getString(2));
				ba.setEmailAddress(rs.getString(3));
				ba.setMobile(rs.getString(4));
				ba.setAppliedFor(rs.getString(5));
				ba.setApplicationStatus(rs.getString(6));
				ba.setAddress(rs.getString(7));
				ba.setBirthdate(rs.getDate(8));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ba;
	}
	@Override
	public List<BankApplicant> findAllBankApplicants() {
		//SELECT ALL RECORDS
		List<BankApplicant> allApplicants = new ArrayList<BankApplicant>();
		
		BankApplicant ba = null;
		try {
			Statement st = conn.createStatement();
			System.out.println("statement is created..."+st);
			
			ResultSet rs = st.executeQuery("SELECT * FROM bank_applicant2");
			System.out.println("query fired...got the results....");
			
			
			while(rs.next()) {
				
				ba = new BankApplicant();
				
				ba.setApplicantNumber(rs.getInt(1));
				ba.setApplicantName(rs.getString(2));
				ba.setEmailAddress(rs.getString(3));
				ba.setMobile(rs.getString(4));
				ba.setAppliedFor(rs.getString(5));
				ba.setApplicationStatus(rs.getString(6));
				ba.setAddress(rs.getString(7));
				ba.setBirthdate(rs.getDate(8));
				allApplicants.add(ba);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allApplicants;
		
	}
	@Override
	public void updateBankApplicant(BankApplicant ba) {
		// UPDATE
	
				try {
					PreparedStatement pst = conn.prepareStatement("UPDATE BANK_APPLICANT2 set APPLICANT_NAME=?,APPLICANT_EMAIL=?,APPLICANT_PHONE=?,ACCOUNT_APPLIED_FOR=?,APPLICATION_STATUS=?,	APPLICANT_ADDRESS=?,APPLICANT_DOB=? WHERE APPLICANT_ID=?");
					pst.setInt(8, ba.getApplicantNumber());
					pst.setString(1, ba.getApplicantName());
					pst.setString(2, ba.getEmailAddress());
					pst.setString(3, ba.getMobile());
					pst.setString(4, ba.getAppliedFor());
					pst.setString(5, ba.getApplicationStatus());
					pst.setString(6, ba.getAddress());
					pst.setDate(7, ba.getBirthdate());
					System.out.println("prepared statement is created..."+pst);
					int row = pst.executeUpdate();
					System.out.println("row UPDATED..."+row);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	@Override
	public void deleteBankApplicantById(int aid) {
		// DELETE
		try {
			PreparedStatement pst = conn.prepareStatement("DELETE FROM BANK_APPLICANT2 WHERE APPLICANT_ID=?");
			pst.setInt(1, aid);
			
			System.out.println("prepared statement is created..."+pst);
			int row = pst.executeUpdate();
			System.out.println("row deleted..."+row);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

/*
System.out.println("APPLICANT ID     : "+rs.getInt(1));
				System.out.println("APPLICANT NAME   : "+rs.getString(2));
				System.out.println("APPLICANT EMAIL  : "+rs.getString(3));
				System.out.println("APPLICANT ADDRESS: "+rs.getString(4));
				System.out.println("APPLICANT Mobile : "+rs.getString(5));
				System.out.println("APPLICANT DOB    : "+rs.getDate(6));
				System.out.println("-----------------------------");
*/
