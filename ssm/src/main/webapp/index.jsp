<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
<a href="/book/findBook">查询书籍</a>
<br>
<form action="/book/savaBook" method="post">
    书名:<input type="text" name="bookName"><br>
    作者:<input type="text" name="author"><br>
    公司:<input type="text" name="company"><br>
    价钱:<input type="text" name="price"><br>
    <input type="submit" value="存储">
</form>
</body>
</html>
