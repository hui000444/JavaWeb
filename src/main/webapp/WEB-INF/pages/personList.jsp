<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
  <head>
    <title>My JSP 'index.jsp' starting page</title>
  </head>

  <body>
<h2>用户列表</h2>
<h2>${zzz}</h2>

        <div style="padding:10px;"><a href="${pageContext.request.contextPath}/person/tocreate.action">新增</a></div>

<table border="1">
<tr>
    <td>id</td>
    <td>name</td>
    <td>age</td>
    <td>操作</td>
</tr>

<c:forEach items="${personList}" var="p">
<tr>
    <td>${p.id}</td>
    <td>${p.name}</td>
    <td>${p.age}</td>
    <td>
        <a href="${pageContext.request.contextPath}/person/update.action?id=${p.id}">修改</a>
        <a href="${pageContext.request.contextPath}/person/delete.action?delId=${p.id}">删除</a>
    </td>
</tr>
</c:forEach>

</table>
  </body>
</html>
