package com.xa.service;

import com.xa.pojo.NewsDetail;

import java.util.List;

public interface NewsDetailService {
    List<NewsDetail> queryAll();

    List<NewsDetail> queryByTitle(String title);

    boolean delete(Integer id);
}
