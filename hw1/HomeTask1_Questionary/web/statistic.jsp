<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: sllawwkoo
  Date: 30.08.2020
  Time: 18:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Statistic</title>
</head>
<body>
<h3 style="color: brown">
    <%
        String name = (String) request.getAttribute("name");
        String surname = (String) request.getAttribute("surname");
        Integer age = (Integer) request.getAttribute("age");

        out.print(name + " ");
        out.print(surname + ", ");
        out.print(age + "<br>");
    %>

</h3>
<h2 style="color: deeppink ">Statistic</h2>
<h3 style="color: blue">
    <%
        Map<Integer, Map<String, Integer>> statistic = (Map<Integer, Map<String, Integer>>) request.getAttribute("statistic");

        for (Integer n : statistic.keySet()) {
            out.print("<p>");
            out.print("Question " + n + "<br>");
            Map<String, Integer> question = statistic.get(n);
            for (String key : question.keySet()) {
                out.print("<br>");
                out.print(key + " - " + question.get(key));
            }
            out.print("</p>");
        }
    %>
</h3>
</body>
</html>
