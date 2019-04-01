<%--
  Created by IntelliJ IDEA.
  User: Leopa
  Date: 2019/4/1
  Time: 17:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        function go(){
            history.go(-1);
        }
    </script>
</head>
<body>
    <form action="${ctx}/comments/add" method="post">
        <input type="hidden" name="newsDetail.id" value="${newsId}"/>
        <table border="1">
            <thead>
                <tr>
                    <th style="background-color: aqua" colspan="2">增加评论</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <th>评论内容</th>
                    <th><textarea cols="20" rows="5" name="content">

                    </textarea></th>
                </tr>
                <tr>
                    <th>评论人</th>
                    <th><input type="text" name="author"/></th>
                </tr>
                <tr>
                    <th colspan="2"><input type="submit" value="提交"/><input type="button" value="返回" onclick="go()"/></th>
                </tr>
            </tbody>
        </table>
    </form>
</body>
</html>
