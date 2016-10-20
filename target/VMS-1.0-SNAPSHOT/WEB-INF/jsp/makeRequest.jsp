<%-- 
    Document   : MakeRequest
    Created on : Sep 12, 2016, 2:28:48 PM
    Author     : M Asha Madushani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Make Request</title>
        <link rel="stylesheet" href="vms_resources/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="vms_resources/css/style.css">
        <script src="vms_resources/js/jquery.min.js"></script>
        <script src="vms_resources/js/bootstrap.min.js"></script>
    </head>




    <div class=container-fluid>
        <div class=row>
            <div class=hc1>
                <div class="col-md-12">
                    <img src="vms_resources/img/logo_cropped.png" width="250px" align="left">
                    <p>You are logged in as {email}</p>
                    <a href="logout" >LogOut </a>
                </div>

            </div>
        </div>
    </div>

    <body style="background-color:#DADFE1;">


        <!-- <div class=container-fluid>
                <div class=row>
                        <div class="col-md-12">
                                <p align="right">You are logged in as admin</p> 
                        </div>
                </div>
        </div> -->
        <br/><br/>
        <div class="navbar" >


            <button type="button" class="btn btn-default btn-lg btnSide" aria-label ="Left Align" >
                <span class="glyphicon glyphicon-home " aria-hidden="true"></span>
                <a href="home.html" style=" margin-left:10px">  Home</a>


            </button><br>
            <button type="button" class="btn btn-default btn-lg btnSide" aria-label ="Left Align" >
                <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                <a href="MakeRequest.html" style=" margin-left:10px">  Make Request</a>


            </button><br>
            <button type="button" class="btn btn-default btn-lg btnSide" aria-label ="Left Align" >
                <span class="glyphicon glyphicon-file" aria-hidden="true"></span>
                <a href="ViewRequest.html" style=" margin-left:10px">  View Request</a>


            </button><br>
            <button type="button" class="btn btn-default btn-lg btnSide" aria-label ="Left Align" >
                <span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
                <a href="CancelRequest.html" style=" margin-left:10px">  Cancel Request</a>


            </button><br>
            <button type="button" class="btn btn-default btn-lg btnSide" aria-label ="Left Align" >
                <span class="glyphicon glyphicon-cog" aria-hidden="true" ></span>
                <a href="setting.html" style="margin-left:10px">  Setting</a>


            </button><br>
            <br>



        </div>

        <div class="contain" >
            <div class="contain1">
                <p align="center">Make Request</p>

                <!-- Begining of the form -->

                <form:form action="makerequest" method="post" modelAttribute="request">
                    <form:hidden path="id"/>
                    
                    <table>
                        <tr>
                            <td>
                                Starting point
                            </td>
                            <td>
                                <form:input type="text" list="dde" path="starting_point"/>
                                <datalist  id="dde">
                                    <option value="UCSC">UCSC</option>
                                    <option value="UGC">UGC</option>
                                    <option value="College House">College House</option>
                                    <option value="BIT Office">BIT Office</option>
                                </datalist>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Ending point
                        </td>
                        <td>
                                <form:input type="text" list="dde" path="destination"/>
                                <datalist  id="dde">
                                    <option value="UCSC">UCSC</option>
                                    <option value="UGC">UGC</option>
                                    <option value="College House">College House</option>
                                    <option value="BIT Office">BIT Office</option>
                                </datalist>
                            
                        </td>
                    </tr>

                    <div class="form-group">
                        <tr>
                            <td>
                                Required Date
                            </td>
                            <td>
                                <form:input type="date" name="date" class="form-control" path="date"/>
                            </td>
                        </tr>
                    </div>
                    <tr>
                        <td>
                            Starting time
                        </td>
                        <td>
                            <form:input type="time" name="usr_time" class="form-control" path="time"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Number of passengers
                        </td>
                        <td>
                            <form:input type="number" name="pasnger" min="1" value="1" class="form-control" path="noOfPersons"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Vehicle type
                        </td>
                        <td>
                            <form:select class="form-control" path="vehicle_type">
                        <option value="Van">Van</option>
                        <option value="Three Wheeler">Three Wheeler</option>
                        <option value="Bus">Bus</option>
                        <option value="Car">Car</option>
                    </form:select>
                    </td>
                    </tr>
                    <tr>
                        <td>
                            Purpose of the visit
                        </td>
                        <td>
                            <form:textarea class="form-control" name="reason" rows="4" cols="30" path="description"/>

                        </td>
                    </tr>
                    <tr>
                        <td>
                            Check if you need to keep the vehicle
                        </td>
                        <td>
                            <input type="checkbox" id="keep" class="mdl-checkbox__input" path=""/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Check if you need an A/C vehicle
                        </td>
                        <td>
                            <input type="checkbox" id="AC" class="mdl-checkbox__input" path=""/>
                        </td>
                    </tr>
                </table>
                <br>
                <input type="submit" name="" value="Submit Request" class="btn btn-primary">
            </form:form>
        </div>

        <div class="chart">
            <form align="center">
                <input type="date" name="" >
            </form>
            <br><br>
            <table border="1" width="100%">
                <tr>
                    <th style="width:25%;">Time</th>
                    <th>vehicle 1 State</th>
                    <th>vehicle 2 State</th>
                </tr>
                <tr>
                    <td>8.00-9.00</td>
                    <td> <input type="lable" name="initials" class="form-control"></td>
                    <td>  <input type="lable" name="initials" class="form-control"></td>
                </tr>
                <tr>
                    <td>9.00-10.00</td>
                    <td> <input type="lable" name="initials" class="form-control"></td>
                    <td>  <input type="lable" name="initials" class="form-control"></td>
                </tr>
                <tr>
                    <td>10.00-11.00</td>
                    <td> <input type="lable" name="initials" class="form-control"></td>
                    <td>  <input type="lable" name="initials" class="form-control"></td>
                </tr>
                <tr>
                    <td>11.00-12.00</td>
                    <td> <input type="lable" name="initials" class="form-control"></td>
                    <td>  <input type="lable" name="initials" class="form-control"></td>
                </tr>
                <tr>
                    <td>12.00-1.00</td>
                    <td> <input type="lable" name="initials" class="form-control"></td>
                    <td>  <input type="lable" name="initials" class="form-control"></td>
                </tr>
                <tr>
                    <td>1.00-2.00</td>
                    <td> <input type="lable" name="initials" class="form-control"></td>
                    <td>  <input type="lable" name="initials" class="form-control"></td>
                </tr>
                <td>2.00-3.00</td>
                <td> <input type="lable" name="initials" class="form-control"></td>
                <td>  <input type="lable" name="initials" class="form-control"></td>
                </tr>
                <td>3.00-4.00</td>
                <td> <input type="lable" name="initials" class="form-control"></td>
                <td>  <input type="lable" name="initials" class="form-control"></td>
                </tr>
                <td>4.00-5.00</td>
                <td> <input type="lable" name="initials" class="form-control"></td>
                <td>  <input type="lable" name="initials" class="form-control"></td>
                </tr>
            </table>

        </div>
    </div>



</body>
</html>




