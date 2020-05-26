<%-- 
    Document   : index
    Created on : Apr 15, 2020, 11:22:21 PM
    Author     : ashu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="imageServlet" method="post" enctype="multipart/form-data" >
            <input type="text" name="name">
            <input type="file" name="file" >
            <button type="submit"> Submit</button>
            <!--Step-1==Yaha se data imageServlet par jayega-->
        </form>
    </body>
</html>
