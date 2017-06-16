<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<base href="base" target="${pageContext.request.contextPath }">
<title>Insert title here</title>
</head>
<body>
	public-resources jsp ${time} ${message }ss

	<img alt="" src="/public-resources/static/images/abc.png">
	<img alt="" src="/public-resources/images/abc.png">
	<img alt="" src="/images/abc.png">
	<img alt="" src="/static/images/abc.png">
	<img alt="" src="${base1}${urls.getForLookupPath('/static/abc.png') }" />

</body>
</html>