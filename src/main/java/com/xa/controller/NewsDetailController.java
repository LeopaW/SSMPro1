package com.xa.controller;

import com.xa.pojo.NewsDetail;
import com.xa.service.NewsDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 新闻控制器
 */
@Controller
@RequestMapping("/news")
public class NewsDetailController {


    @Autowired
    NewsDetailService newsDetailService;

    //查询所有新闻
    @RequestMapping("/main")
    public String main(Model model){
        List<NewsDetail> list = newsDetailService.queryAll();
        model.addAttribute("news",list);
        return "main";
    }

    @RequestMapping("/query/title")
    public String queryByTitle(@RequestParam("title")String title,Model model){
        model.addAttribute("title",title);
        List<NewsDetail> list = newsDetailService.queryByTitle(title);
        model.addAttribute("news",list);
        return "main";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id")Integer id , Model model){
        //要删除所有的评论,删除这条新闻
        boolean suc = newsDetailService.delete(id);
        model.addAttribute("deleteFlag",suc);
        List<NewsDetail> list = newsDetailService.queryAll();
        model.addAttribute("news",list);
        return "main";
    }
}
