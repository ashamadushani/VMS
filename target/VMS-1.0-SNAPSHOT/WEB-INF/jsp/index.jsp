<%-- 
    Document   : index
    Created on : Aug 27, 2016, 3:46:27 PM
    Author     : M Asha Madushani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="vms_resources/css/style.css">
        <link rel="stylesheet" href="vms_resources/css/bootstrap.min.css">
        <script src="vms_resources/js/jquery.min.js"></script>
        <script src="vms_resources/js/bootstrap.min.js"></script>
        
        <title>VMS | Welcome</title>
    </head>

    <body style="background-color:#DADFE1;">
        <br>
        <div class="account">
            <a href="signup">Create an account</a>
        </div>
        <br><br><br>
        <div align=center>
            <img src="vms_resources/img/logo_final.png" width=40%>
        </div>

        <br><br><br>
        <div align=center >
            <div style="border: 1px solid DarkGray;
                 border-radius: 5px; width:350px; align:center; padding:20px; background-color:lightgray;" >
                <form:form modelAttribute="login" method="POST" action="signin">


                    <form:input type="email" class="form-control" placeholder="Email" style="max-width:300px" path="email"/>
                    <br>
                    <form:input type="password" class="form-control" placeholder="Password" style="max-width:300px" path="password"/>
                    
                    <br>
                    <label style="color: red; font-size: 12px">${error}</label>
                    <br>
                    <input type="submit" value="Login" class="btn btn-primary"><br><br>
                    <a href="forgetPassword">Forget Password</a>

                </form:form>
            </div>

            <!-- <footer>
            
            
            
              <p align=center>University of Colombo School of Computing, Vehicle and transport management system. Powered by QFix Solutions </p>
            </footer>
            -->
            <br><br>
            <div class="footer">
                <div align=center>University of Colombo School of Computing, Vehicle and transport management system. Powered by QFix Solutions </div>
            </div>

    </body>
</html>
