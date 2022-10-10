package mocktest;

import java.util.Scanner;

class Ticket{
	private int ticketid,price;
	private static int availableTickets;
	private int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static int getAvailableTickets() {
		return availableTickets;
	}
	public static void setAvailableTickets(int availableTickets) {
		Ticket.availableTickets = availableTickets;
		if(availableTickets <0)
			System.out.println("No available tickets");
		
	}
	
	public  int calculateTicketCost(int nooftickets) {
		if(nooftickets<availableTickets) {
			availableTickets -= nooftickets;
			
			int totalAmount = nooftickets*this.price;
			return totalAmount;
		}
		else
			return -1;
	}
}
public class prgm5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of bookings:");
		int noofbookings = sc.nextInt();
		System.out.println("Enter the available tickets:");
		int availableTickets = sc.nextInt();
		Ticket.setAvailableTickets(availableTickets);
		for(int i=0;i<noofbookings;i++) {
			System.out.println("Enter the ticketid");
			int ticketid = sc.nextInt();
			System.out.println("Enter the price:");
			int price = sc.nextInt();
			System.out.println("Enter the no:of tickets:");
			int nooftickets = sc.nextInt();
			Ticket t = new Ticket();
			t.setTicketid(ticketid);
			t.setPrice(price);		
			System.out.println("Available tickets:"+Ticket.getAvailableTickets());
			int totalAmount = t.calculateTicketCost(nooftickets);
			System.out.println("Total amount:"+totalAmount);
			System.out.println("Available tickets after booking:"+Ticket.getAvailableTickets());
		} 
		

	}

}
