<%-- 
    Document   : offerride
    Created on : Nov 17, 2018, 11:34:21 AM
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
  
	.offer-ride {
		width: 370px;
    	margin: 130px auto;
       }
    .offer-ride form {
    	margin-bottom: 15px;
        padding: -10px;
    }
    .offer-ride h2 {
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
    body{
        background-image: url('img6.png');
    }
    </style>
</head>
<body>
        <div class="offer-ride">
            <form action="resultofferride.jsp" method="post">
                <table>
                    <tr>
                        <td><div class="form-group">
		    <input type="text" class="form-control" name="pickUp" placeholder="PICK UP" required="required">
                            </div>	</td>		
                            <td><div class="form-group">
                    <input type="text" class="form-control" name="destination" placeholder="DROP OFF" required="required">
                                </div></td></tr>
                </table>
                <div class="form-group">
                    <input type="text" class="form-control" name="stopover1" placeholder="stopover1" >
                    <input type="text" class="form-control" name="stopover2" placeholder="stopover2" >
                    <input type="text" class="form-control" name="stopover3" placeholder="stopover3" >
                </div>
                <table>
                    <tr>
                        <td>  <div class="form-group">
                      <input type="text" class="form-control" name="UserName" placeholder="UserName" >
                            </div></td>
                            <td><div class="form-group">
                    <input type="date" class="form-control" name="date" required="required">
                                </div></td></tr>
                </table>
                <div class="form-group">
                    <input type="time" class="form-control" name="time" required="required">
                </div>
                <div class="form-group">
                    <input type="number" class="form-control" name="seats" placeholder="Number of Seats" required="required">
                </div>
                <div class="form-group">
                    <input type="number" class="form-control" name="price" placeholder="Price per co-traveller" required="required">
                </div>
                    <input type="submit" class="btn btn-primary btn-block" value="Submit" style="background: green; border-radius: 8px; font-family: verdana;"><br><br>
	    </form>
	</div>		        
</body>
</html>