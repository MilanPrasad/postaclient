package com.rixyncs.fetchrecord;

import java.io.File;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.datacontract.schemas._2004._07.Client.PostaClient;
import org.datacontract.schemas._2004._07.Tps.AccountInfo;
import org.datacontract.schemas._2004._07.Tps.AlertEventCode;
import org.datacontract.schemas._2004._07.Tps.USERINFO;

import com.rixyncs.bean.Account;

import com.rixyncs.bean.Contact;
import com.rixyncs.bean.CreateMasterAccount;
import com.rixyncs.parser.AccountDomParser;

import com.rixyncs.parser.ContactDomParser;

/*
 * Main class used to pull data from Zoho CRM and push in to postaplus oracle database using
 * postaplus soap webservice
 */

public class DataPush {
	/*
	 * Method used to fetch all the account data from Zoho CRM based on the criteria
	 * Send To ERP = true
	 */
			static String TodayDate=getTodaydate().toString();
			public static String getTodaydate()
			{
			DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
			Date date = new Date();
			System.out.println(dateFormat.format(date));
			return dateFormat.format(date);
			}
		   static Properties prop = new Properties();
	

	public String getAccountDetails() 
	{	
		String accountDetails = null;

		String authtoken = prop.getProperty("authtoken");
		String scope = "crmapi";
		String selectColumns = "Accounts(Account Name,Station Code Upd,Area Details,Province Code,Country Code,City Code,AREA CODE,Billing Code,Paci Number,Phone,Email,Fax,Salesman Code,Customer Status,Account Type Code,Sector Code,Opening Balance)";
		String newFormat = "2";
	//String fromIndex = "1";
		//String toIndex = "20";
		// String selectColumns = "All";
		//String criteria = "((Send to ERP:true))";
		// System.out.println(criteria);
		String criteria = "((Trigger Date:2017-10-17))";

		String targetURL = "https://crm.zoho.com/crm/private/xml/Accounts/searchRecords";

		String paramname = "content";
		PostMethod post = new PostMethod(targetURL);
		post.setParameter("authtoken", authtoken);
		post.setParameter("scope", scope);
		post.setParameter("newFormat", newFormat);
		post.setParameter("selectColumns", selectColumns);
		//post.setParameter("fromIndex", fromIndex);
		//post.setParameter("toIndex", toIndex);
		post.setParameter("criteria", criteria);

		HttpClient httpclient = new HttpClient();
		try {
			long t1 = System.currentTimeMillis();
			int result = httpclient.executeMethod(post);
			// -----------------------Get response as a string ----------------
			accountDetails = post.getResponseBodyAsString();
			
		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {

			post.releaseConnection();
		}

		return accountDetails;
	}

	public String getContactDetails() {
		String contactDetails = null;

		String authtoken = prop.getProperty("authtoken");
		String scope = "crmapi";
		String selectColumns = "Contacts(Contacts Owner,Contact,Account Name,Salesperson Code,Email)";
		String newFormat = "2";
		//String fromIndex = "1";
		//String toIndex = "5";
		String criteria = "((Tigger Date:2017-10-17))";
		


		String targetURL = "https://crm.zoho.com/crm/private/xml/Contacts/searchRecords";

		String paramname = "content";
		PostMethod post = new PostMethod(targetURL);
		post.setParameter("authtoken", authtoken);
		post.setParameter("scope", scope);
		post.setParameter("newFormat", newFormat);
		post.setParameter("selectColumns", selectColumns);
		//post.setParameter("fromIndex", fromIndex);
		//post.setParameter("toIndex", toIndex);
		post.setParameter("criteria",criteria);
		

		HttpClient httpclient = new HttpClient();
		PrintWriter myout = null;

		// Execute http request
		try {
			long t1 = System.currentTimeMillis();
			int result = httpclient.executeMethod(post);
			
			contactDetails = post.getResponseBodyAsString();
			

		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			// myout.close();
			post.releaseConnection();

		}

		return contactDetails;
	}
	
	
	public List<AccountInfo> getAccountsInfo(ArrayList<Account> listOfAccount,ArrayList<Contact> listOfContact){
		
		List<AccountInfo> listOfAccountInfo = new ArrayList<>();
		

		for (Account account : listOfAccount) {

			for (Contact contact : listOfContact) {

				// common column
				
				if (account.getAccountId().equals(contact.getAccountId())) 
				{
					
					AccountInfo accountInfo = new AccountInfo();


					/*accountInfo.setAccountName(account.getAccountName());
					accountInfo.setAccountNumber(account.getAccountId());
					accountInfo.setAccountPassword("Postaplus");
					accountInfo.setAddress(account.getLandmark());
					accountInfo.setCodeAccountType(account.getAccountTypeCode());
					accountInfo.setCodeArea("NA");
					accountInfo.setCodeCity(account.getBillingCity());
					accountInfo.setCodeCountry(account.getBillingCountry());
					accountInfo.setCodeProvince(account.getBillingState());
					accountInfo.setCodeSector(account.getSectorCode());
					accountInfo.setCodeStation(account.getStationCodeUpd());
					accountInfo.setCodeWareHouseType("NRML");
					accountInfo.setContactPerson(contact.getContactName());
					accountInfo.setEmail(contact.getEmail());
					accountInfo.setFax(account.getFax());
					accountInfo.setLanguage("EN");
					accountInfo.setMobile(account.getPhone());
					accountInfo.setOpeningBalance(account.getOpeningBalance());
					accountInfo.setPACINumber(account.getPaciNumber());
					accountInfo.setPinCode(account.getBillingCode());
					accountInfo.setSalesCode("NA");
					accountInfo.setStatus(account.getCustomerStatus());*/
					
					accountInfo.setAccountName("Final Integration Test record");
					accountInfo.setAccountNumber("244010800000211");
					accountInfo.setAccountPassword("Postaplus");
					accountInfo.setAddress("SBI,405 kasturi nagar");
					accountInfo.setCodeAccountType("ACTY1");
					accountInfo.setCodeArea("NA");
					accountInfo.setCodeCity("NA");
					accountInfo.setCodeCountry("ARE");
					accountInfo.setCodeProvince("AZ");
					accountInfo.setCodeSector("SEC3");
					accountInfo.setCodeStation("KWI");
					accountInfo.setCodeWareHouseType("NRML");
					accountInfo.setContactPerson("Test1Record1");
					accountInfo.setEmail("test@test.com");
					accountInfo.setFax("1234567891");
					accountInfo.setLanguage("EN");
					accountInfo.setMobile("965222222");
					accountInfo.setOpeningBalance(0.00);
					accountInfo.setPACINumber("568923");
					accountInfo.setPinCode("PO-BOX-560043");
					accountInfo.setSalesCode("NA");
					accountInfo.setStatus("A");
					
						
						listOfAccountInfo.add(accountInfo);
					
					
					
					//CreateMasterAccount createmasteraccount=new CreateMasterAccount();
					
					//PostaClient postaclient=new PostaClient();
					
					//postaclient.createMasterAccount(createmasteraccount.getUserInfoList().get(0),createmasteraccount.getAccountInfoList().get(0));

					
				}
				else
				{
					System.out.println();
				}

			}

		}
		
		return listOfAccountInfo;
		
	}

	public static void main(String args[]) 
	{
		try{
			
			prop.load(DataPush.class.getClassLoader().getResourceAsStream(
					"postaclient.properties"));
			
			DataPush sc = new DataPush();
			String accountDetails = sc.getAccountDetails();
			String contactDetails = sc.getContactDetails();

			System.out.println("accountXml = " + accountDetails);
			System.out.println("contact =" + contactDetails);

			
			AccountDomParser accountDomParser = new AccountDomParser();
			ArrayList<Account> listOfAccount =accountDomParser.pasrse(accountDetails);
			
			
			System.out.println("list of Account size = "+listOfAccount.size()); 
			System.out.println("Account Name retrive  from Account===="+listOfAccount.get(0).getAccountName());
			
			
			ContactDomParser contactDomParser = new ContactDomParser();
			ArrayList<Contact> listOfContact = contactDomParser.pasrse(contactDetails);
			
			
			System.out.println("list of Contact size = "+listOfContact.size()); 
			System.out.println("Account Name retrive  from ===="+listOfContact.get(0).getAccountName());
			
			// setting the bean value for AccountInfo
			List<AccountInfo> listOfAccountInfo =sc.getAccountsInfo(listOfAccount,listOfContact);
			
			USERINFO userInfo = new USERINFO();
			userInfo.setAPIKey(prop.getProperty("APIKey"));
			userInfo.setPassword(prop.getProperty("Password"));
			userInfo.setUserName(prop.getProperty("UserName"));
			
			System.out.println("Calling postaplus");
			
			System.out.println("Size=================================="+listOfAccountInfo.size());
			PostaClient postaClient = new PostaClient();
			postaClient.createMasterAccount(userInfo, listOfAccountInfo.get(0));
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}

}