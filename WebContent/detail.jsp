<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<title>店詳細画面</title>
<!--  script start -->
<script type="text/javascript">
	$(function(){
		$("#submit_select").change(function(){
		$("#submit_form").submit();
		});
	});
</script>
<!--  script end -->
</head>
<body>
<h1>店詳細画面</h1>
<!--  button start -->
<button type=“button” method="post" onclick="location.href='./mypage.jsp'">MyPage</button>
<button type=“button” method="get" onclick="location.href='./FavoriteListServlet'">お気に入り</button>
<form action="/ramenPepper/FavoriteListServlet" method="post">
	<input type="submit" value="&#9829;"   />
</form>
<!--  button start -->

<!--  evaluation start -->
<form  id="submit_form" method="get" action="/ramenPepper/ValueServlet">
	<select id="submit_select" name="evaluation">
		<option value="1">&#9733;</option>
		<option value="2">&#9733;&#9733;</option>
		<option value="3">&#9733;&#9733;&#9733;</option>
		<option value="4">&#9733;&#9733;&#9733;&#9733;</option>
		<option value="5">&#9733;&#9733;&#9733;&#9733;&#9733;</option>
	</select>
</form>
<!--  evaluation end -->

<!--  comment start -->
<form method="post" action="/ramenPepper/CommentServlet">
	<input type="text" name="comment"/>
	<input type="submit" value="送る"/>
</form>
<!--  comment end -->
</body>
</html>