package com.xjxspace.mapper.system;

import java.util.List;

import com.xjxspace.model.system.Menu;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MenuMapper {
	List<Menu> getAllMenus();
}
