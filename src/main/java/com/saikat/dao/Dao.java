package com.saikat.dao;

import java.util.List;

import com.saikat.model.Link;

public interface Dao {
	
	public int saveLink(Link link);
	public void update(Link link);
	public Link getLink(String shortLink);

}
