<%-- 
    Document   : driverView
    Created on : Oct 18, 2016, 7:50:00 PM
    Author     : Tishan Madhawa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
      

    <link rel="stylesheet" href="vms_resources/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="vms_resources/css/style.css">
    <script src="vms_resources/js/jquery.min.js"></script>
    <script src="vms_resources/js/bootstrap.min.js"></script>
    <div class=container-fluid>
        <div class=row>
            <div class=hc1>
                <div class="col-md-12">
                    <img src="vms_resources/img/logo_cropped.png" width="20%" align="left">
                    <p>You are logged in as ${email}</p>
                    <a href="#" >LogOut </a>
                </div>

            </div>
        </div>
    </div>

    <body style="background-color:#DADFE1;">

        <br><br>
        <div class="container-fluid">
            <div class="row">

                <div class=" col-md-2" style="border: 1px solid DarkGray; border-radius: 5px; padding:5px;  align:center; background-color:lightgray; margin-left:30px; color:black;" >


                    <button type="button" class="btn btn-default btn-lg" aria-label ="Left Align" style="background-color: lightgray;color:Blue;width:210px; height:40px ">
                        <span class="glyphicon glyphicon-home" aria-hidden="true"style="margin-left:-70px;"></span>
                        <a href="home.html" style="font-size:12px; margin-left:10px">  Home</a>


                    </button>
                    <button type="button" class="btn btn-default btn-lg" aria-label ="Left Align" style=" background-color: lightgray;color:Blue;width:210px; height:40px">
                        <span class="glyphicon glyphicon-pencil" aria-hidden="true" style="margin-left:-30px;"></span>
                        <a href="makerequest" style="font-size:12px; margin-left:10px">  Make Request</a>
                    </button>
                    <button type="button" class="btn btn-default btn-lg" aria-label ="Left Align" style=" background-color: lightgray;color:Blue;width:210px; height:40px">
                        <span class="glyphicon glyphicon-file" aria-hidden="true"style="margin-left:-30px;"></span>
                        <a href="ViewRequest.html" style="font-size:12px; margin-left:10px">  View Request</a>


                    </button>
                    <button type="button" class="btn btn-default btn-lg" aria-label ="Left Align" style="background-color: lightgray;color:Blue;width:210px; height:40px">
                        <span class="glyphicon glyphicon-trash" aria-hidden="true"style="margin-left:-25px;"></span>
                        <a href="CancelRequest.html" style="font-size:12px; margin-left:10px">  Cancel Request</a>


                    </button>
                    <button type="button" class="btn btn-default btn-lg" aria-label ="Left Align" style="background-color: lightgray;color:Blue;width:210px; height:40px">
                        <span class="glyphicon glyphicon-cog" aria-hidden="true" style="margin-left:-70px;"style="margin-left:-70px;"></span>
                        <a href="setting.html" style="font-size:12px; margin-left:10px">  Setting</a>


                    </button>
                    <br><br>

                    <nav>

                    <ul class="nav">
                                <li><a class ="nav" href="#"  data-toggle="collapse" data-target="#submenu1" aria-expanded="false" style="font-size: 15px; color: #0050ff;">Request Management <span class="glyphicon glyphicon-chevron-down"></span></a>
                                            <ul class="nav collapse" id="submenu1" role="menu" style="font-size: 13px; margin-left:10px; color: #0080ff;">
                                                    <li><a class="nav" href="request_apprv.html" style="color: #0080ff;">Request Approve</a></li>
                                                    <li><a class="nav" href="Recommend.html" style="color: #0080ff;">Recommend Request</a></li>
                                            </ul>
                                    </li>
                                    <li><a class ="nav" href="#"  data-toggle="collapse" data-target="#submenu3" aria-expanded="false" style="font-size: 15px; color: #0050ff;">User Management <span class="glyphicon glyphicon-chevron-down"></span></a>
                                            <ul class="nav collapse" id="submenu3" role="menu" style="font-size: 13px; margin-left:10px; color: #0080ff;">        <li><a class="nav" href="addUser.html" style="color: #0080ff;">Add User</a></li>
                                                    <li><a class="nav" href="addUser.html" style="color: #0080ff;">Add User</a></li>
                                                    <li><a class="nav" href="driverView" style="color: #0080ff;">Driver</a></li>
                                                    <li><a class="nav" href="#" style="color: #0080ff;">Remove User</a></li>

                                            </ul>
                                    </li>
                                    <li><a  class="nav" href="#"  data-toggle="collapse" data-target="#submenu2" aria-expanded="false" style="font-size: 15px; color: #0050ff;">Vehicle Management    <p class="glyphicon glyphicon-chevron-down"></p></a>
                                            <ul class="nav collapse" id="submenu2" role="menu" style="font-size: 13px; margin-left:10px; color: #0080ff;">
                                                    <li><a  class="nav" href="#"  data-toggle="collapse" data-target="#submenu4" aria-expanded="false" style="font-size: 14px; color: #0050ff;">Update Vehicle    <p class="glyphicon glyphicon-chevron-down"></p></a>
                                                            <ul class="nav collapse" id="submenu4" role="menu" style="font-size: 13px; margin-left:15px; color: #0080ff;">
                                                                    <li><a class="nav" href="reg_vehicle.html" style="color: #0080ff;">Register a Vehicle</a></li>
                                                                    <li><a class="nav" href="Particulars_of_the_Vehicle.html" style="color: #0080ff;">Add Vehicle</a></li>
                                                                    <li><a class="nav" href="remove_vehicle.html" style="color: #0080ff;">Remove Vehicle</a></li>

                                                                    <li><a class="nav" href="Annual_Licence.html" style="color: #0080ff;">Annual Licence</a></li>
                                                                    <li><a class="nav" href="ChagesOfDrivers.html" style="color: #0080ff;">Change of Drivers</a></li>
                                                                    <li><a class="nav" href="custody.html" style="color: #0080ff;">Custody</a></li>
                                                                    <li><a class="nav" href="Deficiencies.html" style="color: #0080ff;">Deficiencies</a></li>
                                                                    <li><a class="nav" href="fue_lConsuption.html" style="color: #0080ff;">Fuel Consumption</a></li>
                                                                    <li><a class="nav" href="Repairs.html" style="color: #0080ff;">Repairs</a></li>
                                                                    <li><a class="nav" href="Repalacement.html" style="color: #0080ff;">Replacement</a></li>
                                                                    <li><a class="nav" href="Running_Chart.html" style="color: #0080ff;">Running Chart</a></li>
                                                                    <li><a class="nav" href="running_Chart2.html" style="color: #0080ff;">Running Chart 2</a></li>
                                                                    <li><a class="nav" href="survicing.html" style="color: #0080ff;">Survicing</a></li>
                                                                    <li><a class="nav" href="tools.html" style="color: #0080ff;">Tools</a></li>
                                                                    <li><a class="nav" href="Transfer_of_Ownership.html" style="color: #0080ff;">Transfer of Ownership</a></li>
                                                                    <li><a class="nav" href="Tyres.html" style="color: #0080ff;">Tyres</a></li>

                                                            </ul>
                                                    </li>
                                            <li><a  class="nav" href="#"  data-toggle="collapse" data-target="#submenu5" aria-expanded="false" style="font-size: 14px; color: #0050ff;">Accident    <p class="glyphicon glyphicon-chevron-down"></p></a>
                                                            <ul class="nav collapse" id="submenu5" role="menu" style="font-size: 13px; margin-left:15px; color: #0080ff;">
                                                                    <li><a class="nav" href="accidents.html" style="color: #0080ff;">Accidents</a></li>
                                                            </ul>


                                                    </li>
                                            </ul>
                                    </li>
                            </ul>
                    </nav>


                </div>

                <div class="contain">
                
		<div class="panel panel-default">
			  <!-- Default panel contents -->
		  	<div class="panel-heading"><span class="lead">List of Drivers </span></div>
			<table class="table table-hover">
	    		<thead>
		      		<tr>
				        <th>Name</th>
				        <th>EmpID</th>
				        <th>Contact No</th>
				        <th>License ID</th>
				        <th width="100"></th>
				        <th width="100"></th>
					</tr>
		    	</thead>
	    		<tbody>
				<c:forEach items="${drivers}" var="driver">
					<tr>
						<td>${driver.name}</td>
						<td>${driver.empID}</td>
						<td>${driver.contactNo}</td>
						<td>${driver.licenceNo}</td>
						
                                                <td><a href="<c:url value='/edit-driver-${driver.empID}' />" class="btn btn-success custom-width">edit</a></td>
						<td><a href="<c:url value='/delete-driver-${driver.empID}' />" class="btn btn-danger custom-width">delete</a></td>
					
                                        </tr>
				</c:forEach>
	    		</tbody>
	    	</table>
		</div>
	 	<div class="well">
	 		<a href="addDriver">Add New Driver</a>
	 	</div>
                
                </div>

                                        
            </div>
                </body>
                </html>
