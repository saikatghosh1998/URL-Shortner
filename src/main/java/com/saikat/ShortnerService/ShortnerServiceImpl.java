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
			String shortUrl = "";		
		
			link.setLongUrl(longUrl);              //setting the long url in LINK object
			int id = dao.saveLink(link);           //saving the long url in db and getting the row id.
					
			shortUrl = convert.idToShortURL(id);   //Calling function to get short URL.
			
			link.setShortUrl(shortUrl);            //setting the short url in LINK object.
			
			dao.update(link);                      //Updating short URL in DB.
			
			return shortUrl;
			
		
	}

	//This function will Fetch the long URL from DB
	public String ShortToLong(String shortUrl) {
		Link link = new Link();
		 link  = dao.getLink(shortUrl);		
		
		return link.getLongUrl();
		//return "https://www.example.com";
	}
	
	
      
   
}
