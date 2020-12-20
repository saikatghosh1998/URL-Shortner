/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

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
		//Link link = new Link();
        //m.addAttribute("link", link);
		return "index";
    }
	
	//Controller for converting Long URL to Short
	@RequestMapping("show")
	public String ShortUrl(@RequestParam("longUrl") String longUrl,Model m) {
		String ShortUrl = shortnerService.LongToShort(longUrl);
		 m.addAttribute("link", ShortUrl);
		return "index";
	}
	
	//Controller for fetching & Redirecting to Actual Long URL.
	@RequestMapping("/{link}")
	public RedirectView  redirectToOriginalUrl(@PathVariable String link) {
		//String longUrl = shortnerService.ShortToLong(link);
		
	    RedirectView redirectView = new RedirectView();
	    redirectView.setUrl("https://www.google.com");
		return redirectView;
	}

}
