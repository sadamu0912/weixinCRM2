package com.xjxspace.model.system;


import com.xjxspace.model.frame.Record;

import java.util.Date;

public class User  extends Record {

	private static final long serialVersionUID =6931939270939159104L;
	/**
     * 主键
     */
    private String userId;

    /**
     * 姓名
     */
    private String userName;
    private String userNumber;

    private String password;

    private Integer enable;
    
    private Integer del;

    private String createUserId;

    private Date createTime ;

    private String updateUserId;

    private Date updateTime ;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getEnable() {
		return enable;
	}

	public void setEnable(Integer enable) {
		this.enable = enable;
	}

	public Integer getDel() {
		return del;
	}

	public void setDel(Integer del) {
		this.del = del;
	}

	@Override
	public String getCreateUserId() {
		return createUserId;
	}

	@Override
	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	@Override
	public Date getCreateTime() {
		return createTime;
	}

	@Override
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String getUpdateUserId() {
		return updateUserId;
	}

	@Override
	public void setUpdateUserId(String updateUserId) {
		this.updateUserId = updateUserId;
	}

	@Override
	public Date getUpdateTime() {
		return updateTime;
	}

	@Override
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
