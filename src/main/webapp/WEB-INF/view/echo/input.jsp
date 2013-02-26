<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>input.jsp</title>
</head>
<body>
<s:form method="POST">
<b><html:errors property="name"/></b>
 お名前をどうぞ
<html:text property="name" />
<s:submit property="echo" value="送信" />

<s:submit property="echo2" value="送信2" />

</s:form>
</body>
</html>
