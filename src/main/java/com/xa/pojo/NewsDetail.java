package com.xa.pojo;


import java.util.Date;
import java.util.List;

public class NewsDetail {

    private Integer id;

    private String title;

    private String summary;

    private String author;

    private Date createDate;

    private List<NewsComment> newsComments;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public List<NewsComment> getNewsComments() {
        return newsComments;
    }

    public void setNewsComments(List<NewsComment> newsComments) {
        this.newsComments = newsComments;
    }
}
