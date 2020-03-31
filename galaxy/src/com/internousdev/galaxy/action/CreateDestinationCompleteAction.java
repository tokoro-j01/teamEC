package com.internousdev.galaxy.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.galaxy.dao.DestinationInfoDAO;
import com.opensymphony.xwork2.ActionSupport;

public class CreateDestinationCompleteAction extends ActionSupport implements SessionAware{

	private Map<String,Object> session;
	//ログイン認証
	public String execute() throws SQLException {
		String tempLoginId = String.valueOf(session.get("loginFlg"));
		int loginFlg = "null".equals(tempLoginId) ? 0 : Integer.parseInt(tempLoginId);
		if (loginFlg != 1) {
			return "loginError";
		}
		String result =ERROR;
		//宛先情報登録
		DestinationInfoDAO createDestinationDAO = new DestinationInfoDAO();
		int res =createDestinationDAO.createDestination(
				session.get("userId").toString(),
				session.get("familyName").toString(),
				session.get("firstName").toString(),
				String.valueOf(session.get("familyNameKana")),
				String.valueOf(session.get("firstNameKana")),
				String.valueOf(session.get("email")),
				String.valueOf(session.get("telNumber")),
				session.get("userAddress").toString()
				);
		if(res > 0) {
			result = SUCCESS;
		}
		//session情報削除
		session.remove("familyName");
		session.remove("firstName");
		session.remove("familyNameKana");
		session.remove("firstNameKana");
		session.remove("email");
		session.remove("telNumber");
		session.remove("userAddress");

		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
