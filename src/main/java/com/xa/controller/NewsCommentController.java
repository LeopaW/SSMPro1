package com.xa.controller;

import com.sun.javafx.image.IntPixelGetter;
import com.xa.pojo.NewsComment;
import com.xa.service.NewsCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Controller
@RequestMapping("/comments")
public class NewsCommentController {

    @Autowired
    private NewsCommentService newsCommentService;

    @RequestMapping("/query/newsid/{id}")
    public String queryCommentsByNewsId(@PathVariable("id")Integer newsid, Model model){

        List<NewsComment> list = newsCommentService.queryCommentsByNewsId(newsid);
        model.addAttribute("comments",list);
        return "comments";

    }


    @RequestMapping("/addTo/{id}")
    public String addTo(@PathVariable("id")Integer newsid, Model model){
        model.addAttribute("newsId",newsid);
        return "addComment";
    }


    @RequestMapping("/add")
    public String add(NewsComment newsComment,Model model){
        boolean suc = newsCommentService.add(newsComment);
        List<NewsComment> list = newsCommentService.queryCommentsByNewsId(newsComment.getNewsDetail().getId());
        model.addAttribute("comments",list);
        return "comments";
    }
}
