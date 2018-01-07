package com.xjxspace.controller.project;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.xjxspace.mapper.project.ProjectMapper;

@Controller
@RequestMapping("/project")
public class ProjectController {
	@Autowired
	private ProjectMapper projectMapper;
	
	/**
	 * 首页
	 */
	@RequestMapping(value="/simpleList",method=RequestMethod.GET)
	public String getProjectSimpleList(@RequestParam Map<String,Object> params,Model model){
		return "project/list";
	}
}
