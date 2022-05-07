package dao;

import java.sql.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
//TDD
public class TestDAO {
	
	public static void main(String[] args) {
		BankApplicantDAO bad = new BankApplicantDAOImpl();
		List<BankApplicant> baList = bad.findAllBankApplicants();
		for (BankApplicant bankApplicant : baList) {
			System.out.println("BankApplicant Name "+bankApplicant.getApplicantName());
		}
		System.out.println("-----------");
		BankApplicant  baObj = bad.findBankApplicantById(2);
		System.out.println("BankApplicant Name "+baObj.getApplicantName());
		System.out.println("-----------");
		//bad.deleteBankApplicantById(4);
		System.out.println("-----------");
		
		BankApplicant baObj2 = new BankApplicant();
		baObj2.setApplicantNumber(3);
		baObj2.setAddress("CHENNAI");
		baObj2.setMobile("999999");
		baObj2.setApplicantName("JULIE");
		baObj2.setApplicationStatus("APPROVED");
		baObj2.setEmailAddress("JULIE@gmail.com");
		baObj2.setAppliedFor("Current");
		String str="1994-12-05";
		Date d = Date.valueOf(str);
		baObj2.setBirthdate(d);
		
		bad.updateBankApplicant(baObj2);
		
		
		
	}
	/*@Test
	public void testSelect() {
		System.out.println("test select case is running.....");
	}
	@Test
	public void testSelectAll() {
		System.out.println("test select all case is running.....");
	}
	@Test
	public void testUpdate() {
		System.out.println("test update case is running.....");
	}
	@Test
	public void testInsert() {
		System.out.println("test insert case is running.....");
	}
	@Test
	public void testDelete() {
		System.out.println("test delete case is running.....");
	}*/
}
