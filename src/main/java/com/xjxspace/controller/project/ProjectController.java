/*
package com.xjxspace.controller.project;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xjxspace.mapper.project.ProjectMapper;
import com.xjxspace.model.frame.ControllerHandler;
import com.xjxspace.model.frame.Pagination;
import com.xjxspace.model.project.Project;
import com.xjxspace.util.Common;

@Controller
@RequestMapping("/project")
public class ProjectController extends ControllerHandler{
	//简单的逻辑直接写在controller中，复杂的逻辑再创建service包
	@Autowired
	private ProjectMapper mapper;
	
	*/
/**
	 * 首页
	 *//*

	@RequestMapping(value="/simpleList",method=RequestMethod.GET)
	public String getProjectSimpleList(@RequestParam Map<String,Object> params,Model model){
		Integer count = mapper.getRecordsCount(params);
		Pagination 	pageInfo = getPaginationInfo(params, count);
		model.addAttribute(Pagination.className, pageInfo);
		List<Project> projectList =mapper.getListwithPageInfo(params);
		model.addAttribute("result", projectList);
		return "project/pageList";
		//return "project/list";
	}
	
	@RequestMapping(value="/pageList",method=RequestMethod.GET)
	public String getProjectListWithPage(@RequestParam Map<String,Object> params,Model model){
		Integer count = mapper.getRecordsCount(params);
		Pagination 	pageInfo = getPaginationInfo(params, count);
		model.addAttribute(Pagination.className, pageInfo);
		mapper.getListwithPageInfo(params);
		return null;
	}
	
	@RequestMapping(value="/getProjectLayerById",method=RequestMethod.GET)
	public String getProjectLayerById(@RequestParam Map<String,Object> params,Model model){
		List<Project> project = mapper.getListByCondition(params);
		if(!Common.isEmpty(project)){
			model.addAttribute(Project.className, project.get(0));
		}
		return "project/editLayer";
	}
	
	
	*/
/**
	 * 项目分页列表
	 *//*
*/
/*
	@RequestMapping(value="/pageList",method=RequestMethod.GET)
	public String getProjectPageList(@RequestParam Map<String,Object> params,Model model){
		return "project/pageList";
	}*//*

	
}
*/
