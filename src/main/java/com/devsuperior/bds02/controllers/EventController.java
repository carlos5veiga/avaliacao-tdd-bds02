package com.devsuperior.bds02.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.bds02.services.EventService;

@RestController
public class EventController {

	@Autowired
	private EventService service;
}
