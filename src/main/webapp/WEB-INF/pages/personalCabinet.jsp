<%--
  Created by IntelliJ IDEA.
  model.User: VyaceslavBoyko
  Date: 01.07.17
  Time: 17:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <title>Cabinet</title>
</head>
<body>
<h2>Welcome, ${user_name}</h2>
<p/>
<a href="html/payment.html">Make payment</a>
<p/>
<div style="background-color: azure">
    <label>My services</label><br/>
    <select>
        <option>Telephony</option>
        <option>SMS</option>
        <option>Internet</option>
    </select>
    <button>Add</button><br/>
    <p/>
    <table cellspacing="2" border="1" cellpadding="5">
        <tr>
            <td>Service</td>
            <td>DayActivated</td>
            <td>DateDeactivated</td>
            <td>Payroll</td>
            <td>     </td>
        </tr>
        <tr>
            <td>${service_name}</td>
            <td><time>${start_date}</time></td>
            <td><time>${end_date}</time></td>
            <td>${payroll}</td>
            <td><button>deacivate</button></td>
        </tr>
    </table>
</div><br/>
<div style="background-color: azure";>
    <label>My bills</label><br/>
    <p/>
    <table cellspacing="2" border="1" cellpadding="5">
        <tr>
            <td>Filename</td>
            <td>Bill date</td>
            <td>  </td>
        </tr>
        <tr>
            <td>${file_name}</td>
            <td><time>${bill_date}</time></td>
            <td><button>download</button></td>
        </tr>
        <tr>
            <td>${file_name}</td>
            <td><time>${bill_date}</time></td>
            <td><button>download</button></td>
        </tr>
    </table>

</div>

</body>
</html>
