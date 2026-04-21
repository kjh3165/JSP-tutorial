package com.ll.jsp.board.boundedContext.member.controller;

import com.ll.jsp.board.boundedContext.global.base.Rq;

public class MemberController {
    public void showJoin(Rq rq) {
        rq.view("/usr/member/join");
    }
}
