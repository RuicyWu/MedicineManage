<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title></title>
	<link rel="stylesheet" type="text/css" href="../images/styles.css">
	
  </head>
  <body>
  <div class="div1">
		<table width="100%" cellpadding="0" cellspacing="0" border="0"	align="center">
			<tr>
				<td class="td_title1">·<bean:message key="system.current.place"/>当前位置：进货/需求管理&gt;&gt;添加进货</td>
			</tr>
			<tr>
				<td bgcolor="#FFFFFF" height="50">
					<br>
   <form action="req_save.jsp" method="post" >
      <table border="0" align="center" width="300">
        <tr>
          <td align="right">药品编码：</td>
          <td align="left"><input type="text" name="" /></td>
          <td align="left"><input type="submit" value="提交" /></td>
        </tr>
      </table>
    <form>
    </td>
			</tr>
		</table>
	</div>
  </body>
</html>
