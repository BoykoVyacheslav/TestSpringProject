<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<form style="line-height: 25px" action="MyServlet" method="POST">
    <input name="name" placeholder="Name" /> <br/>
    <input name="login" placeholder="Your e-mail" /> <br/>
    <input name="pass" type="password" placeholder="Password" /> <br/>
    <button name="submit">Register</button>
</form>
</body>
</html>