<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'i.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">


</head>

<body>
<img alt="" src="<%=basePath%>1.png">
	<table class="table table-bordered table-hover">

		<!--表头-->
		<tr class="info">
			<td style="width: 20%">1</td>
			<td style="width: 20%">2</td>
			<td style="width: 20%">3</td>
			<td style="width: 10%">4</td>
			<td style="width: 10%">5</td>
			<td style="width: 20%">6</td> 
		</tr>

			<!--表数据-->

			<c:forEach var="n" items="${mess}">
				<tr>
					<td style="vertical-align: middle">${n.id }</td>
					<td style="vertical-align: middle">${n.name }</td>
					<td style="vertical-align: middle">${n.age }</td>
					<td style="vertical-align: middle">${n.score.score}</td>
					<td style="vertical-align: middle">${n.course.name}</td>
					<td style="vertical-align: middle">${n.course.credit }</td>

				</tr>
			</c:forEach>

		</table>
</body>
</html>