package com.proj.version2.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="article_score")
public class ArticleScore {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private Integer userId;
	private Integer sourceId;
	private String sourceName;
	private String articleName;
	private Integer score;
	private Date time;
	private Integer forward;
	private Integer likes;
	private Integer comments;
	
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
	public Integer getSourceId() {
		return sourceId;
	}
	public void setSourceId(Integer sourceId) {
		this.sourceId = sourceId;
	}
	public String getSourceName() {
		return sourceName;
	}
	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}
	public String getArticleName() {
		return articleName;
	}
	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Integer getForward() {
		return forward;
	}
	public void setForward(Integer forward) {
		this.forward = forward;
	}
	public Integer getLikes() {
		return likes;
	}
	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	public Integer getComments() {
		return comments;
	}
	public void setComments(Integer comments) {
		this.comments = comments;
	}
	
	
}
