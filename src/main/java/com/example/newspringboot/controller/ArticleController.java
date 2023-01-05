package com.example.newspringboot.controller;

import com.example.newspringboot.AjaxResponse;
import com.example.newspringboot.model.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Slf4j
@RestController
public class ArticleController {
    //查询一篇文章根据id

    //@RequestMapping(value = "/articles/{id}", method = RequestMethod.GET)
    @GetMapping("/articles/{id}")
    public AjaxResponse getArticle(@PathVariable("id") Long id) {
        Article article = Article.builder()
                .id(1L)
                .author("zimug")
                .content("spring boot从青铜到王者")
                .createTime(new Date())
                .title("t1").build();
        log.info("Article:" + article);
        return AjaxResponse.success();
    }

    //新增一篇文章
    //@RequestMapping(value = "/articles", method = RequestMethod.POST)
    @PostMapping("/articles")
    public AjaxResponse saveArticle(@RequestBody Article article) {
        log.info("Save article:" + article);
        return AjaxResponse.success();
    }

    //修改一篇文章
    //@RequestMapping(value = "/articles", method = RequestMethod.PUT)
    @PutMapping("/articles")
    public AjaxResponse updateArticle(@RequestBody Article article) {
        if (article.getId() == null) {
            // 抛出自定义异常
        }
        log.info("Update article:" + article);
        return AjaxResponse.success();
    }

    //删除一篇文章，根据id
    //@RequestMapping(value = "/articles/{id}", method = RequestMethod.DELETE)
    @DeleteMapping("/articles/{id}")
    public AjaxResponse deleteArticle(@PathVariable("id") Long id) {
        log.info("deleteArticle:" + id);
        return AjaxResponse.success();
    }
}