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

<title>王亦雷</title>

<meta http-equiv="keywords" content="关键字1,关键字2,关键字3">
<meta http-equiv="description" content="写个介绍">
<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
<script type="text/javascript"> 
$(function(){
	
		var form=new FormData($("#dddd")[0]);
		$.ajax({
			url: "<%=basePath%>up/uppp", 
			data:form,
			type:"post",
			processData: false,
		    contentType: false,
		    async : false, 
	        cache : false,
	        success:function(data){
	        	console.log("-------ppp上传....---")
	        	var jsoObj = JSON.parse(data);
	        	$("#myPhoto").attr("src","<%=basePath%>"+jsoObj.imgePath)
	        }
		});
	
})
</script>
</head>
<body>
	<form id="dddd" enctype="mulipart/form-data">
		文件:<input type="file" name="file" />
		<button type="button" id="but">啊啊</button>
	</form>
	<br>
	<img  width="50px" id="myPhoto">
</body>
</html>