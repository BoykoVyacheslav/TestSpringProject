<%@ page contentType="text/html;charset=UTF-8" %>
<html lang="en">
<head>
    <title>model.Entities.Payment</title>
</head>
<body>
<h2>Manage your balance here</h2><br/>
<label style="margin-left: 30px">Make a payment</label><br/>
<p/>
<div style="margin-left: 30px;line-height: 25px">
    <input name="card_number" pattern="[0-1]{4,4}\ \[0-1]{4,4}\ \[0-1]{4,4}\ [0-1]{4,4}" placeholder="Card#"><br/>
    <input placeholder="Expire date" pattern="[0-9]{2,2}\/\[0-9]{2,2}"><br/>
    <input type="password" pattern="[0-9]{3,3}" placeholder="CVV"><br/>
    <input type="number" placeholder="Amount">
</div>
<button style="margin-left: 60px;width: 70px" type="submit">Pay</button>
</body>
</html>
