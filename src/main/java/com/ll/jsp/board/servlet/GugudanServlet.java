package com.ll.jsp.board.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/gugudan")
public class GugudanServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Rq rq = new Rq(req, resp);

        //gugudan?dan=8&limit=9
        int dan = rq.getIntParam("dan", 1);
        int limit = rq.getIntParam("limit", 1);

        rq.writer("<h1>===구구단 %d단===</h1>".formatted(dan));
        for(int i=1; i<=limit; i++){
            rq.writer("<div>%d * %d = %d</div>".formatted(dan, i, dan*i));
        }
    }
}
