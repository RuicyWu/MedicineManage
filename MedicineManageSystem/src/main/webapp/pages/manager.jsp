<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>医药管理系统</title>		
	</head>	
		<frameset rows="180,*" cols="*" framespacing="0" frameborder="no"
			border="0">
			<frame src="top.jsp" name="top" scrolling="NO">
			<frameset rows="*" cols="223,*" framespacing="0" frameborder="no"
				border="0">
				<frame src="left.jsp" name="left">
				<frame src="baseData/med_list.jsp" name="main">
			</frameset>
		</frameset>
		<noframes>
			<body>
			</body>
		</noframes>
	</logic:notEmpty>
</html>
