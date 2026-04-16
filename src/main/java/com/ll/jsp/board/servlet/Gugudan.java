package com.ll.jsp.board.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/gugudan")
public class Gugudan extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //gugudan?dan=8&limit=9
        String danParam = req.getParameter("dan");
        String limitParam = req.getParameter("limit");
        int dan = Integer.parseInt(danParam);
        int limit = Integer.parseInt(limitParam);

        resp.setContentType("text/html; charset=UTF-8");
        resp.getWriter().append("<h1>===구구단 %d단===</h1>".formatted(dan));
        for(int i=1; i<=limit; i++){
            resp.getWriter().append("<div>%d * %d = %d</div>".formatted(dan, i, dan*i));
        }
    }
}
