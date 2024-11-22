
<%@page import="com.sena.moduloauth.pages.Session"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bienvenido usuario <%=Session.get(request.getSession(), "email") %></h1>
        
        <a href="<%= request.getContextPath()%>/logout">cerrar session</a>
    </body>
</html>
