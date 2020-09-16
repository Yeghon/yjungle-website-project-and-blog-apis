package com.yjungle.webApis.entity;

/*
 * Created on 9/16/20
 * Author YeghonHaron
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class YjungleBlog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String body;

    private String teaser;

    private String image_url;

    private String author;

    private Integer views;

    private String date_published;
}
