<%-- 
    Document   : health
    Created on : Dec 4, 2021, 10:46:12 AM
    Author     : conrad
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@taglib uri="abc.tld" prefix="vaccination" %>
        <form method=POST>
            <label for="cname">Enter the Health center name:</label><br>
            <input type="text" id="cname" name="cname"><br>
            <label for="loc">Enter the Health center location:</label><br>
            <input type="text" id="loc" name="loc"><br>
            <label for="pat">Enter the number of Health center patients</label><br>
            <input type="text" id="pat" name="pat"><br>
            <label for="id">Enter the Health center id if you wish to update</label><br>
            <input type="text" id="id" name="id"><br>
            <input type="submit" value="Submit">
        </form>
        <% String centername = request.getParameter("cname");
           String location = request.getParameter("loc");
           String patients = request.getParameter("pat");
           String patients = request.getParameter("id");
        %>
        <%if (id != null){%>
        <vaccination:insert table="HealthCenter" values="'<%=centername%>', '<%=location%>', '<%=patients%>'"/>
        <%} else {%>
        <vaccination:update table="HealthCenter" where="<%=id%>" newvalue="<%=centername%>, <%=location%>, <%=patients%>"/>
        <%
            int i = 0;
            String[] strArray = new String[4];
            if (i < 5){
                strArray = <vaccination:select table="HealthCenter" displayformat="list" where id="${(i+1)}"/>
                if(strArray[5]==null){
                out.println("Number of vaccines needed for center" + (i+1) + "is" + strArray[3]);
                }else
                out.println("Number of vaccines needed for center" + (i+1) + "is" + strArray[5]);
            i++;
            }
        %>
    </body>
</html>
