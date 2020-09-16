package com.yjungle.webApis.controller;

/*
 * Created on 9/16/20
 * Author YeghonHaron
 */

import com.yjungle.webApis.dao.WebApisDao;
import com.yjungle.webApis.entity.YjungleProjects;
import com.yjungle.webApis.repository.YjungleBlogRepository;
import com.yjungle.webApis.repository.YjungleProjectsRepository;
import com.yjungle.webApis.utils.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class Controller {

    @Autowired
    private YjungleBlogRepository blogRepository;

    @Autowired
    private YjungleProjectsRepository projectsRepository;

    @Autowired
    private Environment environment;

    @Autowired
    private WebApisDao dao;

    @RequestMapping("/")
    public String home(){
        return "It works!";
    }

    @RequestMapping(value = "/projects", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> createProject(@RequestBody HashMap<String, String> requestBody){

        ApiResponse apiResponse = new ApiResponse();

        if (dao.createProject(requestBody) == 1) {
            apiResponse.setResponseCode("00");
            apiResponse.setResponseMessage("Project created successfully");
        } else {
            apiResponse.setResponseCode("01");
            apiResponse.setResponseMessage("Sorry, could not create project");
        }

        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }

    @RequestMapping(value = "/blog", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> createBlog(@RequestBody HashMap<String, String> requestBody){

        ApiResponse apiResponse = new ApiResponse();

        if (dao.createBlog(requestBody) == 1) {
            apiResponse.setResponseCode("00");
            apiResponse.setResponseMessage("Blog created successfully");
        } else {
            apiResponse.setResponseCode("01");
            apiResponse.setResponseMessage("Sorry, could not create blog");
        }

        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }


}
