package com.BikkadIT.service;

import org.springframework.stereotype.Service;

import com.BikkadIT.model.Passanger;
import com.BikkadIT.model.Ticket;

@Service
public class TicketBookServiceImpl implements TicketBookServiceI{

	@Override
	public Ticket bookTicket(Passanger passanger) {
		
		if(passanger==null) {
			return null;
		}else {
			Ticket t=new Ticket();
			t.setPnr("111");
			t.setTicketstatus("booked");
			t.setTicketprice(100.00);
			
			return t;
		}
	}

}
