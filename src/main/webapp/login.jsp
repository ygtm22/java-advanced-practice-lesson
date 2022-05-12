<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>入力画面</title>
</head>
<body>
<div>
  <form action="LoginServlet" method="post">
  <fieldset>
   <c:if test="${not empty errMsg}">
    <p>${fn:escapeXml(errMsg)}</p>
    </c:if>
    <div>ID: <input type="text" name="id">
    <c:if test="${not empty idErrMsg }">
    <span>${fn:escapeXml(idErrMsg)}</span>
    </c:if>
    </div>
    <div>PASS: <input type="password" name="password">
    <c:if test="${not empty passErrMsg }">
    <span>${fn:escapeXml(passErrMsg)}</span>
    </c:if>
    </div>
    </fieldset>
    <div><button type="submit">送信</button></div>
  </form>
</div>
</body>
</html>
