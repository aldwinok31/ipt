<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Bobby
  Date: 29/04/2018
  Time: 4:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<style>
#prices{
    background-color: white;
    color:black;

}
    #bodydec{
        margin-left: 43%;
      margin-top: 10%;
        width: fit-content;
        height: fit-content;
        background-color:darkcyan;
        padding: 1%;
        color: white;
    }
    #titlegraph{

        margin-left: 47%;
    }
</style>
<html>
<head>
    <title>Title</title>
</head>
<div id="bodydec">
<body>
<%
String s = request.getAttribute("value").toString();
out.print(" Hello " + s +"<br>");
%>
<p> LOGGED IN</p>

<br>
<br>


<p> Fruits Selection </p>
<form method="post" action="/Transaction">
<select name="Fruits">
   <option name="Apple">Apple</option>
    <option name="Mango">Mango </option>
    <option name="Orange">Orange </option>
    <option name="Pineapple">PineApple </option>

</select>



 <input type="number" name="quantity">
<div id="prices">
    <p> Apple : 10 php</p>
    <p> Pineapple : 20 php</p>
    <p> Orange: 9 php</p>
    <p> Mango : 15 php</p>
</div>
</form>






</body>
</div>
</html>
