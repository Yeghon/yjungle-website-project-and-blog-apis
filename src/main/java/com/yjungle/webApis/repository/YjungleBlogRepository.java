package com.yjungle.webApis.repository;

import com.yjungle.webApis.entity.YjungleBlog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 * Created on 9/16/20
 * Author YeghonHaron
 */
@Repository
public interface YjungleBlogRepository extends JpaRepository<YjungleBlog, Integer> {
}
