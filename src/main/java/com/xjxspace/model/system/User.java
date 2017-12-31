package com.xjxspace.model.system;


import com.xjxspace.model.frame.Record;

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

	


   
}
