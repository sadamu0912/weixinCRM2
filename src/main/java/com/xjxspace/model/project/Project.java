package com.xjxspace.model.project;

import com.xjxspace.model.frame.Record;

public class Project extends Record {
	private static final long serialVersionUID =6931939270939159108L;
	
	private String projectId;
	private String projectName;
	/**
	 * 项目进度
	 */
	private Float  projectProgress;
	/**
	 * 项目状态
	 */
	private String projectState;
	/**
	 * 项目状态码
	 */
	private String projectStateCode;
	/**
	 * 小程序的二维码路径
	 */
	private String projectImage;
	
	/**
	 * 被用户查看次数
	 */
	private int projectViewCount;
	
	/**
	 * 被用户收藏次数
	 */
	private int projectLoveCount;
	/**
	 * 被用户评论次数
	 */
	private int projectCommentCount;
	/**
	 * 小程序客户坐落的城市
	 */
	private String projectCustomerCity;
	/**
	 * 小程序客户坐落的城市 行政规划码
	 */
	private String projectCustomerCityCode;
	private String projectCustomerName;
	private String projectCustomerPhone;
	private String projectCustomerEmail;
	private String projectTypeName;
	private String projectTypeCode;
	private Integer del;
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public Float getProjectProgress() {
		return projectProgress;
	}
	public void setProjectProgress(Float projectProgress) {
		this.projectProgress = projectProgress;
	}
	
	
	
	public String getProjectState() {
		return projectState;
	}
	public void setProjectState(String projectState) {
		this.projectState = projectState;
	}
	public String getProjectStateCode() {
		return projectStateCode;
	}
	public void setProjectStateCode(String projectStateCode) {
		this.projectStateCode = projectStateCode;
	}
	public String getProjectImage() {
		return projectImage;
	}
	public void setProjectImage(String projectImage) {
		this.projectImage = projectImage;
	}
	public int getProjectViewCount() {
		return projectViewCount;
	}
	public void setProjectViewCount(int projectViewCount) {
		this.projectViewCount = projectViewCount;
	}
	public int getProjectLoveCount() {
		return projectLoveCount;
	}
	public void setProjectLoveCount(int projectLoveCount) {
		this.projectLoveCount = projectLoveCount;
	}
	public int getProjectCommentCount() {
		return projectCommentCount;
	}
	public void setProjectCommentCount(int projectCommentCount) {
		this.projectCommentCount = projectCommentCount;
	}
	public String getProjectCustomerCity() {
		return projectCustomerCity;
	}
	public void setProjectCustomerCity(String projectCustomerCity) {
		this.projectCustomerCity = projectCustomerCity;
	}
	public String getProjectCustomerCityCode() {
		return projectCustomerCityCode;
	}
	public void setProjectCustomerCityCode(String projectCustomerCityCode) {
		this.projectCustomerCityCode = projectCustomerCityCode;
	}
	public String getProjectCustomerName() {
		return projectCustomerName;
	}
	public void setProjectCustomerName(String projectCustomerName) {
		this.projectCustomerName = projectCustomerName;
	}
	public String getProjectCustomerPhone() {
		return projectCustomerPhone;
	}
	public void setProjectCustomerPhone(String projectCustomerPhone) {
		this.projectCustomerPhone = projectCustomerPhone;
	}
	public String getProjectCustomerEmail() {
		return projectCustomerEmail;
	}
	public void setProjectCustomerEmail(String projectCustomerEmail) {
		this.projectCustomerEmail = projectCustomerEmail;
	}
	public String getProjectTypeName() {
		return projectTypeName;
	}
	public void setProjectTypeName(String projectTypeName) {
		this.projectTypeName = projectTypeName;
	}
	public String getProjectTypeCode() {
		return projectTypeCode;
	}
	public void setProjectTypeCode(String projectTypeCode) {
		this.projectTypeCode = projectTypeCode;
	}
	public Integer getDel() {
		return del;
	}
	public void setDel(Integer del) {
		this.del = del;
	}
	
	
}
