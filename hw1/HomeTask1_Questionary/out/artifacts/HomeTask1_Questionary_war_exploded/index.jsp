<%--
  Created by IntelliJ IDEA.
  User: sllawwkoo
  Date: 30.08.2020
  Time: 18:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HomeTask1_Questionary</title>
</head>
<body>
<form action="/statistic" method="post">
    <p><b>Name:</b><br>
        <input type="text" name="name">
    </p>
    <p><b>Surname:</b><br>
    <input type="text" name="surname">
    </p>
    <p><b>Age:</b><br>
    <input type="text" name="age">
    </p>
    <p><b>What programming language do you like?</b><Br>
        <input type="radio" name="language" value="Java">Java<Br>
        <input type="radio" name="language" value="PHP">PHP<Br>
    </p>
    <p><b>What application development environment do you like best?</b><Br>
        <input type="radio" name="IDE" value="IntelliJ IDEA">IntelliJ IDEA<Br>
        <input type="radio" name="IDE" value="Eclipse">Eclipse<Br>
    </p>
    <p><input type="submit"></p>
</form>
</body>
</html>









