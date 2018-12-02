<%
    if ((session.getAttribute("userid") == null) || (session.getAttribute("userid") == "")) {
%>
You are not logged in<br/>
<a href="index.jsp">Please Login</a>
<%} else {
%>
<div id="mid">
<div><p>Welcome <%=session.getAttribute("userid")%></p></div>
<a id="a" href='logout.jsp'>Log out</a>
<a id="b" href="offerride.jsp"> Offer a Ride </a>
<a id="c" href="findride.jsp"> Find a Ride </a>
</div>
<%
    }
%>
<style>
    #a
    {
        position:absolute;
        top:40%;
        left:63%;
        color:black;
        text-decoration:none;
        padding:5px 20px;
        font-family: sans-serif;
        font-size:30px;
    }
    #b
    {
        position: absolute;
        top:40%;
        left:43%;
         color:black;
        text-decoration:none;
        padding:5px 20px;
        font-family: sans-serif;
        font-size:30px;
    }
    #c
    {
        position:absolute;
        top:40%;
        left:25%;
         color:black;
        text-decoration:none;
        padding:5px 20px;
        font-family: sans-serif;
        font-size:30px;
    }
    #a:hover
    {
        border: 1px solid black;
    }
     #b:hover
    {
        border: 1px solid black;
    }
     #c:hover
    {
        border: 1px solid black;
    }
    p{
        position:absolute;
        top:10%;
        left:42%;
        font-size:35px;
        font-family:sans-serif;
    }
    </style>