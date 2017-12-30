package com.xjxspace.model.system;

import com.xjxspace.model.frame.Record;

public class Menu extends Record {
	private static final long serialVersionUID =6931939270939159105L;
	private String menuId;
	private String menuParentId;
	/**
	 * 菜单编码  比如系统管理  SysManage
	 */
	private String menuCode;
	/**
	 * 菜单名称
	 */
	private String menuName;
	/**
	 * 菜单图标
	 */
	private String menuIcon;
	
	private String menuHref;
	
	/**
	 *菜单目标的类型   target=expand 展开   target = iframe 加载iframe页面
	 */
	private String targetType;
	
	private Integer menuDepth;
	
	/**
	 * 排序
	 */
	private Integer menuOrder;
	
	/**
	 * 菜单描述
	 */
	private String menuDesc;

	public String getMenuId() {
		return menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	public String getMenuParentId() {
		return menuParentId;
	}

	public void setMenuParentId(String menuParentId) {
		this.menuParentId = menuParentId;
	}

	public String getMenuCode() {
		return menuCode;
	}

	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuIcon() {
		return menuIcon;
	}

	public void setMenuIcon(String menuIcon) {
		this.menuIcon = menuIcon;
	}

	public String getMenuHref() {
		return menuHref;
	}

	public void setMenuHref(String menuHref) {
		this.menuHref = menuHref;
	}

	public String getTargetType() {
		return targetType;
	}

	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

	public Integer getMenuDepth() {
		return menuDepth;
	}

	public void setMenuDepth(Integer menuDepth) {
		this.menuDepth = menuDepth;
	}

	public Integer getMenuOrder() {
		return menuOrder;
	}

	public void setMenuOrder(Integer menuOrder) {
		this.menuOrder = menuOrder;
	}

	public String getMenuDesc() {
		return menuDesc;
	}

	public void setMenuDesc(String menuDesc) {
		this.menuDesc = menuDesc;
	}
	
	
	
}
