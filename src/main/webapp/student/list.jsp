<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 19/2/2024
  Time: 10:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Danh sách học sinh</title>
</head>
<body>
<h2>Danh sách học sinh</h2>
<p><a href="student?action=create">Tạo mới</a></p>
<form method="post">
    <table border="1">
        <tr>
           <td>Stt</td>
           <td>Tên</td>
           <td>Email</td>
           <td>Địa chỉ</td>
           <td>Sửa</td>
           <td>Xóa</td>
        </tr>
        <c:forEach items="${ds}" var="student">
            <tr>
                <td>${student.id}</td>
                <td>${student.nameStudent}</td>
                <td>${student.email}</td>
                <td>${student.address}</td>
            </tr>
        </c:forEach>
    </table>

</form>
</body>
</html>
