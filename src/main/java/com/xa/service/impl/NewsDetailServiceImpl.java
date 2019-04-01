package com.xa.service.impl;

import com.xa.mapper.NewsCommentMapper;
import com.xa.mapper.NewsDetailMapper;
import com.xa.pojo.NewsDetail;
import com.xa.service.NewsDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("newsDetailService")
public class NewsDetailServiceImpl implements NewsDetailService {

    @Autowired
    NewsDetailMapper newsDetailMapper;

    @Autowired
    NewsCommentMapper commentMapper;

    @Override
    public List<NewsDetail> queryAll() {

        return newsDetailMapper.queryAll();
    }

    @Override
    public List<NewsDetail> queryByTitle(String title) {
        return newsDetailMapper.queryByTitle(title);
    }

    @Override
    public boolean delete(Integer id) {
        //调用两个mapper的方法

        //1.删除所有评论
        commentMapper.delete(id);

        //2,删除新闻
        int row = newsDetailMapper.delete(id);
        return row == 1?true:false;
    }
}
