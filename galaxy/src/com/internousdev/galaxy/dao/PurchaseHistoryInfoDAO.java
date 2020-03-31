package com.internousdev.galaxy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.galaxy.dto.PurchaseHistoryInfoDTO;
import com.internousdev.galaxy.util.DBConnector;

public class PurchaseHistoryInfoDAO {

	//カート情報を購入履歴テーブルへ
	public int insertHistoryTable(String userId,int productId, int productCount ,int destinationId ,int price){

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "INSERT INTO purchase_history_info(user_id,product_id,product_count,price,destination_id,regist_date,update_date)"
				+ "VALUES(?,?,?,?,?,now(),now())";
		int res = 0;
		try {
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, userId);
				ps.setInt(2, productId);
				ps.setInt(3, productCount);
				ps.setInt(4, price);
				ps.setInt(5, destinationId);
				res = ps.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return res;
	}
	//商品履歴ページに表示する情報を取得
	public List<PurchaseHistoryInfoDTO> getPurchaseHistoryInfo(String userId){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		List<PurchaseHistoryInfoDTO> purchaseHistoryInfoDTO = new ArrayList<PurchaseHistoryInfoDTO>();
		String sql ="SELECT "
				+"purchase_history_info.id, " /* ID */
				+"purchase_history_info.user_id, "/* ユーザーID */
				+"product_info.product_id, " /* 商品ID */
				+"product_info.product_name, "/*商品名*/
				+"product_info.product_name_kana, "/*商品ふりがな*/
				+"product_info.image_file_path, "/*画像ファイルパス*/
				+"product_info.image_file_name, "/*画像ファイル名*/
				+"product_info.release_company, "/*発売会社名*/
				+"product_info.release_date," /*発売年月日*/
				+"purchase_history_info.price, "/*値段*/
				+"purchase_history_info.product_count, "/*個数*/
				+"purchase_history_info.price * purchase_history_info.product_count as total, " /*合計金額*/
				+"destination_info.family_name, "/*姓*/
				+"destination_info.first_name, "/*名*/
				+"destination_info.user_address " /*住所*/
				+"FROM "
				+"purchase_history_info "
				+"LEFT OUTER JOIN "
				+"product_info "
				+"ON "
				+"purchase_history_info.product_id = product_info.product_id "
				+"LEFT OUTER JOIN "
				+"destination_info "
				+"ON "
				+"purchase_history_info.destination_id = destination_info.id "
				+"WHERE "
				+"purchase_history_info.user_id = ? "
				+"ORDER BY "
				+"purchase_history_info.regist_date DESC ";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
				dto.setProductName(rs.getString("product_name"));
				dto.setProductNameKana(rs.getString("product_name_kana"));
				dto.setImageFilePath(rs.getString("image_file_path"));
				dto.setImageFileName(rs.getString("image_file_name"));
				dto.setReleaseCompany(rs.getString("release_company"));
				dto.setReleaseDate(rs.getDate("release_date"));
				dto.setPrice(rs.getInt("price"));
				dto.setProductCount(rs.getInt("product_count"));
				dto.setTotal(rs.getInt("total"));
				dto.setFamilyName(rs.getString("family_name"));
				dto.setFirstName(rs.getString("first_name"));
				dto.setUserAddress(rs.getString("user_address"));
				purchaseHistoryInfoDTO.add(dto);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return purchaseHistoryInfoDTO;
	}
	//履歴テーブルから情報を削除
	public int deletePurchaseHistory(String userId){
		DBConnector db =new DBConnector();
		Connection con = db.getConnection();
		String sql = "DELETE FROM purchase_history_info WHERE user_id = ?";
		PreparedStatement ps;
		int result = 0;
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, userId);
			result = ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}