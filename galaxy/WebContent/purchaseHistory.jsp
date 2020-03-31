<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/table.css">
<link rel="stylesheet" href="./css/header.css">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/galaxy.css">
<title>商品購入履歴一覧画面</title>
</head>
<body>
	<div id="header">
		<jsp:include page="header.jsp"/>
	</div>
	<div id="contents">
		<h1>商品購入履歴画面</h1>
		<s:if test="purchaseHistoryList!=null &&purchaseHistoryList.size()>0">
			<table class="list-table">
				<tr>
					<th>商品名</th>
					<th>ふりがな</th>
					<th>商品画像</th>
					<th>発売会社名</th>
					<th>発売年月日</th>
					<th>値段</th>
					<th>個数</th>
					<th>合計金額</th>
					<th>宛先名前</th>
					<th>宛先住所</th>
				</tr>
				<s:iterator value="purchaseHistoryList">
					<tr>
						<td><s:property value="productName"/></td><%--商品名--%>
						<td><s:property value="productNameKana"/></td><%--商品名かな --%>
						<td><img src='<s:property value="imageFilePath"/>/
							<s:property value="imageFileName"/>' width="50px" height="50px"></td><%--商品画像 --%>
						<td><s:property value="releaseCompany"/></td><%--発売会社 --%>
						<td><s:property value="releaseDate"/></td><%--発売年月 --%>
						<td><s:property value="price"/><span>円</span></td><%--値段 --%>
						<td><s:property value="productCount"/><span>個</span></td><%--個数 --%>
						<td><s:property value="total"/><span>円</span></td><%--合計金額 --%>
						<td><s:property value="familyName"/><span>　</span><s:property value="firstName"/></td><%--宛先名前 --%>
						<td><s:property value="userAddress"/></td><%--宛先住所 --%>
					</tr>
				</s:iterator>
			</table>
			<div class="submit_btn_box">
				<s:form action="DeletePurchaseHistoryAction">
					<s:submit value="履歴削除" class="submit_btn"/>
				</s:form>
			</div>
		</s:if>
		<s:else>
			<div class="info">
				商品購入履歴情報がありません。
			</div>
		</s:else>
	</div>
</body>
</html>