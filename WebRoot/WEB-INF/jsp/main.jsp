<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>首页</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<style type="text/css">
table {
	border-collapse: collapse;
	border-spacing: 0;
	border-left: 1px;
	solid: #888;
	border-top: 1px; solid #888;
	background: #efefef;
}

th,td {
	border-right: 1px solid #888;
	border-bottom: 1px solid #888;
	padding: 5px 15px;
}

th {
	font-weight: bold;
	background: #ccc;
}
</style>
</head>

<body>
欢迎【${sessionScope.user.username}】访问
	 <table border="1">
		<tr>
			<th>封面</th>
			<th>书名</th>
			<th>作者</th>
			<th>价格</th>
		</tr>
		<c:forEach items="${requestScope.list_book}" var="book">
			<tr>
				<td><img src="/images/${book.image}" height="60"></td>
				<td>${book.name}</td>
				<td>${book.author}</td>
				<td>${book.price}</td>
			</tr>
		</c:forEach>
	</table> 
</body>
</html>
