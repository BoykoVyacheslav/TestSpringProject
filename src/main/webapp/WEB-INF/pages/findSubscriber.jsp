<%--
  Created by IntelliJ IDEA.
  model.User: VyaceslavBoyko
  Date: 01.07.17
  Time: 17:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Searching...</title>
</head>
<body>
<h2>Welcome, ${user_name}</h2>
<form>
    <div><input name="user" style="width: 150px;border-radius: 5px" placeholder="Enter name" >
        <button style="width: 70px">Find</button>
    </div>
    <p/>
    <table  cellspacing="2" border="1" cellpadding="5">
        <tr>
            <td style="width: 150px">Subscriber</td>
            <td>      </td>
        </tr>
        <tr>
            <td>${user_name}</td>
            <td><button>Show</button></td>
        </tr>
    </table>
</form>

</body>
</html>
