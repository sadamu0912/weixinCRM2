package com.xjxspace.controller.project;

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

@Controller
@RequestMapping("/project")
public class ProjectController extends ControllerHandler{
	//简单的逻辑直接写在controller中，复杂的逻辑再创建service包
	@Autowired
	private ProjectMapper projectMapper;
	
	/**
	 * 首页
	 */
	@RequestMapping(value="/simpleList",method=RequestMethod.GET)
	public String getProjectSimpleList(@RequestParam Map<String,Object> params,Model model){
		return "project/pageList";
	}
	
	@RequestMapping(value="/pageList",method=RequestMethod.GET)
	public String getProjectListWithPage(@RequestParam Map<String,Object> params,Model model){
		Integer count = projectMapper.getRecordsCount(params);
		Pagination 	pageInfo = getPaginationInfo(params, count);
		return null;
	}
}
