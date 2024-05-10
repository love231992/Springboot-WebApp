<%@page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <title>First JSP</title>
</head>

<body>
 Welcome to my ${name} homepage

 <form action="addAlien" method="post">
 Name : <input type="text" name="name"><br>
 Id : <input type="text" name="id"><br>
 <input type="submit">
 <hr>
 </form><form action="getAliens" method="get">
 Enter your Id : <input type="text" name="id"><br>
 <input type="submit">
 <hr>
 </form><form action="getAliensByName" method="get">
 Enter name : <input type="text" name="name"><br>
 <input type="submit">
 </form>
</body>
</html>