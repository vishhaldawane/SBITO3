package dao;

import java.util.List;

public interface BankApplicantDAO {
	void 		   saveBankApplicant(BankApplicant ba);  //C
	BankApplicant  findBankApplicantById(int aid);		 //R
	List<BankApplicant>  findAllBankApplicants();		 //RA
	void           updateBankApplicant(BankApplicant ba);//U
	void           deleteBankApplicantById(int aid);     //D
	
}
