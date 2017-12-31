package com.xjxspace.controller.system;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xjxspace.mapper.system.MenuMapper;
import com.xjxspace.model.frame.RestResult;
import com.xjxspace.model.system.Menu;
import com.xjxspace.util.Common;

@Controller
@RequestMapping("/menu")
public class MenuController {
	@Autowired
	private MenuMapper menuMapper;
	
	@ResponseBody
	@RequestMapping("/list/all")
	public RestResult listAll() {
		List<Map<String,Object>> menuMaps ;
		try{
			List<Menu>  menuList= menuMapper.getAllMenus();
			menuMaps = Common.listToMapList(menuList, Menu.class);
		}catch(Exception e){
			e.printStackTrace();
			return new RestResult(500, "获取菜单列表失败", null);
		}
		return new RestResult(200, "获取菜单列表成功", "result",menuMaps);
	}
	
}
