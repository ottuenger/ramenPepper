<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>マイページ</title>
</head>
<body>
<h2>〇〇さんのページ</h2>
<form action="/ramenPepper/SearchServlet" method="post">
<p>ラーメン</p>
  <input type="search" name="search" placeholder="キーワードを入力">
  <input type="submit" name="submit" value="検索">
</form>
<br />
<a href="/ramenPepper/FavoriteListServlet">お気に入り</a><br />
<a href="/ramenPepper/RegisterServlet?a=1">ユーザー情報編集</a><br />
<a href="/ramenPepper/RegisterServlet?a=2">退会</a><br />
<a href="/ramenPepper/InquiryServlet">お問合せ</a><br />
<a href="/ramenPepper/LogOutServlet">ログアウト</a><br />
</body>
</html>