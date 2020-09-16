package com.yjungle.webApis.dao;

import java.util.HashMap;

public interface WebApisDao {

    Integer createProject(HashMap<String, String> requestData);

    Integer createBlog(HashMap<String, String> requestBody);
}
