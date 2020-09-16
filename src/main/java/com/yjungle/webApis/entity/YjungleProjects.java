package com.yjungle.webApis.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 * Created on 9/16/20
 * Author YeghonHaron
 */
@Entity
public class YjungleProjects  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String body;

    private String teaser;

    private String image_url;

    private String author;

    private Integer views;

    private String date_published;

    private String download_url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTeaser() {
        return teaser;
    }

    public void setTeaser(String teaser) {
        this.teaser = teaser;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public String getDate_published() {
        return date_published;
    }

    public void setDate_published(String date_published) {
        this.date_published = date_published;
    }

    public String getDownload_url() {
        return download_url;
    }

    public void setDownload_url(String download_url) {
        this.download_url = download_url;
    }

    @Override
    public String toString() {
        return "YjungleProjects{" +
                "id=" + id +
                ", body='" + body + '\'' +
                ", teaser='" + teaser + '\'' +
                ", image_url='" + image_url + '\'' +
                ", author='" + author + '\'' +
                ", views=" + views +
                ", date_published='" + date_published + '\'' +
                ", download_url='" + download_url + '\'' +
                '}';
    }
}
