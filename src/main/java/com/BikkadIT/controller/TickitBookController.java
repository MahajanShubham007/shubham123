package com.BikkadIT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.model.Passanger;
import com.BikkadIT.model.Ticket;
import com.BikkadIT.service.TicketBookServiceImpl;

@RestController
public class TickitBookController {

	@Autowired
	private TicketBookServiceImpl ticketBookServiceImpl;
	
	@PostMapping(value ="/ticketBook", consumes = "application/json",produces = "application/json")
	public ResponseEntity<Ticket> ticketBook(@RequestBody Passanger passanger){
		Ticket bookTicket = ticketBookServiceImpl.bookTicket(passanger);
		return new ResponseEntity<Ticket>(bookTicket,HttpStatus.OK);
		
	}
}
