package com.xa.mapper;

import com.xa.pojo.NewsDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewsDetailMapper {
    List<NewsDetail> queryAll();

    List<NewsDetail> queryByTitle(@Param("title") String title);

    int delete(Integer id);
}
