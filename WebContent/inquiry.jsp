<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>お問合せ画面</title>
</head>
<body>
<h1>お問合せ画面</h1>
<!--
<form action="/ramenPepper/InquiryServlet" method="get">
<input type="submit" value="TOPに戻る" />
</form>
<form action="/ramenPepper/InquiryServlet" method="post">
<input type="hidden" name="from" value="確認" />
<button type="submit">確認</button>
</form>
-->
<form action="/ramenPepper/InquiryServlet" method="post">
<input type="submit" name="toTop" value="TOPに戻る" /><br>
<input type="submit" name="from" value="確認" /><br>
</form>

</body>
</html>