package com.nearby.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nearby.beans.Message;

@RestController
public class DummyController {
	
	@RequestMapping("/message/{name}")
	public Message message(@PathVariable("name") String name) {
		return new Message("hello ", name);
	}
}
