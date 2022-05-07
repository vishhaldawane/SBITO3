package dao;

import java.sql.Date;

public class BankApplicant { //BANK_APPLICANT
	private int applicantNumber; //applicant_id
	private String applicantName; // applicant_name
	private String emailAddress; // applicant_email_address
	private String mobile; //applicant_mobile_number
	private String appliedFor;
	private String applicationStatus;
	private String address; //applicant_address
	private Date birthdate; //applicant_dob;
	
	public int getApplicantNumber() {
		return applicantNumber;
	}
	public void setApplicantNumber(int applicantNumber) {
		this.applicantNumber = applicantNumber;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAppliedFor() {
		return appliedFor;
	}
	public void setAppliedFor(String appliedFor) {
		this.appliedFor = appliedFor;
	}
	public String getApplicationStatus() {
		return applicationStatus;
	}
	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	
	
	
	
}
