<%--
  Created by IntelliJ IDEA.
  model.User: VyaceslavBoyko
  Date: 01.07.17
  Time: 17:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Creating...</title>
</head>
<body>
<h2>Welcome, ${user_name}</h2>

<label>Creation of Subscriber</label><br/>
<p></p>
<form style="line-height: 25px">
    <input name="subs_name" placeholder="Enter name"> <br/>
    <input name="subs_adress" placeholder="Enter adress"> <br/>
    <button type="submit">Create</button>
    <br/>

    <label>Add subscriber services</label><br/>
    <p/>
    <table style="line-height: 20px" border="5">
        <tr>
            <td>Service</td>
            <td>Date Activated</td>
            <td>Date Deactivated</td>
            <td>Payroll</td>
        </tr>
        <tr>
            <td>
                <select>
                    <option>Phone</option>
                    <option>SMS</option>
                    <option>Internet</option>
                </select>
            </td>
            <td><input type="date" name="calendar"></td>
            <td><input type="date" name="calendar"></td>
            <td>${service_payroll}</td>  <!--See DataBase logic-->
        </tr>

    </table>

</form>


</body>
</html>
