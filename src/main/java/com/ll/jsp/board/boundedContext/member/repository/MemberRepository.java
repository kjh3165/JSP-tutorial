package com.ll.jsp.board.boundedContext.member.repository;

import com.ll.jsp.board.boundedContext.base.Container;
import com.ll.jsp.board.boundedContext.member.dto.Member;
import com.ll.jsp.board.db.DBConnection;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MemberRepository {
    private List<Member> memberList;
    DBConnection dbConnection;

    public MemberRepository(){
        memberList = new ArrayList<>();
        dbConnection = Container.dbConnection;
    }

    public void save(String username, String password, String name) {
        dbConnection.insert(
                """
                    INSERT INTO member
                    SET
                    username = '%s',
                    password = '%s',
                    name = '%s',
                    regDate = now()
                """.formatted(username, password, name));
    }

    public Member findByUsername(String username) {
        return memberList.stream()
                .filter( member -> member.getUsername().equals(username))
                .findFirst()
                .orElse(null);
    }
}
