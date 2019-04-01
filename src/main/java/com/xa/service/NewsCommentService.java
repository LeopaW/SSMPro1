package com.xa.service;

import com.xa.pojo.NewsComment;

import java.util.List;

public interface NewsCommentService {
    List<NewsComment> queryCommentsByNewsId(Integer newsid);

    boolean add(NewsComment newsComment);
}
