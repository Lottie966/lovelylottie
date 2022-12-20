package com.example.newspringboot.controller;

import com.example.newspringboot.AjaxResponse;
import com.example.newspringboot.model.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Slf4j
@RestController
public class ArticleController {
    //查询一篇文章根据id
    @RequestMapping(value = "/articles/{id}", method = RequestMethod.GET)
    public AjaxResponse getArticle(@PathVariable("id") Long id) {
        Article article = Article.builder()
                .id(1L)
                .author("zimug")
                .content("spring boot从青铜到王者")
                .createTime(new Date())
                .title("t1").build();
        log.info("article" + article);
        return AjaxResponse.success(article);
    }
}
