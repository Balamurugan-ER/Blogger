<%@page import="org.apache.catalina.connector.Response"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.notes.depth.ContentGeneration,org.json.JSONObject,com.notes.depth.PageInfo"%>
    
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>
   
   
    </title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <!-- Navigation bar -->
    <nav class="navbar bg-light"> <div class="container-fluid"> <a class="navbar-brand" href="#"> <img src="/My_Blogger/images/cat_transparent.png" alt="Logo" width="50" height="50" class="d-inline-block align-text-center">Depth Notes<br> Learn Concepts In Depth </a> </div></nav>
  </head>
<body class = container>
 <%
    ContentGeneration contentGeneration = new ContentGeneration();
	JSONObject pageContent = contentGeneration.getContent();
	
	/* String destination = (String)request.getAttribute("key"); */
	String destination = response.getHeader("key");
	System.out.println("Key : "+destination);
	PageInfo pageInfo = (PageInfo)pageContent.get(destination);
    %>
 <div class = clearfix container text-center style=""> <b>
<%= pageInfo.getTitle() %> 
 </b> </div>
<div class="clearfix container text-center">
  <%-- <img src="<%=  request.getContextPath()+ pageInfo.getImg_path() %>" class="col-md-6 float-md-end mb-3 ms-md-3" alt="..."> --%>
  <img src="<%= request.getContextPath()+ pageInfo.getImg_path() %>" class="col-md-6 float-md-end mb-3 ms-md-3" alt="...">
	<ul>
	<% 
	for(String content : pageInfo.getContent())
		{
			out.print("<li><p>"+content+"</p></li>");
		}
	%>
	</ul>
</div>
</body>
</html>