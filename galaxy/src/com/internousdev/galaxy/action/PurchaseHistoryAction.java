package com.internousdev.galaxy.action;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.galaxy.dao.PurchaseHistoryInfoDAO;
import com.internousdev.galaxy.dto.PurchaseHistoryInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class PurchaseHistoryAction extends ActionSupport implements SessionAware{

	private Map<String, Object>session;
	private List<PurchaseHistoryInfoDTO> purchaseHistoryList;
	//ログイン認証
	public String execute() throws SQLException{
		String tempLoginId = String.valueOf(session.get("loginFlg"));
		int loginFlg = "null".equals(tempLoginId) ? 0 : Integer.parseInt(tempLoginId);
		if (loginFlg != 1) {
			return "loginError";
		}
		//userIdを取得し、ＤＢから情報を取得するメソッドを使用
		PurchaseHistoryInfoDAO purchaseHistoryInfoDAO = new PurchaseHistoryInfoDAO();
		purchaseHistoryList = purchaseHistoryInfoDAO.getPurchaseHistoryInfo(String.valueOf(session.get("userId")));
		return SUCCESS;
	}
	public void setPurchaseHistoryList(List<PurchaseHistoryInfoDTO> purchaseHistoryList) {
		this.purchaseHistoryList = purchaseHistoryList;
	}
	public List<PurchaseHistoryInfoDTO> getPurchaseHistoryList(){
		return this.purchaseHistoryList;
	}
	public Map<String, Object> getSession(){
		return this.session;
	}
	public void setSession(Map<String, Object> session) {
		this.session=session;
	}
}
