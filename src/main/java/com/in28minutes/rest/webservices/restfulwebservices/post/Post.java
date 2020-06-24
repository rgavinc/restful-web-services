package com.in28minutes.rest.webservices.restfulwebservices.post;

import java.util.Date;

public class Post {

    private Integer id;
    private String message;
    private Integer userId;
    private Date messageDate;

    public Post() {
    }

    public Post(Integer id, String message, Integer userId, Date messageDate) {
	super();
	this.id = id;
	this.message = message;
	this.userId = userId;
	this.messageDate = messageDate;
    }

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public String getMessage() {
	return message;
    }

    public void setMessage(String message) {
	this.message = message;
    }

    public Integer getUserId() {
	return userId;
    }

    public void setUserId(Integer userId) {
	this.userId = userId;
    }

    public Date getMessageDate() {
	return messageDate;
    }

    public void setMessageDate(Date messageDate) {
	this.messageDate = messageDate;
    }

    @Override
    public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
    }

}
