<%@ page import="java.util.ArrayList" %>
<%@ page import="com.tablante.controller.Model.mathm" %><%--
  Created by IntelliJ IDEA.
  User: Bobby
  Date: 07/05/2018
  Time: 11:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<style>

    #bodydec{
        margin-left: 43%;

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
    <title>Recommendation</title>
</head>
<div id="bodydec">
<body>
<%
    String s = request.getAttribute("value").toString()  ;
    String s1 = request.getAttribute("value2").toString()  ;
    out.print("Your Transaction : \n" + "<br>" +"     "+ s +  " \n " + s1 + "<br>");
    out.print("<br> I see you Like : " + s1 + "<br> Try: other fruits \n"  + " <br>" );
    ArrayList string = new ArrayList<String>();
    mathm m = new mathm();
    string =  m.recommendations(s1);
    int counter = 0 ;
    while(string.size() > counter){

        out.print(
                "<br> " + string.get(counter).toString() + " <br>");
        counter++;
    }

%>

<form action="login.jsp" method="get"><input type="submit" value="Try">


</form>
</body>
</div>
</html>
