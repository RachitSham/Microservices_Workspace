package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operation")
public class CartOpertaionController {

	@GetMapping("/show")
	public String showCart() {
		return "Welcome to the Instamart Cart...Saved  the Items For Purchase !!";
	}
}
