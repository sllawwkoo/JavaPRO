package com.gmail.sllawwkoo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class QuestionaryServlet extends HttpServlet {
    private Map<Integer, Map<String, Integer>> statistic = new HashMap<>();

    public void init() throws ServletException {
        super.init();
        statistic.put(1, new HashMap<String, Integer>());
        statistic.put(2, new HashMap<String, Integer>());
        statistic.get(1).put("Java", 0);
        statistic.get(1).put("PHP", 0);
        statistic.get(2).put("IntelliJ IDEA", 0);
        statistic.get(2).put("Eclipse", 0);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        int age = Integer.valueOf(request.getParameter("age"));
        String answerOne = request.getParameter("language");
        String answerTwo = request.getParameter("IDE");

        Map<String, Integer> mapOne = statistic.get(1);
        Integer countOne = mapOne.get(answerOne);
        if (countOne != null) {
            mapOne.put(answerOne, countOne + 1);
        }
        Map<String, Integer> mapTwo = statistic.get(2);
        Integer countTwo = mapTwo.get(answerTwo);
        if (countTwo != null) {
            mapTwo.put(answerTwo, countTwo + 1);
        }

        request.setAttribute("name", name);
        request.setAttribute("surname", surname);
        request.setAttribute("age", age);
        request.setAttribute("statistic", statistic);

        RequestDispatcher rd = getServletContext().getRequestDispatcher("/statistic.jsp");
        rd.forward(request, response);

    }
}















