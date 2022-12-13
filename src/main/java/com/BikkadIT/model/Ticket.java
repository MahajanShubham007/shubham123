package com.BikkadIT.model;

public class Ticket {

	private String pnr;
	
	private String ticketstatus;
	
	private double ticketprice;

	public String getPnr() {
		return pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	public String getTicketstatus() {
		return ticketstatus;
	}

	public void setTicketstatus(String ticketstatus) {
		this.ticketstatus = ticketstatus;
	}

	public double getTicketprice() {
		return ticketprice;
	}

	public void setTicketprice(double ticketprice) {
		this.ticketprice = ticketprice;
	}

	@Override
	public String toString() {
		return "Ticket [pnr=" + pnr + ", ticketstatus=" + ticketstatus + ", ticketprice=" + ticketprice + "]";
	}
	
	
}
