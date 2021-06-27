package com.saikat.ShortnerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saikat.dao.Dao;
import com.saikat.model.Link;
import com.saikat.utility.baseConverter;


@Service
public class ShortnerServiceImpl implements ShortnerService{

	@Autowired
    private baseConverter convert;
	
	@Autowired
	private Dao dao;
    
	//Function to Convert Long URL to Short
	public String LongToShort(String longUrl) {
		
		Link link = new Link();
		link  = dao.getLink(longUrl);
		String shortUrl = "";
		
		//checking if LONG URL already exist in DB
		//if long URL is not present in DB then convert it to short URL
		//if(link.getShortUrl() == null) {
		
		
			link.setLongUrl(longUrl);              //setting the long url in LINK object
			int id = dao.saveLink(link);           //saving the long url in db and getting the row id.
					
			shortUrl = convert.idToShortURL(id);   //Calling function to get short URL.
			
			link.setShortUrl(shortUrl);            //setting the short url in LINK object.
			
			dao.update(link);                      //Updating short URL in DB.
			return shortUrl;
			
		//}
//		else { //If URL exist, return the short URL.
//			String shortUrl = link.getShortUrl();
//			return "Link already exist: "+shortUrl;
//		}
			
		
	}

	//This function will Fetch the long URL from DB
	public String ShortToLong(String shortUrl) {
		Link link = new Link();
		 link  = dao.getLink(shortUrl);		
		
		return link.getLongUrl();
		//return "https://www.google.com";
	}
	
	
      
   
}
