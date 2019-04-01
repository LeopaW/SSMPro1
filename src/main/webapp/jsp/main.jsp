<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            <form action="${ctx}/news/query/title">
                <span>新闻标题</span><input type="text" name="title" value="${title}"/><input type="submit" value="查询"/>
            </form>
        </div>
        <div>
            <table border="1">
                <thead>
                <tr>
                    <th colspan="6"><h2>新闻列表</h2></th>
                </tr>
                <tr>
                    <th>新闻编号</th>
                    <th>新闻标题</th>
                    <th>新闻摘要</th>
                    <th>作者</th>
                    <th>创建时间</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${news}" var="obj">
                    <tr>
                        <th>${obj.id}</th>
                        <th>${obj.title}</th>
                        <th>${obj.summary}</th>
                        <th>${obj.author}</th>
                        <th>${obj.createDate}</th>
                        <th>
                            <a href="${ctx}/comments/query/newsid/${obj.id}">查看评论</a>
                            <a href="${ctx}/comments/addTo/${obj.id}">评论</a>
                            <a href="${ctx}/news/delete/${obj.id}">删除</a>
                        </th>
                    </tr>
                </c:forEach>
                <tr>
                    <td colspan="6">
                        <c:if test="${deleteFlag eq true}">
                           <span style="color: red;"> 删除成功</span>
                        </c:if>
                        <c:if test="${deleteFlag eq false}">
                            <span style="color: yellow;"> 删除成功</span>
                        </c:if>
                    </td>
                </tr>

                </tbody>
            </table>
        </div>

    </div>
</body>
</html>
