package com.internousdev.galaxy.action;


import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.galaxy.dao.PurchaseHistoryInfoDAO;
import com.internousdev.galaxy.dto.PurchaseHistoryInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class DeletePurchaseHistoryAction extends ActionSupport implements SessionAware{
	private Map<String,Object>session;
	private PurchaseHistoryInfoDAO purchaseHistoryInfoDAO = new PurchaseHistoryInfoDAO();
	private List<PurchaseHistoryInfoDTO> purchaseHistoryList;

public String execute(){
	String loginId = String.valueOf(session.get("loginFlg"));
	int userId = "null".equals(loginId)? 0 : Integer.parseInt(loginId);
	if(userId != 1) {
		return "loginError";
	}
	String result = ERROR;

		int res = purchaseHistoryInfoDAO.deletePurchaseHistory(String.valueOf(session.get("userId")));
		if(res>0) {
			purchaseHistoryList = purchaseHistoryInfoDAO.getPurchaseHistoryInfo(String.valueOf(session.get("userId")));
			result = SUCCESS;
		}
		return result;
	}
public void setPurchaseHistoryList(List<PurchaseHistoryInfoDTO> purchaseHistoryList) {
	this.purchaseHistoryList = purchaseHistoryList;
}
public List<PurchaseHistoryInfoDTO>getPurchaseHistoryList(){
	return this.purchaseHistoryList;
}
public Map<String, Object> getSession(){
	return this.session;
}
public void setSession(Map<String, Object> session) {
	this.session=session;
}
}