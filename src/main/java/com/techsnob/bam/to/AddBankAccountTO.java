package com.techsnob.bam.to;

import java.net.InetAddress;
import java.sql.Timestamp;

public class AddBankAccountTO {
	private String accountNumber;
	private String ifscNumber;
	private String accountNickName;
	private String accountPayeeName;
	private String accountEmailId ;
	private String accountPhoneNumber;
	private Timestamp createdDate;
	private String createdBy;
	private Timestamp lastUpdated;
	private InetAddress userIp;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getIfscNumber() {
		return ifscNumber;
	}
	public void setIfscNumber(String ifscNumber) {
		this.ifscNumber = ifscNumber;
	}
	public String getAccountNickName() {
		return accountNickName;
	}
	public void setAccountNickName(String accountNickName) {
		this.accountNickName = accountNickName;
	}
	public String getAccountPayeeName() {
		return accountPayeeName;
	}
	public void setAccountPayeeName(String accountPayeeName) {
		this.accountPayeeName = accountPayeeName;
	}
	public String getAccountEmailId() {
		return accountEmailId;
	}
	public void setAccountEmailId(String accountEmailId) {
		this.accountEmailId = accountEmailId;
	}
	public String getAccountPhoneNumber() {
		return accountPhoneNumber;
	}
	public void setAccountPhoneNumber(String accountPhoneNumber) {
		this.accountPhoneNumber = accountPhoneNumber;
	}
	
	public Timestamp getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Timestamp getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(Timestamp lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	public InetAddress getUserIp() {
		return userIp;
	}
	public void setUserIp(InetAddress userIp) {
		this.userIp = userIp;
	}
	
	
}
