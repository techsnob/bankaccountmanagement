package com.techsnob.bam.businessdelegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.technsob.bam.service.BankAccountManagementService;
import com.techsnob.bam.dao.BankAccountManagementDAO;
import com.techsnob.bam.to.AddBankAccountTO;

@Service
@Transactional
public class BankAccountManagementDelegate implements BankAccountManagementService{
	
	@Autowired
	private BankAccountManagementDAO bankAccountManagementDAO;
	
	@Override
	public Boolean addBankAccount(AddBankAccountTO addBankAccountTO) {
		return bankAccountManagementDAO.saveBankAccount(addBankAccountTO);
	}

	@Override
	public AddBankAccountTO retreiveBankAccount(String accountNumber) {
		return bankAccountManagementDAO.getBankAccount(accountNumber);
	}
	
}
