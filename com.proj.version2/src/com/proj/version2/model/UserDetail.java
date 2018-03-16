package com.proj.version2.model;

import javax.persistence.*;

@Entity
@Table(name="user_detail")
public class UserDetail {

	@Id
	@GeneratedValue
	private Integer id;
	
	private Integer userId;
	private String microblogId;
	private String wechatId;
	private String zhihuId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getMicroblogId() {
		return microblogId;
	}
	public void setMicroblogId(String microblogId) {
		this.microblogId = microblogId;
	}
	public String getWechatId() {
		return wechatId;
	}
	public void setWechatId(String wechatId) {
		this.wechatId = wechatId;
	}
	public String getZhihuId() {
		return zhihuId;
	}
	public void setZhihuId(String zhihuId) {
		this.zhihuId = zhihuId;
	}
	
	
}
