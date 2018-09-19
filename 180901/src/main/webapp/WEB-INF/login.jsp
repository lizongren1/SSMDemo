<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录页面</title>
</head>
<body>
<div>
		<h1>用户登录</h1>
		<form action="show1.do" method="post">
			<label>Name:</label><br>
			<input type="text" name="name" /><br> 
		
			<label>Password:</label><br>
			<input type="text" name="pwd" /><br> 
			<input class="button"
				type="submit" value="登录">
				<a href="add.do">注册</a>
		</form>
	</div>
</body>
</html>