package com.rixyncs.bean;
/*Storing Contact Field data of Zoho*/
public class Contact {
	
	
	String contactName;
	String email;
	String salespersonCode;
	String  modifiedDate;	
	String civilID;
	String dateofBirth;
	String leadSource;
	String phone;
	String accountName;
	String accountId;
	
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountname) {
		this.accountName = accountname;
	}
	
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSalespersonCode() {
		return salespersonCode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setSalespersonCode(String salespersonCode) {
		this.salespersonCode = salespersonCode;
	}
	public String getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getCivilID() {
		return civilID;
	}
	public void setCivilID(String civilID) {
		this.civilID = civilID;
	}
	public String getDateofBirth() {
		return dateofBirth;
	}
	public void setDateofBirth(String dateofBirth) {
		this.dateofBirth = dateofBirth;
	}
	public String getLeadSource() {
		return leadSource;
	}
	public void setLeadSource(String leadSource) {
		this.leadSource = leadSource;
	}

	
	
}



