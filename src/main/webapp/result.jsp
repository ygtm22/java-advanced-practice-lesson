<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>結果画面</title>
</head>
<body>
<div>
  <p>ようこそ、${requestScope.id}さん。  </p>
  <div><button type="submit">戻る</button></div>
 <%--  <c:choose>
    <c:when test="${passwordMatch eq 'ok'}">
      <p>パスワードは一致しました。  </p>
    </c:when>
    <c:otherwise>
      <p>パスワードは一致しませんでした。  </p>
    </c:otherwise>
  </c:choose> --%>
</div>
</body>
</html>
