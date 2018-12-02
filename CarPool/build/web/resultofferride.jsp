<%-- 
    Document   : resultofferride
    Created on : Nov 17, 2018, 2:21:20 PM
    Author     : him
--%>

<%@ page import ="java.sql.*" %>
<% 
    String leavingfrom = request.getParameter("pickUp");
    String destination = request.getParameter("destination");
    String stop1 = request.getParameter("stopover1");
    String stop2 = request.getParameter("stopover2");
    String stop3 = request.getParameter("stopover3");
    String uName = request.getParameter("UserName");
    String date = request.getParameter("date");
    String time = request.getParameter("time");
    String seat = request.getParameter("seats");
    String price = request.getParameter("price");
    
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acadview",
            "root", "");
    Statement st = con.createStatement();
    int i = st.executeUpdate("insert into registerride(place1,place2,stop1,stop2,stop3,username,date,time,seat,price) values ('" + leavingfrom + "','" + destination + "','" + stop1 + "','" + stop2 + "','" + stop3 + "','" + uName 
            + "','" + date+ "','" + time + "','" + seat + "','" + price + "')");
    if(i>0){
        out.println("Ride Created successfully");
        response.sendRedirect("success.jsp");
    }
    else{
        response.sendRedirect("offerride.jsp");
    }
    
%>