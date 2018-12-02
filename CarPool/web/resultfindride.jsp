<%-- 
    Document   : resultfindride
    Created on : Nov 17, 2018, 12:52:12 PM
    Author     : him
--%>
<%@ page import ="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<style>
#customers {
    font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

#customers td, #customers th {
    border: 1px solid #ddd;
    padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers th {
    padding-top: 12px;
    padding-bottom: 12px;
    text-align: left;
    background-color: #4CAF50;
    color: white;
}
</style>
</head>
<body>
<table id="customers">
    <tr>
    <th>Pick Up : </th>
    <th>Destination : </th>
    <th>Date : </th>
    <th>time : </th>
    <th>Price : </th>
    <th>User : </th>
    <th> </th>
    </tr>
<% 
           
         try{
         String leavingfrom = request.getParameter("pickUp");
         String destination = request.getParameter("destination");
         String date = request.getParameter("date");
         String time = request.getParameter("time");
         
         Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acadview",
            "root", "");
         Statement st = con.createStatement();
         ResultSet rs;
         rs = st.executeQuery("select * from registerride where place1='" + leavingfrom + "' and place2='" + destination + "' and date = '" + date + "' and time = '" + time + "'"); 
          while (rs.next()){ 
           %>
           <tr>
             <td> <%= rs.getString("place1") %></td>
             <td><%=rs.getString("place2") %></td>
             <td><%=rs.getString("date") %></td>
             <td><%=rs.getString("time") %></td>
             <td><%=rs.getString("price") %></td>
             <td><%=rs.getString("username") %></td>
             <td> <a href="bookride.jsp" > Book </a> </td>
           </tr>
           <%
         } 
         st.close();
        %>        
         </table> <%
         } catch(Exception exe){
           
                 
                   out.println(exe); %>
           
                   <a href="findride.jsp" > TRY AGAIN </a> 
                   <%
                    
         }
    %>
    
    </body>
</html>

