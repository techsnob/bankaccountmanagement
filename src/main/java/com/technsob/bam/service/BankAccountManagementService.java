package com.technsob.bam.service;

import com.techsnob.bam.to.AddBankAccountTO;


public interface BankAccountManagementService {
	Boolean addBankAccount(AddBankAccountTO addBankAccountTO);
	AddBankAccountTO retreiveBankAccount(String accountNumber);
}
