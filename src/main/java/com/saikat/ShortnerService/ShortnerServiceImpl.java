package com.saikat.ShortnerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saikat.utility.baseConverter;

@Service
public class ShortnerServiceImpl implements ShortnerService{

	@Autowired
    private baseConverter convert;
    
	//Function to Convert Long Url to Short
	public String LongToShort(String longUrl) {
		
		//Calling function to get short url
		String shortUrl = convert.idToShortURL(1234587);		
		return shortUrl;
	}

	public String ShortToLong(String shortUrl) {
		
		return null;
	}
	
	
      
   
}
