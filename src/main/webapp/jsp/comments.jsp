<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Leopa
  Date: 2019/4/1
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        table tbody tr:nth-of-type(2n+1){
            background-color: aquamarine;
        }
        #main{
            width:1190px;
            margin: auto;
        }
        table{
            width: 1190px;
        }
    </style>
</head>
<body>
<div id="main">
    <div>
        <table border="1">
            <thead>
            <tr>
                <th colspan="4"><h2>评论列表</h2><input type="button" onclick=""value="返回新闻列表"/></th>
            </tr>
            <tr>
                <th>评论编号</th>
                <th>评论内容</th>
                <th>评论人</th>
                <th>评论时间</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${comments}" var="obj">
                <tr>
                    <th>${obj.id}</th>
                    <th>${obj.content}</th>
                    <th>${obj.author}</th>
                    <th><fmt:formatDate value="${obj.createDate}" pattern="yyyy-MM-dd HH:MM:ss"></fmt:formatDate></th>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>

</div>
</body>
</html>
