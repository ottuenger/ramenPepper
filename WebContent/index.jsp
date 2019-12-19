<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>RamenPepper</title>
</head>
<body>
<h1>RamenPepper</h1>


<form action="/ramenPepper/LoginServlet" method="get">
<input type="submit" name="login" value="ログイン" />
</form>

<form action="/ramenPepper/RegisterServlet" method="get">
<input type="submit" name="newN" value="新規登録" />
</form>

</body>
</html>