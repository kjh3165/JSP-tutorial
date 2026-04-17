package com.ll.jsp.board.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/wiseSaying")
public class WiseSayingServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8"); // 들어오는 데이터를 UTF-8로 인코딩
        resp.setCharacterEncoding("UTF-8"); // 응답 데이터를 UTF-8로 인코딩
        resp.setContentType("text/html; charset=UTF-8");

        String content = req.getParameter("content");
        String author = req.getParameter("author");

        resp.getWriter().append("<h1>명언</h1>");
        resp.getWriter().append("명언: %s<br/>".formatted(content));
        resp.getWriter().append("작가: %s<br/>".formatted(author));

    }
}
