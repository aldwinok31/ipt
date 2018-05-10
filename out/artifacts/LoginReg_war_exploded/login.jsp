<%--
  Created by IntelliJ IDEA.
  User: Bobby
  Date: 29/04/2018
  Time: 1:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<style>

    #bodydec{
        margin-left: 43%;
        margin-top: 10%;
        width: fit-content;
        height: fit-content;
        background-color: darkcyan;
        padding: 1%;
    }
    #titlegraph{

        margin-left: 47%;
    }
</style>
<html>
<head>
    <title>Result</title>
</head>
<body >

<div id="bodydec">
<form method="post" action="/Login">
    <p STYLE="color: white" >Login</p>
    <input type="text" placeholder="Username" name="user">
    <br>
    <br>
    <input type="password" placeholder="Password" name="pass">
    <br>
    <br>
    <input type="submit">

</form>
    </div>
</body>
</html>
