package org.datacontract.schemas._2004._07.Client;

import javax.xml.rpc.ServiceException;

import org.datacontract.schemas._2004._07.Tps.AccountInfo;
import org.datacontract.schemas._2004._07.Tps.MasterAccInfo;
import org.datacontract.schemas._2004._07.Tps.Responses;
import org.datacontract.schemas._2004._07.Tps.USERINFO;
import org.tempuri.IThirdPartyService;
import org.tempuri.ThirdPartyServiceLocator;

public class PostaClient {

	public void createMasterAccount(USERINFO userInfo, AccountInfo accountInfo) {

		ThirdPartyServiceLocator locator = new ThirdPartyServiceLocator();

		try {

			IThirdPartyService service = locator.getTpsBinding_IThirdPartyService();
			Responses responses = service.createMasterAccount(userInfo, accountInfo);
			System.out.println("responses==" + responses.getResponse());
			System.out.println("responseMessage==" + responses.getResponseMessage());
			System.out.println("errorMessage==" + responses.getErrorMessage());

		} catch (ServiceException se) {
			se.printStackTrace();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public void getMasterAccountInfo(USERINFO userInfo) {

		ThirdPartyServiceLocator locator = new ThirdPartyServiceLocator();
		try {
			IThirdPartyService service = locator.getTpsBinding_IThirdPartyService();
			MasterAccInfo masterAccInfo = service.masterAccountINfo("accountNumber", "stationCode", userInfo);

			System.out.println("responses==" + masterAccInfo.getResponse());
			System.out.println("responsesMessage==" + masterAccInfo.getResponseMessage());
			System.out.println("errorMessage==" + masterAccInfo.getErrorMessage());

		} catch (ServiceException se) {
			se.printStackTrace();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}