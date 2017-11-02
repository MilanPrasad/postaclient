package com.rixyncs.bean;

import java.util.ArrayList;

import org.datacontract.schemas._2004._07.Tps.AccountInfo;
import org.datacontract.schemas._2004._07.Tps.USERINFO;



public class CreateMasterAccount {
	public ArrayList<AccountInfo> accountInfoList;
	public ArrayList<USERINFO> userInfoList;
	
	public ArrayList<AccountInfo> getAccountInfoList() {
		return accountInfoList;
	}
	public void setAccountInfoList(ArrayList<AccountInfo> accountInfoList) {
		this.accountInfoList = accountInfoList;
	}
	public ArrayList<USERINFO> getUserInfoList() {
		return userInfoList;
	}
	public void setUserInfoList(ArrayList<USERINFO> userInfoList) {
		this.userInfoList = userInfoList;
	}
	
	
	
	
	
}
