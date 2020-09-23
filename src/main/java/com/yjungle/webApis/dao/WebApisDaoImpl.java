package com.yjungle.webApis.dao;

import com.yjungle.webApis.entity.YjungleBlog;
import com.yjungle.webApis.entity.YjungleProjects;
import com.yjungle.webApis.repository.YjungleBlogRepository;
import com.yjungle.webApis.repository.YjungleProjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/*
 * Created on 9/16/20
 * Author YeghonHaron
 */
@Component
public class WebApisDaoImpl implements WebApisDao{

    @Autowired
    private YjungleProjectsRepository projectsRepository;
    @Autowired
    private YjungleBlogRepository blogRepository;

    @Override
    public Integer createProject(HashMap<String, String> requestData) {
        try {
            YjungleProjects projects = new YjungleProjects();
            projects.setAuthor(requestData.get("author"));
            projects.setTitle(requestData.get("title"));
            projects.setBody(requestData.get("body"));
            projects.setDate_published(formatDate());
            projects.setDownload_url(requestData.get("download_link"));
            projects.setImage_url(requestData.get("image_link"));
            projects.setTeaser(requestData.get("teaser"));
            projects.setViews((int) (Math.random() * 100));

            projectsRepository.save(projects);

            return 1;
        } catch (Exception e){
            e.printStackTrace();
            return 0;
        }
    }

    private String formatDate() {
        String pattern = "dd/M/yyyy hh:mm";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(new Date());
    }

    @Override
    public Integer createBlog(HashMap<String, String> requestData) {
        try {
            YjungleBlog blog = new YjungleBlog();
            blog.setAuthor(requestData.get("author"));
            blog.setTitle(requestData.get("title"));
            blog.setBody(requestData.get("body"));
            blog.setDate_published(formatDate());
            blog.setImage_url(requestData.get("image_link"));
            blog.setTeaser(requestData.get("teaser"));
            blog.setViews((int) (Math.random() * 100));

            blogRepository.save(blog);

            return 1;
        } catch (Exception e){
            e.printStackTrace();
            return 0;
        }
    }
}
