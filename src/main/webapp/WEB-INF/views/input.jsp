<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
**회원 정보 입력
<form action="insert" method="post">
	번호:<input type="number" name="num">
	이름:<input type="text" name="name">
	주소:<input type="text" name="addr">
	<input type="submit" value="등록">
</form>
</body>
</html>