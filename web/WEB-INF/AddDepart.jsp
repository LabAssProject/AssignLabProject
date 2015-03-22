<%-- 
    Document   : AddDepart
    Created on : Mar 20, 2015, 11:08:40 AM
    Author     : JETS_ITI
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Department</title> 
        <script>
            function checkName() {
                name = document.forms[0].getElementsById("name");
                if (name.value.trim == "")
                    document.getElementsById("errorname").innerHTML = "Please,Enter Department Name";
                else if (name.value != null) {
                    var req;
                    if (window.XMLHttpRequest) {// code for IE7+, Firefox, Chrome, Opera, Safari
                        req = new XMLHttpRequest();
                    }
                    else {// code for IE6, IE5
                        req = new ActiveXObject("Microsoft.XMLHTTP");
                    }
                    req.onreadystatechange = function() {
                        if (req.readyState == 4 && req.status == 200) {
                            if (req.responseText == "exsit"){
                                document.getElementsById("errorname").innerHTML = "Department exist";
                            }else{
                                document.getElementsById("errorname").innerHTML="";
                            }
                        }
                    }
                    req.open("GET", "http://localhost:8080/AssignLabProject/GG?name="+name.value, true);
                    req.send(null);
                }

            }
        </script>
    </head>
    <body>
        <form name="myform" methd="post" action="">
            <input type="text" id="name" name="name" onblur=""/><span id="errorname"></span>
            <textarea col="20" rows="5" id="description" name="description"></textarea>
            <input type="submit" value="Add" onclick="checkName()"/>
        </form> 
    </body>
</html>
