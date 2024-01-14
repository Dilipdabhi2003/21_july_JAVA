package com.model;

public class ReviewModel 
{
	private int reviewid;
	private String name,email,rating,comments;
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public int getReviewid() {
		return reviewid;
	}
	public void setReviewid(int reviewid) {
		this.reviewid = reviewid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
}
