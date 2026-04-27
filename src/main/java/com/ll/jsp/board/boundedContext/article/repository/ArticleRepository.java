package com.ll.jsp.board.boundedContext.article.repository;

import com.ll.jsp.board.boundedContext.article.dto.Article;
import com.ll.jsp.board.boundedContext.base.Container;
import com.ll.jsp.board.db.DBConnection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.LongStream;

public class ArticleRepository {
    private List<Article> articleList;
    DBConnection dbConnection;

    public ArticleRepository() {
        articleList = new ArrayList<>();
        dbConnection = Container.dbConnection;
    }

    public List<Article> findAll() {
        List<Map<String, Object>> rows = dbConnection.selectRows("select * from article");
        System.out.println(rows);

        for (Map<String, Object> row : rows) {
            Article article  = new Article(row);
            articleList.add(article);
        }

        return articleList;
    }

    public long save(String title, String content) {
        long id = dbConnection.insert(
                """
                    INSERT INTO article
                    SET title='%s',
                    content='%s'
                """.formatted(title, content));
        return id;
    }

    public Article findById(long id) {
        return articleList.stream()
                .filter(article -> article.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void modify(long id, String title, String content) {
        Article article = findById(id);
        if(article == null) return;

        article.setTitle(title);
        article.setContent(content);
    }

    public void delete(long id) {
        // articleList.removeIf(article -> article.getId()==id);
        Article article = findById(id);
        articleList.remove(article);
    }
}
