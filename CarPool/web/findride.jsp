<%-- 
    Document   : findride
    Created on : Nov 17, 2018, 11:34:41 AM
    Author     : him
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title> Find a ride </title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
    <style type="text/css">
  
	.find-ride {
		width: 370px;
    	margin: 130px auto;
       }
    .find-ride form {
    	margin-bottom: 15px;
        padding: -10px;
    }
    .find-ride h2 {
        margin: 0 0 15px;
        
    }
    .form-control, .btn {
        min-height: 38px;
        border-radius: 2px;
    }
    .btn {        
        font-size: 15px;
        font-weight: bold;
    }
    </style>
</head>
<body background="img6.png">
        <div class="find-ride">
            <form action="resultfindride.jsp" method="post">
                <h1 class="text-center" style='color:white;'>Find a ride</h1><br><br>
		<div class="form-group">
		    <input type="text" class="form-control" name="pickUp" placeholder="Leaving from" required="required">
                </div>			
		<div class="form-group">
                    <input type="text" class="form-control" name="destination" placeholder="Going to" required="required">
                </div>
                <div class="form-group">
                    <input type="date" class="form-control" name="date" required="required">
                </div>
                <div class="form-group">
                    <input type="time" class="form-control" name="time" required="required">
                </div>
                    <input type="submit" class="btn btn-primary btn-block" value="Search" style="background: green; border-radius: 8px; font-family: verdana;"><br><br>
	    </form>
	</div>		        
</body>
</html>