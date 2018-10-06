package com.techsnob.bam.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;

import com.techsnob.bam.to.AddBankAccountTO;

@Repository
public class BankAccountManagementDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public Boolean saveBankAccount(AddBankAccountTO addBankAccountTO) {
		return jdbcTemplate.execute("INSERT INTO fncl_acct(acct_num,ifsc_num,acct_name,acct_nick_name,email,phone_num,created_dt,created_by,lat_updated_dt,created_user_ip) values (?,?,?,?,?,?,?,?,?,?)", new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setInt(1, Integer.valueOf(addBankAccountTO.getAccountNumber()));
				ps.setString(2, addBankAccountTO.getIfscNumber());
				ps.setString(3, addBankAccountTO.getAccountPayeeName());
				ps.setString(4, addBankAccountTO.getAccountNickName());
				ps.setString(5, addBankAccountTO.getAccountEmailId());
				ps.setInt(6, Integer.valueOf(addBankAccountTO.getAccountPhoneNumber()));
				ps.setTimestamp(7, addBankAccountTO.getCreatedDate());
				ps.setString(8, addBankAccountTO.getCreatedBy());
				ps.setTimestamp(9, addBankAccountTO.getLastUpdated());
				ps.setString(10, addBankAccountTO.getUserIp().getHostAddress());
				return ps.execute();
			}
			
		});
	}
	
	public AddBankAccountTO getBankAccount(String accountNumber) {
		return jdbcTemplate.queryForObject("select * from fncl_acct where acct_num="+Integer.valueOf(accountNumber), AddBankAccountTO.class);
	}
	
	public List<AddBankAccountTO> getAllAccounts(){
		return null;
	}
}
