<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 String path = request.getContextPath();
 
 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<th>id</th>
		<th>订单号</th>
		<th>操作</th>
	</tr>
	<tr>
		<th>1</th>
		<th>0909090</th>
		<th><a href="<%=path%>/order/detail/2">详情</a></th>
	</tr>
</table>
<!-- 如果controller 的方法设置了method="get"，那么post提交是进不去该方法的。 -->
<form action="<%=path%>/order/detail/2" method="get">
	<button>提交</button>
</form>
<img  src="<%=path%>/IMG_20170610_163442.jpg">
</body>
</html>