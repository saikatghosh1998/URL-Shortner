

package com.saikat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.saikat.ShortnerService.ShortnerService;

@Controller
public class HomeController {
	
	@Autowired
	private ShortnerService shortnerService;
    
	@RequestMapping("/")
    public String  home(Model m){
		return "index";
    }
	
	//Controller for converting Long URL to Short
	@RequestMapping("show")
	public String ShortUrl(@RequestParam("longUrl") String longUrl,Model m) {
		String ShortUrl = shortnerService.LongToShort(longUrl);
		String surl = "bitzy.in/"+ShortUrl;
		 m.addAttribute("link", surl);
		return "result";
	}
	
	//Controller for fetching & Redirecting to Actual Long URL.
	@RequestMapping("/{link}")
	public RedirectView  redirectToOriginalUrl(@PathVariable String link) {
		String longUrl = shortnerService.ShortToLong(link);
		
		//String s="https://www.google.com";
	    RedirectView redirectView = new RedirectView();
	    redirectView.setUrl(longUrl);
	    
		return redirectView;
	}

}
