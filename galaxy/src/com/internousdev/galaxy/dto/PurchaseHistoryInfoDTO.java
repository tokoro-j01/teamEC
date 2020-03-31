package com.internousdev.galaxy.dto;

import java.util.Date;

public class PurchaseHistoryInfoDTO {

	private int id;  //ID
	private String userId; //ユーザーID
	private int productId; //商品ID
	private String productName; //商品名
	private String productNameKana; //商品名ふりがな
	private String imageFilePath; //画像ファイルパス
	private String imageFileName; //画像ファイル名
	private String releaseCompany; //発売会社名
	private Date releaseDate; //発売年月日
	private int price; //値段
	private int productCount; //個数
	private int total;//合計金額
	private String familyName; //宛先名前 姓
	private String firstName;//宛先名前 名
	private String userAddress; //宛先住所

	//ID
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	//ユーザーID
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	//商品ID
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	//商品名
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	//商品名ふりがな
	public String getProductNameKana() {
		return productNameKana;
	}
	public void setProductNameKana(String productNameKana) {
		this.productNameKana = productNameKana;
	}
	//画像ファイルパス
	public  String getImageFilePath() {
		return imageFilePath;
	}
	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}
	//画像ファイル名
	public  String getImageFileName() {
		return imageFileName;
	}
	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}
	//発売会社名
	public String getReleaseCompany() {
		return releaseCompany;
	}
	public void setReleaseCompany(String releaseCompany) {
		this.releaseCompany = releaseCompany;
	}
	//発売年月日
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	//値段
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//個数
	public int getProductCount() {
		return productCount;
	}
	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}
	//合計金額
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	//宛先名前 姓
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	//宛先名前 名
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	//宛先住所
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
}
