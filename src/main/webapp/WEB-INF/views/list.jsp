<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
**회원 정보(@MVC-Mybatis : CRUD)**<p/>
<a href="insert">회원 추가</a>
<table border="1">
	<tr>
		<th>번호</th><th>이름</th><th>주소</th><th>변경</th>
	</tr>
	<c:forEach var="i" items="${datas }">
	<tr>
		<td>${i.num }</td>
		<td>${i.name }</td>
		<td>${i.addr }</td>
		<td><a class="update" href="update?num=${ i.num}">수정</a>
		<a class="delete" href="delete?num=${i.num}">삭제</a></td>
	</tr>
	</c:forEach>
</table>
<script type="text/javascript">
$(document).ready(function() {
	$(".delete").on("click",function(){
		result = confirm('정말 삭제하시겠습니까?');
		if(result==false){
			$(".delete").attr("href","list")
		}		
	});
	$(".update").on("click",function(){
		result = confirm('정말 수정하시겠습니까?');
		if(result==false){
			$(".update").attr("href","list")
		}		
	});
});
</script>
</body>
</html>