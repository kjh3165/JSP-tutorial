package com.ll.jsp.board.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/people")
public class PeopleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Rq rq = new Rq(req, resp);

        String name = rq.getParam("name", "");
        int age = rq.getIntParam("age", 0);
        int height = rq.getIntParam("height", 0);

        rq.writer("이름: %s<br/>".formatted(name));
        rq.writer("나이: %d<br/>".formatted(age));
        rq.writer("키: %d".formatted(height));
    }
}
