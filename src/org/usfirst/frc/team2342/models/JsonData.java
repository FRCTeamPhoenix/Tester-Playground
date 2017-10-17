package org.usfirst.frc.team2342.models;

import java.util.List;

public final class JsonData 
{
	public PageInfo pageInfo;
	public List<Post> posts;
	
	public PageInfo getPageInfo() {
		return pageInfo;
	}
	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}
	public List<Post> getPosts() {
		return posts;
	}
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
}
