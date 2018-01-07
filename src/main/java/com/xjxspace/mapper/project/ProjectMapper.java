package com.xjxspace.mapper.project;

import java.util.List;

import com.xjxspace.model.frame.BasicMapper;
import com.xjxspace.model.project.Project;


public interface ProjectMapper extends BasicMapper<Project>{
	List<Project> getAllProjects();
}
