package com.xa.service.impl;

import com.xa.mapper.NewsCommentMapper;
import com.xa.pojo.NewsComment;
import com.xa.service.NewsCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("newsCommentService")
public class NewsCommentServiceImpl implements NewsCommentService {

    @Autowired
    private NewsCommentMapper newsCommentMapper;

    @Override
    public List<NewsComment> queryCommentsByNewsId(Integer newsid) {

        return newsCommentMapper.queryCommentsByNewsId(newsid);
    }

    @Override
    public boolean add(NewsComment newsComment) {
        newsComment.setCreateDate(new Date());
        int row = newsCommentMapper.add(newsComment);
        return row == 1?true:false;
    }
}
