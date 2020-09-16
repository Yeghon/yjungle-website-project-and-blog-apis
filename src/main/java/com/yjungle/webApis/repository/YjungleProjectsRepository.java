package com.yjungle.webApis.repository;

import com.yjungle.webApis.entity.YjungleProjects;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/*
 * Created on 9/16/20
 * Author YeghonHaron
 */
@Component
public interface YjungleProjectsRepository extends CrudRepository<YjungleProjects, Integer> {
}
