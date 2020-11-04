package com.yjungle.webApis.controller;

/*
 * Created on 9/16/20
 * Author YeghonHaron
 */

import com.yjungle.webApis.dao.WebApisDao;
import com.yjungle.webApis.entity.YjungleBlog;
import com.yjungle.webApis.entity.YjungleProjects;
import com.yjungle.webApis.repository.YjungleBlogRepository;
import com.yjungle.webApis.repository.YjungleProjectsRepository;
import com.yjungle.webApis.utils.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

@RestController
public class Controller {

    public Logger logger = LoggerFactory.getLogger(Controller.class);

    @Autowired
    private Environment environment;

    @Autowired
    private WebApisDao dao;

    @RequestMapping("/")
    public String home(){
        logger.info("It works");
        System.out.println("It works!");
        return "It works!";
    }

    @RequestMapping(value = "/projects", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> createProject(@RequestBody HashMap<String, String> requestData){

        ApiResponse apiResponse = new ApiResponse();

        if (dao.createProject(requestData) == 1) {
            apiResponse.setResponseCode("00");
            apiResponse.setResponseMessage("Project created successfully");
        } else {
            apiResponse.setResponseCode("01");
            apiResponse.setResponseMessage("Sorry, could not create project");
        }

        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }

    private String formatDate() {
        String pattern = "dd/M/yyyy hh:mm";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(new Date());
    }


    @RequestMapping(value = "/blog", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> createBlog(@RequestBody HashMap<String, String> requestData){

        ApiResponse apiResponse = new ApiResponse();

        if (dao.createBlog(requestData) == 1) {
            apiResponse.setResponseCode("00");
            apiResponse.setResponseMessage("Blog created successfully");
        } else {
            apiResponse.setResponseCode("01");
            apiResponse.setResponseMessage("Sorry, could not create blog");
        }

        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }


}
