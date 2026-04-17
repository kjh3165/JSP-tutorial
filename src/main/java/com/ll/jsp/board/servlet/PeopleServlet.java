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
        req.setCharacterEncoding("UTF-8"); // 들어오는 데이터를 UTF-8로 인코딩
        resp.setCharacterEncoding("UTF-8"); // 응답 데이터를 UTF-8로 인코딩
        resp.setContentType("text/html; charset=UTF-8");

        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        int height = Integer.parseInt(req.getParameter("height"));

        resp.getWriter().append("이름: %s<br/>".formatted(name));
        resp.getWriter().append("나이: %d<br/>".formatted(age));
        resp.getWriter().append("키: %d".formatted(height));
    }
}
