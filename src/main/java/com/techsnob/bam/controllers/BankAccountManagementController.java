package com.techsnob.bam.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.technsob.bam.service.BankAccountManagementService;
import com.techsnob.bam.to.AddBankAccountTO;

@RestController
public class BankAccountManagementController {
	
	@Autowired
	private BankAccountManagementService bankAccountManagementService;

	@RequestMapping(value="/addBankAccount", method=RequestMethod.POST, consumes= {"application/json"}, produces= {"application/json"})
	public Boolean addBankAccount(@RequestBody AddBankAccountTO addBankAccountTO) {
		System.out.println(addBankAccountTO.toString());
		return bankAccountManagementService.addBankAccount(addBankAccountTO);
	}

	@RequestMapping(value="/retreiveBankAccount", consumes= {"application/json"}, produces= {"application/json"})
	@ResponseBody
	public AddBankAccountTO retreiveBankAccount(String accountNumber) {
		System.out.println(accountNumber);
		return bankAccountManagementService.retreiveBankAccount(accountNumber);
	}

}
