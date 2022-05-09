<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>入力画面</title>
</head>
<body>
<div>
  <form action="LoginServlet" method="post">
   <%--  <c:if test="${id != id}">
    <div>IDまたはPASSが間違っています</div>
    </c:if> --%>
  <c:choose>
    <c:when test="${id_isEmpty eq true}">
    <div>ID: <input type="text" name="id" <h3>IDは必須です</h3>></div>
    </c:when>
    <c:otherwise>
      <div>ID: <input type="text" name="id"></div>
    </c:otherwise>
  </c:choose>
  <c:choose>
    <c:when test="${pass_isEmpty eq true}">
    	<div>PASS: <input type="password" name="password" <h3>PASSは必須です</h3>></div>
    </c:when>
    <c:otherwise>
      <div>PASS: <input type="password" name="password"></div>
    </c:otherwise>
  </c:choose>
    <div><button type="submit">送信</button></div>
  </form>
</div>
</body>
</html>
