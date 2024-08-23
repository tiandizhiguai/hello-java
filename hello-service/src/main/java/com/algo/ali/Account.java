package com.algo.ali;

import java.math.BigDecimal;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Account {

	private Map<String, Account> idNoAccounts = new ConcurrentHashMap<>();
	
	private Map<String, Account> accountNoAccounts = new ConcurrentHashMap<>();
	
	private Map<String, Integer> reqNos = new ConcurrentHashMap<>();

	private String accountNo;

	private String idCard;

	private BigDecimal balance;

	public String openAccount(String idNo) {
		if(idNo == null || idNo.length() == 0) {
			throw new IllegalArgumentException();
		}
		
		if(idNoAccounts.containsKey(idNo)) {
			return idNoAccounts.get(idNo).getAccountNo();
		}
		
		String accountNo = String.valueOf(idNo.hashCode());
		
		Account c = new Account();
		c.setIdCard(idNo);
		c.setAccountNo(accountNo);
		c.setBalance(BigDecimal.ZERO);
		idNoAccounts.put(idNo, c);
		accountNoAccounts.put(accountNo, c);
		
		return accountNo;
	}
	
	public BigDecimal charge(String accountNo, BigDecimal amount, String reqNo) {
		if(accountNo == null || accountNo.length() == 0
				|| amount == null || amount.compareTo(BigDecimal.ZERO) < 0
				|| reqNo == null || reqNo.length() == 0) {
			throw new IllegalArgumentException();
		}
		
		if(reqNos.containsKey(reqNo)) {
			throw new IllegalArgumentException();
		}
		
		reqNos.put(reqNo, 1);
		
		Account account = accountNoAccounts.get(accountNo);
		if(account == null) {
			reqNos.remove(reqNo);
			throw new IllegalArgumentException();
		}
		
		account.setBalance(account.getBalance().add(amount));
		reqNos.remove(reqNo);
		
		return account.getBalance();
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

}