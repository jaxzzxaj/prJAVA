<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>メイン画面</title>
</head>
<body>
<%
	Integer sessionId =(Integer)
	session.getAttribute("sessionId");

	if(sessionId != null){
%>
	<b>ログアウト</b>
<%
	}else{
%>
	<b>新規登録</b>
	<b>ログイン</b>
<%
	}
%>
</body>
</html>