<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
</style>
<script type="text/javascript" src="../js/test.js"></script>
<script type="text/javascript" src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
<meta charset="UTF-8">
<title>test</title>
</head>
<body>
<center>
<table border="1">
<tr>
<th>id</th>
<th>name</th>
</tr>
<c:forEach items="${list}" var="user">
<tr>
<td>
${user.id}
</td>
<td>
${user.name}
</td>
</tr>
</c:forEach>
</table>
</center>
</body>
</html>