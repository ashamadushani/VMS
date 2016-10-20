<%-- 
    Document   : user_reg
    Created on : Aug 29, 2016, 11:35:50 AM
    Author     : M Asha Madushani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>User Registration Form</title>
    </head>



    <body style="background-color:#DADFE1;">

        <!-- <style type="text/css">
                
                td{
        padding: 5px;
        }
        </style> -->

        <link rel="stylesheet" href="vms_resources/css/bootstrap.min.css">
        <script src="vms_resources/js/jquery.min.js"></script>
        <script src="vms_resources/js/bootstrap.min.js"></script>
        <link rel="stylesheet" type="text/css" href="vms_resources/css/style.css">

        <div class=container-fluid>
            <div class=row>
                <div class=hc1>
                    <div class="col-md-12">
                        <img src="vms_resources/img/logo_cropped.png" width="20%" align="left"><p style="padding-top:10px">User Registration</p></div>
                </div>
            </div>
        </div>

        <br><br>
        <div align=center >
            <p>Welcome to user registration, please enter your correct details. Once you submit your details, admin will check and approve. You will be notifify through a mail.</p><br>
            <div style="border: 1px solid DarkGray; border-radius: 5px; width:550px; align:center; padding:10px; background-color:lightgray;" >
                
                <form:form action="signup" method="post" modelAttribute="user">
                <table>
                    <form:hidden path="id"/>
                    <tr>
                        <td>
                            Name
                        </td>
                        <td>
                            <form:input type="text" name="username" class="form-control" path="username" required="required"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Email
                        </td>
                        <td>
                            <form:input type="email" name="email" class="form-control" path="email" required="required"/>
                        </td>
                    </tr>
                    
                    <tr>
                        <td>
                            Department
                        </td>
                        <td>
                            <form:select class="form-control" path="department">
                                <option value="Admin">Administration</option>
                                <option value="APB">Academic and Publication</option>
                                <option value="exam">Exam</option>
                                <option value="finance">Finance</option>
                            </form:select>
                        </td>
                    </tr>
                    
                    <tr>
                        <td>
                            Designation
                        </td>
                        <td>
                            <form:input type="text" name="designation" class="form-control" path="designation"/>
                        </td>
                    </tr>
                    
                    <tr>
                        <td>
                            Mobile Number
                        </td>
                        <td>
                            <form:input type="tel" name="telephone" class="form-control" path="telephone" required="required"/>
                        </td>
                    </tr>

                    <tr>
                        <td>
                            Password
                        </td>
                        <td>
                            <form:input type="password" name="pwd" class="form-control" path="password" required="required"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Re-enter password
                        </td>
                        <td>
                            <form:input type="password" name="pwd" class="form-control" path=""/>
                        </td>
                    </tr>

                </table>
                
                <br>
                <input type="submit" name="" value="Submit Details" class="btn btn-primary">
                </form:form>
            </div>
        </div>
    </body>
</html>
