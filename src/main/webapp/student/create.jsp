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
    <title>Tạo mới học sinh</title>
</head>
<body>
<form method="post">
    <table>
        <tr>
            <td>Tên</td>
            <td><input type="text" name="nameStudent"></td>
        </tr>
        <tr>
            <td>Email</td>
            <td><input type="text" name="emailStudent"></td>
        </tr>
        <tr>
        <td>Địa chỉ</td>
        <td><input type="text" name="addressStudent"></td>
    </tr>
        <tr>
            <td>
                <button type="submit">Lưu</button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
