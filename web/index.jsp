<%--
  Created by IntelliJ IDEA.
  User: Bobby
  Date: 29/04/2018
  Time: 1:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>

#bodydec{
 margin-left: 43%;
margin-top: 5%;
  width: fit-content;
  height: fit-content;
  background-color: darkcyan;
  padding: 1%;
}

</style>
<html>
<head>
  <title>Register</title>
</head>
<body>

<br>
<div id="bodydec">
<form method="post" action="/Register">
  <p STYLE="color: white" id="titlegraph">Register</p>
  <input type="text" placeholder="Username" name="user">
  <br>
  <br>
  <input type="password" placeholder="Password" name="pass">
  <br>
  <br>
  <input type="email" placeholder="Email" name="email">
  <br>
  <br>
  <br>
  <input type="text" placeholder="First Name" name="fname">
  <br>
  <br>
  <input type="text" placeholder="Last Name" name="lname">
  <br>
  <br>
  <input type="submit" value="Register">
</form>
  <br>
 <p id="err"> </p>
  <form method="get" action="login.jsp"><input type="submit" value="Login"></form>

</div>
</body>
</html>
