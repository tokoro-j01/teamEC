package com.internousdev.galaxy.action;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.galaxy.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class CreateDestinationConfirmAction extends ActionSupport implements SessionAware{

	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private String email;
	private String telNumber;
	private String userAddress;
	private Map<String,Object> session;

	private List<String> familyNameErrorMessageList;
	private List<String> firstNameErrorMessageList;
	private List<String> familyNameKanaErrorMessageList;
	private List<String> firstNameKanaErrorMessageList;
	private List<String> emailErrorMessageList;
	private List<String> telNumberErrorMessageList;
	private List<String> userAddressErrorMessageList;

	public String execute() {
		//ログイン認証
		String tempLoginId = String.valueOf(session.get("loginFlg"));
		int loginFlg = "null".equals(tempLoginId) ? 0 : Integer.parseInt(tempLoginId);
		if (loginFlg != 1) {
			return "loginError";
		}
		String result = ERROR;

		//スペースのみでは処理されないようにする
		String tempUserAddress = null;
		if (StringUtils.isBlank(userAddress) && !"".equals(userAddress)){
			//住所にスペースを入力された場合は処理用の変数に"@@@"を代入
			tempUserAddress = "@@@";
		} else {
			// 住所が未入力、もしくは住所にスペース以外を入力された処理用の変数に入力した値を代入
			tempUserAddress = userAddress;
		}

		session.put("familyName", familyName);
		session.put("firstName", firstName);
		session.put("familyNameKana", familyNameKana);
		session.put("firstNameKana", firstNameKana);
		session.put("email", email);
		session.put("telNumber", telNumber);
		session.put("userAddress", userAddress);

		InputChecker inputChecker = new InputChecker();
		//フォームの入力内容をinputCheckerを使用しチェックする。-----------------------------------------------
		familyNameErrorMessageList = inputChecker.doCheck("姓", familyName, 1, 16, true, true, true, false, true, false);
		firstNameErrorMessageList = inputChecker.doCheck("名", firstName, 1, 16, true, true, true, false, true, false);
		familyNameKanaErrorMessageList = inputChecker.doCheck("姓ふりがな", familyNameKana, 1, 16, false, false, true, false, false, false);
		firstNameKanaErrorMessageList = inputChecker.doCheck("名ふりがな", firstNameKana, 1, 16, false, false, true, false, false, false);
		userAddressErrorMessageList = inputChecker.doCheck("住所", tempUserAddress, 10, 50, true, true, true, true, true, true);
		telNumberErrorMessageList = inputChecker.doCheck("電話番号", telNumber, 10, 13, false, false, false, true, false, false);
		emailErrorMessageList = inputChecker.doCheckForEmail(email);

		if(familyNameErrorMessageList.size() > 0
		|| firstNameErrorMessageList.size() > 0
		|| familyNameKanaErrorMessageList.size() > 0
		|| firstNameKanaErrorMessageList.size() > 0
		|| emailErrorMessageList.size() > 0
		|| telNumberErrorMessageList.size() > 0
		|| userAddressErrorMessageList.size() > 0) {
			result = ERROR;
		} else {
			result = SUCCESS;
		}
		return result;
	}

	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFamilyNameKana() {
		return familyNameKana;
	}
	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}
	public String getFirstNameKana() {
		return firstNameKana;
	}
	public void setFirstNameKana(String firstNameKana) {
		this.firstNameKana = firstNameKana;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelNumber() {
		return telNumber;
	}
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public List<String> getFamilyNameErrorMessageList() {
		return familyNameErrorMessageList;
	}
	public void setFamilyNameErrorMessageList(List<String> familyNameErrorMessageList) {
		this.familyNameErrorMessageList = familyNameErrorMessageList;
	}
	public List<String> getFirstNameErrorMessageList() {
		return firstNameErrorMessageList;
	}
	public void setFirstNameErrorMessageList(List<String> firstNameErrorMessageList) {
		this.firstNameErrorMessageList = firstNameErrorMessageList;
	}
	public List<String> getFamilyNameKanaErrorMessageList() {
		return familyNameKanaErrorMessageList;
	}
	public void setFamilyNameKanaErrorMessageList(List<String> familyNameKanaErrorMessageList) {
		this.familyNameKanaErrorMessageList = familyNameKanaErrorMessageList;
	}
	public List<String> getFirstNameKanaErrorMessageList() {
		return firstNameKanaErrorMessageList;
	}
	public void setFirstNameKanaErrorMessageList(List<String> firstNameKanaErrorMessageList) {
		this.firstNameKanaErrorMessageList = firstNameKanaErrorMessageList;
	}
	public List<String> getEmailErrorMessageList() {
		return emailErrorMessageList;
	}
	public void setEmailErrorMessageList(List<String> emailErrorMessageList) {
		this.emailErrorMessageList = emailErrorMessageList;
	}
	public List<String> getTelNumberErrorMessageList() {
		return telNumberErrorMessageList;
	}
	public void setTelNumberErrorMessageList(List<String> telNumberErrorMessageList) {
		this.telNumberErrorMessageList = telNumberErrorMessageList;
	}
	public List<String> getUserAddressErrorMessageList() {
		return userAddressErrorMessageList;
	}
	public void setUserAddressErrorMessageList(List<String> userAddressErrorMessageList) {
		this.userAddressErrorMessageList = userAddressErrorMessageList;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
