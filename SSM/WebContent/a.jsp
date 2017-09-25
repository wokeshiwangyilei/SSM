<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
+ path + "/";
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
<script type="text/javascript">
	$(function(){
		$.getJSON("<%=basePath%>/fuck/ff", function(data){
			 var tdata = $("#tdata");
			 for(var i=0;i<data.length;i++){
				 var tr ="<tr align='center'>"+
				 "<td>"+data[i].student.name+"</td>"+
				 	"<td>"+data[i].student.age+"</td>"+
				 	"<td>"+data[i].score+"</td>"+
				 	"<td>"+data[i].course.name1+"</td>"+
				 	"<td>"+data[i].course.credit+"</td>"+
				 	"</tr>";
				 tdata.append(tr);
			 }
		});
	})

</script>
</head>
<body>

	<h1 align="center">新闻列表</h1>
	<table align="center" border=0 width="80%">
		<thead>
			<tr >
				<th>新闻标题</th>
				<th>新闻内容</th>
				<th>新闻类型</th>
			</tr>
		</thead>
		<tbody id="tdata">
		</tbody>
	</table>
</body>
</html>