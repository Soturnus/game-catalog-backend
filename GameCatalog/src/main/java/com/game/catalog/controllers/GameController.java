package com.game.catalog.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class GameController {

	@GetMapping
	public String test() {
		return "ITS GAME TIME";
	}
	
}
