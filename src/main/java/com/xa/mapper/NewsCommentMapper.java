package com.xa.mapper;

import com.xa.pojo.NewsComment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewsCommentMapper {
    List<NewsComment> queryCommentsByNewsId(@Param("newsId") Integer newsid);

    int add(NewsComment newsComment);

    void delete(@Param("newsId") Integer id);
}
